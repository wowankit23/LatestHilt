package com.test.codeglo.ui.maps

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.location.Location
import android.location.LocationListener
import android.location.LocationManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.EditText
import android.widget.ProgressBar
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.LatLngBounds
import com.google.android.gms.maps.model.Marker
import com.google.android.gms.maps.model.MarkerOptions
import com.test.codeglo.R
import com.test.codeglo.databinding.ActivityMapsBinding
import com.test.codeglo.utility.Constants
import com.test.codeglo.viewModel.MapsViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_maps.*
@AndroidEntryPoint
class   MapsActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var map: GoogleMap

    val zoomLevel = 15f

    // Declaring binding to Bind the activity_login XML to this activity
    private lateinit var binding: ActivityMapsBinding

    //Connecting activity to Map ViewModel
    private lateinit var viewModel: MapsViewModel

    var latitude: Double? = null
    var longitude: Double? = null


    //Connecting activity to Map ViewModel
    private var locationManager : LocationManager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps)

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)

        locationManager = getSystemService(LOCATION_SERVICE) as LocationManager?
        viewModel = ViewModelProvider(this).get(MapsViewModel::class.java)

    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    override fun onMapReady(googleMap: GoogleMap) {
        map = googleMap

        viewModel.enableMyLocation(this@MapsActivity, map!!)
        viewModel.updateCoordinates(applicationContext)

    }

    //Checks for location permission
    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<String>,
        grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (requestCode == viewModel.REQUEST_LOCATION_PERMISSION) {
            if (grantResults.contains(PackageManager.PERMISSION_GRANTED)) {
                viewModel.enableMyLocation(this, map)
            }
        }
    }

    //To show a toast message
    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    //Puts a marker at the current coordinate along with the note
    fun refresh() {
        val location = LatLng(viewModel.latitude, viewModel.longitude)
        val markerOptions = MarkerOptions().position(location)

        markerOptions.title(viewModel.note)
        map.addMarker(markerOptions)
        updateView(map, LatLng(viewModel.latitude, viewModel.longitude), LatLng(28.7041,77.1025))
        val locationDestination = LatLng(28.7041,77.1025)
        val markerOptionsDestination = MarkerOptions().position(locationDestination)

        markerOptionsDestination.title("DropOff")
        map.addMarker(markerOptionsDestination)
    }

    private fun updateView(map: GoogleMap,currentLocation:LatLng,droppedLocation: LatLng) {
        lifecycleScope.launchWhenStarted {
            val map = map ?: return@launchWhenStarted

            val lineOptions =
                viewModel.directionRepo.directionDataAsync(
                    options = viewModel.polylineOptions,
                    from = currentLocation,
                    to = droppedLocation
                )
                    ?: return@launchWhenStarted
            val points = lineOptions.points
            val bounds: LatLngBounds = LatLngBounds.Builder().apply {
                for (point in points)
                    include(point)
            }.build()
            map.animateCamera(CameraUpdateFactory.newLatLngBounds(bounds, Constants.padding))

            viewModel.mapAnimator.animateRoute(map, points)


        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.maps_menu, menu)
        return true
    }
    //  Enable selecting in options on Action bar
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here.
        val id = item.itemId



        if (id == R.id.action_refresh) {
            refresh()
            return true
        }



        return super.onOptionsItemSelected(item)

    }
}

package com.test.codeglo.viewModel

import android.Manifest
import android.annotation.SuppressLint
import android.app.Activity
import android.app.Application
import android.content.Context
import android.content.Context.LOCATION_SERVICE
import android.content.pm.PackageManager
import android.location.Location
import android.location.LocationListener
import android.location.LocationManager
import android.location.LocationProvider
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.getSystemService
import androidx.lifecycle.ViewModel
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.LocationSource
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.Marker
import com.google.android.gms.maps.model.MarkerOptions
import com.google.android.gms.maps.model.PolylineOptions
import com.test.codeglo.repository.Repository
import com.test.codeglo.utility.NetworkHelper
import com.test.codeglo.utility.maputility.DirectionRepo
import com.test.codeglo.utility.maputility.MapAnimator
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
@HiltViewModel
class MapsViewModel  @Inject constructor(private val repository: Repository, private val networkHelper: NetworkHelper, val directionRepo: DirectionRepo, val polylineOptions: PolylineOptions,val mapAnimator: MapAnimator) : ViewModel() {

    private var fusedLocationClient: FusedLocationProviderClient? = null

    var latitude : Double = 0.0
    var longitude : Double = 0.0
    var note : String = "Your note goes here!"
//    private lateinit var map: GoogleMap

    val REQUEST_LOCATION_PERMISSION = 1

    init {

    }

    //Checks for location permissions
     fun isPermissionGranted(context: Context) : Boolean {
        return ContextCompat.checkSelfPermission(
            context.applicationContext,
            Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED
    }

    //Sets zoom gesture and blue current live location dot in the map fragment
    @SuppressLint("MissingPermission")
    fun enableMyLocation(context: Context, map: GoogleMap) {
        if (isPermissionGranted(context)) {
            map.isMyLocationEnabled = true
            map.uiSettings.isZoomGesturesEnabled = true
        }
        else {
            ActivityCompat.requestPermissions(
                context as (Activity),
                arrayOf<String>(Manifest.permission.ACCESS_FINE_LOCATION),
                REQUEST_LOCATION_PERMISSION
            )
        }
    }

    //Gets coordinated using fused location provide and sets latitude and longitude
    fun updateCoordinates (context: Context) {
        if (ActivityCompat.checkSelfPermission(
                context.applicationContext,
                Manifest.permission.ACCESS_FINE_LOCATION
            ) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(
                context.applicationContext,
                Manifest.permission.ACCESS_COARSE_LOCATION
            ) != PackageManager.PERMISSION_GRANTED
        ) {
            return
        }
        fusedLocationClient = LocationServices.getFusedLocationProviderClient(context.applicationContext)

        fusedLocationClient?.lastLocation
            ?.addOnSuccessListener { location : Location? ->
                // Got last known location. In some rare situations this can be null.

                if (location != null) {
                    latitude = location.latitude
                    longitude = location.longitude
                }

            }
    }

    //Saves the parameter i.e. string to note variable
    fun save(string: String) {
        note = string
    }

}
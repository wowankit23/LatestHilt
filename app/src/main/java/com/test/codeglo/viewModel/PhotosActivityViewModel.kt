package com.test.codeglo.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.test.codeglo.model.UserAlbum
import com.test.codeglo.model.UserPhoto
import com.test.codeglo.repository.Repository
import com.test.codeglo.utility.NetworkHelper
import com.test.codeglo.utility.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject
@HiltViewModel
class PhotosActivityViewModel @Inject constructor(private val repository: Repository, private val networkHelper: NetworkHelper): ViewModel() {
    var userPhoto: MutableLiveData<Resource<ArrayList<UserPhoto>>> = MutableLiveData()


    fun getPhotos(userId:Int){
        viewModelScope.launch {
            userPhoto.postValue(Resource.loading(null))
            if (networkHelper.isNetworkConnected()) {
                repository.getPhotos(userId).let {
                    if (it.isSuccessful) {
                        userPhoto.postValue(Resource.success(it.body()))
                    } else userPhoto.postValue(Resource.error(it.errorBody().toString(), null))
                }
            } else userPhoto.postValue(Resource.error("No internet connection", null))
        }
    }
}
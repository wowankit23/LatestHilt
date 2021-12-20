package com.test.codeglo.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.test.codeglo.model.UserAlbum
import com.test.codeglo.repository.Repository
import com.test.codeglo.utility.NetworkHelper
import com.test.codeglo.utility.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject
@HiltViewModel
class AlbumsActivityViewModel @Inject constructor(private val repository: Repository, private val networkHelper: NetworkHelper): ViewModel() {
    var userAlbum: MutableLiveData<Resource<ArrayList<UserAlbum>>> = MutableLiveData()


    fun getAlbums(userId:Int){
        viewModelScope.launch {
            userAlbum.postValue(Resource.loading(null))
            if (networkHelper.isNetworkConnected()) {
                repository.getAlbums(userId).let {
                    if (it.isSuccessful) {
                        userAlbum.postValue(Resource.success(it.body()))
                    } else userAlbum.postValue(Resource.error(it.errorBody().toString(), null))
                }
            } else userAlbum.postValue(Resource.error("No internet connection", null))
        }
    }
}
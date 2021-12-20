package com.test.codeglo.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.test.codeglo.model.User
import com.test.codeglo.model.UserAlbum
import com.test.codeglo.model.UsersItem
import com.test.codeglo.repository.Repository
import com.test.codeglo.utility.NetworkHelper
import com.test.codeglo.utility.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.InternalCoroutinesApi
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import org.w3c.dom.Comment
import retrofit2.Response
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val repository: Repository,
    private val networkHelper: NetworkHelper
) : ViewModel() {

    var usersResponse: MutableLiveData<Resource<ArrayList<UsersItem>>> = MutableLiveData()
     val usersResponseFLOW = MutableLiveData<Resource<User>>()

    fun getUsers() {
        viewModelScope.launch {
            usersResponse.postValue(Resource.loading(null))
            if (networkHelper.isNetworkConnected()) {
                repository.getUsers().let {
                    if (it.isSuccessful) {
                        usersResponse.postValue(Resource.success(it.body()))
                    } else usersResponse.postValue(Resource.error(it.errorBody().toString(), null))
                }
            } else usersResponse.postValue(Resource.error("No internet connection", null))
        }
    }

    @InternalCoroutinesApi
    fun getUsersFLOW() {
        viewModelScope.launch {
            repository.getUsersWithFLOW().catch { }.collect { value ->
                usersResponseFLOW.value = value
            }


        }
    }
}





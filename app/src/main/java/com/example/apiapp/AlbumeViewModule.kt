package com.example.apiapp

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AlbumeViewModule @Inject constructor(private val albumRebo: AlbumRebo): ViewModel() {

    //to update
  private val _albums=MutableLiveData<List<Album>>()

    val album:LiveData<List<Album>> get() =_albums


    fun fetchAlbums(){
        viewModelScope.launch{
            val response=albumRebo.getAlbums()

            _albums.postValue(response)

        }
    }


}
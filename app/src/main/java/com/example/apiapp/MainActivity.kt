package com.example.apiapp

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import coil.load

import com.example.apiapp.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var viewModule: AlbumeViewModule
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        viewModule= ViewModelProvider(this).get(AlbumeViewModule::class.java)
        setContentView(binding.root)
        viewModule.fetchAlbums()
        viewModule.album.observe(this, Observer {
            for (i in it){
                Log.i("test",i.title)
                Log.i("test",i.id.toString())
                Log.i("test",i.userId.toString())
            }

        })
/*
binding.image
    .load("https://static.vecteezy.com/system/resources/previews/021/830/103/large_2x/realistic-cute-cat-cartoon-style-digital-artwork-free-png.png")
*/


    }
}
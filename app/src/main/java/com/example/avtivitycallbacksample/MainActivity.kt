package com.example.avtivitycallbacksample

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

class MainActivity : AppCompatActivity() {
    val msg="MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(msg,"In on create function")
    }

    override fun onStart() {
        super.onStart()
        Log.d(msg,"In on start function")
    }

    override fun onResume() {
        super.onResume()
        Log.d(msg,"In on resume function")
    }

    override fun onPause() {
        super.onPause()
        Log.d(msg,"In on pause function")
    }

    override fun onStop() {
        super.onStop()
        Log.d(msg,"In on stop function")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(msg,"In on restart function")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(msg,"In on destroy function")
    }

    fun clicked(view : View){
        val i=Intent(this, SecondActivity::class.java)
        startActivity(i)
      //  Intent i=new Intent(this,SecondActivity.class)
    }
}

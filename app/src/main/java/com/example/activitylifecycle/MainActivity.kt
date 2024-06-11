package com.example.activitylifecycle

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.activitylifecycle.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val TAG = "StateChange"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Log.i(TAG,"onCreate state")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG,"onResume state")
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG,"onStart state")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(TAG,"onRestart state")
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG,"onStop state")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG,"onDestroy state")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.i(TAG,"onSaveInstance state")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.i(TAG,"onRestoreInstance state")
    }
}
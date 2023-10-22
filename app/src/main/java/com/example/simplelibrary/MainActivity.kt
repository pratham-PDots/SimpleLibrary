package com.example.simplelibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mylibrary.LibTest

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        LibTest().start(this)
    }
}
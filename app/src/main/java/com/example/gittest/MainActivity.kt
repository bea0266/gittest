package com.example.gittest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        print("master branch")
        print("add develop branch")
        print("bug fixed")


    }

    fun addfnc1(){
        print("add fnc1")
    }

    fun addfnc2() {
        print("add fnc2")
    }
}
package com.tech.buttontest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    //this method will exceute after clicking on first button
    fun buttonFirst(view: View) {
        //notification method in android. shows text for 1 or 2 second
        Toast.makeText(this, "button first clicked", Toast.LENGTH_SHORT).show()
    }
}
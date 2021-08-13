package com.tech.buttontest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //this block will exceute after clicking on 2nd button(2)
        btn2.setOnClickListener {
            Toast.makeText(this, "button second clicked", Toast.LENGTH_SHORT).show()
        }

        btn3.setOnClickListener(this)
        btn4.setOnClickListener(this)

    }

    //this method will exceute after clicking on first button(1)
    fun buttonFirst(view: View) {
        //notification method in android. shows text for 1 or 2 second
        Toast.makeText(this, "button first clicked", Toast.LENGTH_SHORT).show()
    }

    override fun onClick(view: View?) {
        when(view?.id)
        {
            R.id.btn3-> Toast.makeText(this, "button third clicked", Toast.LENGTH_SHORT).show()
            R.id.btn4-> Toast.makeText(this, "button forth clicked", Toast.LENGTH_SHORT).show()
        }
    }

}
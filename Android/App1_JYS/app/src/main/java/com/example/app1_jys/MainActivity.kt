package com.example.app1_jys

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Layout

        val btn_event = findViewById<Button>(R.id.PushBt)
        val txt = findViewById<TextView>(R.id.MainText)

        btn_event.setOnClickListener{
            txt.visibility = View.VISIBLE
        }


    }

}



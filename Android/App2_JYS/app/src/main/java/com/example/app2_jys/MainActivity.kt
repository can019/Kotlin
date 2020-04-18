package com.example.app2_jys

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Environment
import android.os.Environment.getExternalStoragePublicDirectory
import android.provider.MediaStore
import android.util.Log
import android.widget.Button
import androidx.annotation.RequiresApi
import java.io.File
import java.nio.file.Paths

class MainActivity : AppCompatActivity() {

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.Search_BT)
        button.setOnClickListener{
            hi()
        }
    }

 @RequiresApi(Build.VERSION_CODES.O)
 fun hi() {
     println("clicked!!!")
     val FirstPath = Environment.DIRECTORY_DOWNLOADS
     val SecondPath = Paths.get("")
     val path = System.getProperty("user.dir")
     println("Working Directory = $path")
     println(FirstPath)
     println(SecondPath)

     File(FirstPath).walkTopDown().forEach { println(it) }

 }

}



package com.example.administrator.kotlindemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //
        findViewById<Button>(R.id.btn1).setOnClickListener{
            Toast.makeText(this,"hello kotlin",Toast.LENGTH_LONG);
        }
    }
}

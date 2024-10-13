package com.example.oygoyg

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class ThirdActivity : AppCompatActivity() {

        private lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.resultactivity)

        button = findViewById(R.id.button3)

        button.setOnClickListener{


            Toast.makeText(this,"Success",Toast.LENGTH_SHORT).show()


        }
    }
}
package com.example.oygoyg

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat.startActivity
import com.google.android.gms.wearable.Wearable

class Firstscreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_firstscreen)
    }

    fun next_activity(view: View) {

                val intent= Intent(this,SecondActivity::class.java)
        startActivity(intent)


    }
}
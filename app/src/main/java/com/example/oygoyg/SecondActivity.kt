package com.example.oygoyg

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class SecondActivity : AppCompatActivity() {


    private lateinit var email:EditText
    private lateinit var password:EditText
    private lateinit var sharedpreference: SharedPreferences
    private lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        email=findViewById(R.id.emailtext)
        password=findViewById(R.id.passwordtext)
        sharedpreference= getSharedPreferences("user_data", MODE_PRIVATE)
        button = findViewById(R.id.button2)

        val provemail = sharedpreference.getString("email",null)
        val provpassword = sharedpreference.getString("password",null)
        if(provemail!=null&&provpassword!=null)
        {
            val intent = Intent(this,ThirdActivity::class.java)
            startActivity(intent)
        }

        button.setOnClickListener{

            if(email.text.toString()!=""&&password.text.toString()!="") {

                val login = email.text.toString()
                val passwordshared = password.text.toString()

                with(sharedpreference.edit()) {


                    putString("email", login)
                    putString("password", passwordshared)
                    apply()


                }
                val intent = Intent(this,ThirdActivity::class.java)
                startActivity(intent)
                Toast.makeText(this,"Success",Toast.LENGTH_SHORT).show()
            }
            else
            {
                Toast.makeText(this,"Есть пустые поля",Toast.LENGTH_SHORT).show()
            }


        }



    }



}


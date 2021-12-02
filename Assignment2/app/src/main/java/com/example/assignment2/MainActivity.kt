package com.example.assignment2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    var clickCount = 0
    var count=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val clickCountDisplayView=findViewById<TextView>(R.id.clickCountView)
        val clickMeButton = findViewById<TextView>(R.id.clickButton)
        val userNameTextInputView=findViewById<TextInputLayout>(R.id.nameText)
        val numberMapValue = mutableMapOf("Somebody" to 0 )





        clickMeButton.setOnClickListener{

            var userName =  userNameTextInputView.editText?.text.toString()
            if(userName.isNullOrEmpty()){
                userName = "Somebody"
            }
            if(!numberMapValue.containsKey(userName)){
                numberMapValue.put(userName,1)
            }
            else{

                count = numberMapValue[userName]!!
                count++
                numberMapValue[userName]=count

            }

            count = numberMapValue[userName]!!

            clickCountDisplayView.text = "$userName Clicked $count times"

        }
    }
}



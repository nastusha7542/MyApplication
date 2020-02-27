package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import com.example.myapplication.Main2Activity as Main2Activity

class MainActivity : AppCompatActivity() {
    var x = 0
    var bal=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        slozhenie()

    }

    fun slozhenie() {
        var a = (10..100).random()
        var b = (10..100).random()
        textView2.setText("$a+$b")
        x = a + b
        textView3.setText("$x")

    }

    fun TrueFalse(view: View) {

        if ("$x" in editText.text.toString() ) {
            textView.setText("Молодец!")
            bal++
        } else {
            textView.setText("Неверно!")
        }

         if (bal<3) {
             editText.setText("")
             slozhenie()
         }
            else {
                var intent= Intent(this,Main2Activity::class.java)
                startActivity(intent)}
        }
    }




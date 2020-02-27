package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main4.*

class Main4Activity : AppCompatActivity() {
    var x = 0
    var bal=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        delenie()
    }
    fun delenie() {
        var b = (1..10).random()
        x = (1..10).random()
        var a = 0
        a = b*x

        textView12.setText("$a/$b")
        x = a / b
        textView10.setText("$x")

    }

    fun TrueFalse(view: View) {

        if ("$x" in editText4.text.toString() ) {
            textView11.setText("Молодец!")
            bal++
        } else {
            textView11.setText("Неверно!")
        }

        if (bal<3) {
            editText4.setText("")
           delenie()
        }
        else {
            var intent= Intent(this,Main5Activity::class.java)
            startActivity(intent)}
    }
}




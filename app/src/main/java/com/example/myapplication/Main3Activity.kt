package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main3.*

class Main3Activity : AppCompatActivity() {
    var x = 0
    var bal=0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        umnozenie()

    }
    fun umnozenie() {
        var a = (1..10).random()
        var b = (1..10).random()
        textView9.setText("$a*$b")
        x = a * b
        textView7.setText("$x")

    }

    fun TrueFalse(view: View) {

        if ("$x" in editText3.text.toString() ) {
            textView8.setText("Молодец!")
            bal++
        } else {
            textView8.setText("Неверно!")
        }

        if (bal<3) {
            editText3.setText("")
            umnozenie()
        }
        else {
            var intent= Intent(this,Main4Activity::class.java)
            startActivity(intent)}
    }
}

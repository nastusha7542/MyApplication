package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {
    var x = 0
    var bal = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        vychitanie()
    }

    fun vychitanie() {
        var a = (10..100).random()
        var b = (10..100).random()
        if (a < b) {
            x = b - a
            textView6.setText("$b-$a")
        } else {
            x = a - b
            textView6.setText("$a-$b")
        }
        textView4.setText("$x")
    }
    fun TrueFalse2(view: View) {
        if ( "$x" in editText2.text.toString() ) {
            textView5.setText("Молодец!")
            bal++
        }
         else {
            textView5.setText("Неверно!")
        }
        if (bal < 3) {
            editText2.setText("")
            vychitanie()}
         else {
            var intent = Intent(this, Main3Activity::class.java)
            startActivity(intent)
        }
    }
}




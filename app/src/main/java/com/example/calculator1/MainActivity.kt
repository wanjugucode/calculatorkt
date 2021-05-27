package com.example.calculator1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var answer = findViewById<TextView>(R.id.tvAnswer)
        var num1 = findViewById<EditText>(R.id.etNum1)
        var num2 = findViewById<EditText>(R.id.etNum2)

        var button1 = findViewById<Button>(R.id.btnDivide)
        var button2 = findViewById<Button>(R.id.btnAdd)
        var button3 = findViewById<Button>(R.id.btnModulus)
        var button4 = findViewById<Button>(R.id.btnMultiply)


        button1.setOnClickListener {
            Toast.makeText(baseContext,"put Number", Toast.LENGTH_LONG).show()

            var num1 = num1.text.toString().toInt()
            var num2 = num2.text.toString().toInt()
            var result = num1 / num2

            answer.text = ("answer $result")
        }


        button2.setOnClickListener {
            Toast.makeText(baseContext,"put Number", Toast.LENGTH_LONG).show()
            var num1 = num1.text.toString().toInt()
            var num2 = num2.text.toString().toInt()
            var result =num1+num2
            answer.text = ("answer $result")


        }
        button3.setOnClickListener {
            Toast.makeText(baseContext,"put Number", Toast.LENGTH_LONG).show()
            var num1 = num1.text.toString().toInt()
            var num2 = num2.text.toString().toInt()
            var result = num1 % num2
            answer.text = ("answer $result")

        }
        button4.setOnClickListener{
            Toast.makeText(baseContext,"put Number", Toast.LENGTH_LONG).show()
            var num1=num1.text.toString().toInt()
            var num2=num2.text.toString().toInt()
            var result=num1*num2
            answer.text = ("answer $result")

        }
    }
}
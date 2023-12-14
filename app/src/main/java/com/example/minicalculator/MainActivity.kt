package com.example.minicalculator

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

        val n1:EditText = findViewById(R.id.n1)
        val n2:EditText = findViewById(R.id.n2)
        val symbol:TextView = findViewById(R.id.symbol)
        val sum:TextView = findViewById(R.id.sum)
        val plus:Button = findViewById(R.id.plus)
        val minus:Button = findViewById(R.id.minus)
        val multiply:Button = findViewById(R.id.multiply)
        val divider:Button = findViewById(R.id.divider)
        val modulo:Button = findViewById(R.id.modulo)
        val clear:Button = findViewById(R.id.clear)

        plus.setOnClickListener {
            if(n1.text.toString() == "" || n2.text.toString() == ""){
                Toast.makeText(this,"Please input num1 and num2!!",Toast.LENGTH_SHORT).show()
                n1.setText("")
                n2.setText("")
            }else{
                var x = n1.text.toString().toInt() + n2.text.toString().toInt()
                symbol.setText("+")
                sum.setText(x.toString())
            }
        }

        minus.setOnClickListener {
            if(n1.text.toString() == "" || n2.text.toString() == ""){
                Toast.makeText(this,"Please input num1 and num2!!",Toast.LENGTH_SHORT).show()
                n1.setText("")
                n2.setText("")
            }else{
                var x = n1.text.toString().toInt() - n2.text.toString().toInt()
                symbol.setText("-")
                sum.setText(x.toString())
            }
        }

        multiply.setOnClickListener {
            if(n1.text.toString() == "" || n2.text.toString() == ""){
                Toast.makeText(this,"Please input num1 and num2!!",Toast.LENGTH_SHORT).show()
                n1.setText("")
                n2.setText("")
            }else{
                var x = n1.text.toString().toInt() * n2.text.toString().toInt()
                symbol.setText("x")
                sum.setText(x.toString())
            }
        }

        divider.setOnClickListener {
            if(n1.text.toString() == "" || n2.text.toString() == ""){
                Toast.makeText(this,"Please input num1 and num2!!",Toast.LENGTH_SHORT).show()
                n1.setText("")
                n2.setText("")
            }else {
                var x = n1.text.toString().toDouble() / n2.text.toString().toDouble()
                symbol.setText("/")
                sum.setText(x.toString())
            }
        }

        modulo.setOnClickListener {
            if(n2.text.toString() == ""){
                Toast.makeText(this,"Don't lets num2 emtpy and 0",Toast.LENGTH_SHORT).show()
                n1.setText("")
                n2.setText("")
            }else {
                var x = n1.text.toString().toDouble() % n2.text.toString().toDouble()
                symbol.setText("mod")
                sum.setText(x.toString())
            }
        }

        clear.setOnClickListener {
            n1.setText("")
            n2.setText("")
            symbol.setText("")
            sum.setText("")
        }
    }
}
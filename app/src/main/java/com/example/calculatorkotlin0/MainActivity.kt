package com.example.calculatorkotlin0

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    private lateinit var result:TextView
    private lateinit var num1:EditText
    private lateinit var num2:EditText
    private lateinit var  plusBtn:Button
    private lateinit var  minusBtn:Button
    private lateinit var   dividedBtn:Button
    private lateinit var   multipliedBtn:Button
    private var num14=0
    private var num15=0
    private var resultOfNum1AndNum2=0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        result=findViewById(R.id.result_TextView)
        num1=findViewById(R.id.num1TextNumber)
        num2=findViewById(R.id.num2TextNumber2)
        plusBtn=findViewById(R.id.plus_Btn)
        minusBtn=findViewById(R.id.minus_Btn)
        dividedBtn=findViewById(R.id.divided_Btn)
        multipliedBtn=findViewById(R.id.multiplied_Btn)



        math()

    }

    private fun math() {
        plusBtn.setOnClickListener {
            nums()
            resultOfNum1AndNum2 = num14 + num15
            result.setText("$num14+$num15=$resultOfNum1AndNum2")
        }
        multipliedBtn.setOnClickListener {
            nums()
            resultOfNum1AndNum2 = num14 * num15
            result.setText("$num14 X $num15=$resultOfNum1AndNum2")
        }
        minusBtn.setOnClickListener {
            nums()
            resultOfNum1AndNum2 = num14 - num15
            result.setText("$num14-$num15=$resultOfNum1AndNum2")
        }
        dividedBtn.setOnClickListener {
            nums()
            resultOfNum1AndNum2 = num14 / num15
            result.setText("$num14÷$num15=$resultOfNum1AndNum2")
        }
    }

    private fun nums() {
        try {
        num14 = num1.text.toString().toInt()
        num15 = num2.text.toString().toInt()}
        catch (e:Exception){
            Toast.makeText(this, "Please Enter  Numbers First", Toast.LENGTH_SHORT).show()

        }
    }
}
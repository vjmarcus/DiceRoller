package com.freshappbooks.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton : Button = findViewById(R.id.roll_button)
        rollButton.text = "Let's Roll!"
        rollButton.setOnClickListener {
            rollDice()
        }

    }

    private fun rollDice() {
        val resultText : TextView = findViewById(R.id.result_text)
        val randomint = Random.nextInt(6) + 1
        resultText.text = randomint.toString()

    }
}

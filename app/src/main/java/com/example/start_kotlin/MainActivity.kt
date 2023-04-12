package com.example.start_kotlin

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val resultImage : ImageView = findViewById(R.id.dice_image)
        val rollButton : Button = findViewById(R.id.roll_button)
        val resultText : TextView = findViewById(R.id.result_text)
        rollButton.setOnClickListener {
            val randomInt = (1..6).random()
            val drawableResource = when (randomInt) {
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                else -> R.drawable.dice_6
            }
            resultText.text = randomInt.toString()
            resultImage.setImageResource(drawableResource)
        }
    }

//    private fun rollDice() {
//        Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()
//    }

}
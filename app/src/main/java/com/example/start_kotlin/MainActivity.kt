package com.example.start_kotlin

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val resultImage1 : ImageView = findViewById(R.id.dice_image1)
        val resultImage2 : ImageView = findViewById(R.id.dice_image2)
        val rollButton : Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener {view ->
            Snackbar.make(view, "onClicked", Snackbar.LENGTH_LONG).setAction("Action",null).show()
            val randomInt1 = (1..6).random()
            val drawableResource1 = when (randomInt1) {
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                else -> R.drawable.dice_6
            }
            val randomInt2 = (1..6).random()
            val drawableResource2 = when (randomInt2) {
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                else -> R.drawable.dice_6
            }
            resultImage1.setImageResource(drawableResource1)
            resultImage2.setImageResource(drawableResource2)
        }
    }

//    private fun rollDice() {
//        Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()
//    }

}
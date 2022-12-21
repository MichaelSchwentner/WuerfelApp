package com.example.wrfelapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button_button)
        button.setOnClickListener{
            wuerfelFunktion()
        }
    }
    fun wuerfelFunktion (){

        val würfel = findViewById<ImageView>(R.id.Würfel_Image)
        var lucktext = findViewById<TextView>(R.id.lucktext_text)

            val random = (1..7).random()
            lucktext.text = ""

            when (random){

                1 -> würfel.setImageResource(R.drawable.dice_1)
                2 -> würfel.setImageResource(R.drawable.dice_2)
                3 -> würfel.setImageResource(R.drawable.dice_3)
                4 -> würfel.setImageResource(R.drawable.dice_4)
                5 -> würfel.setImageResource(R.drawable.dice_5)
                6 -> {würfel.setImageResource(R.drawable.dice_6)
                 lucktext.text = "You are lucky"
                }
                7 -> {würfel.setImageResource(R.drawable.dice_7)
                    lucktext.text = "You are a looser"
                }

        }
    }
}
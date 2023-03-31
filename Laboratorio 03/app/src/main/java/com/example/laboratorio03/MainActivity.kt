package com.example.laboratorio03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var counter: Double = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val coin5ImageView: ImageView = findViewById(R.id.five_cents_image)
        val coin10ImageView: ImageView = findViewById(R.id.ten_cents_image)
        val coin25ImageView: ImageView = findViewById(R.id.quarter_cents_image)
        val dollarImageView: ImageView = findViewById(R.id.one_dollar_image)

        val counterTextView: TextView = findViewById(R.id.counterTextView)
        counterTextView.text = counter.toString()

        coin5ImageView.setOnClickListener {
            counter += 0.05
            counterTextView.text = counter.toString()
        }

        coin10ImageView.setOnClickListener {
            counter += 0.10
            counterTextView.text = counter.toString()
        }

        coin25ImageView.setOnClickListener {
            counter += 0.25
            counterTextView.text = counter.toString()
        }

        dollarImageView.setOnClickListener {
            counter += 1.00
            counterTextView.text = counter.toString()
        }
    }
}
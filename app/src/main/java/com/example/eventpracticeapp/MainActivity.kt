package com.example.eventpracticeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {

    private lateinit var editTextName: EditText
    private lateinit var editTextAge: EditText
    private lateinit var buttonSubmit: Button
    private lateinit var textViewOutput: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize UI
        editTextName = findViewById(R.id.editTextName)
        editTextAge = findViewById(R.id.editTextAge)
        buttonSubmit = findViewById(R.id.buttonSubmit)
        textViewOutput = findViewById(R.id.textViewOutput)

        buttonSubmit.setOnClickListener {
            handleSubmit()
        }
    }

    private fun handleSubmit() {
        val name = editTextName.text.toString().trim()
        val ageStr = editTextAge.text.toString().trim()

        // Check for empty fields
        if (name.isEmpty() || ageStr.isEmpty()) {
            textViewOutput.text = "Please fill in all fields."
            textViewOutput.setTextColor(ContextCompat.getColor(this, android.R.color.holo_red_dark))
            return
        }

        // Validate numeric input for age
        try {
            val age = ageStr.toInt()
            val message = "Hello $name! You are $age years old."
            textViewOutput.text = message
            textViewOutput.setTextColor(ContextCompat.getColor(this, android.R.color.holo_blue_dark))
        } catch (e: NumberFormatException) {
            textViewOutput.text = "Invalid age. Please enter a number."
            textViewOutput.setTextColor(ContextCompat.getColor(this, android.R.color.holo_red_dark))
        }
    }
}

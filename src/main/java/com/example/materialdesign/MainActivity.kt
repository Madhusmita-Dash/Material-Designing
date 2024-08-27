package com.example.materialdesign

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Get references to the TextInputLayouts and Buttons
        val usernameLayout: TextInputLayout = findViewById(R.id.msd)
        val passwordLayout: TextInputLayout = findViewById(R.id.password_layout)
        val numberLayout: TextInputLayout = findViewById(R.id.number_layout)

        val usernameEditText: TextInputEditText = usernameLayout.editText as TextInputEditText
        val passwordEditText: TextInputEditText = passwordLayout.editText as TextInputEditText
        val numberEditText: TextInputEditText = numberLayout.editText as TextInputEditText

        val resetButton: Button = findViewById(R.id.button)
        val loginButton: Button = findViewById(R.id.button4)

        // Set up the Reset button to clear all input fields
        resetButton.setOnClickListener {
            usernameEditText.text?.clear()
            passwordEditText.text?.clear()
            numberEditText.text?.clear()
            Toast.makeText(this, "Fields reset", Toast.LENGTH_SHORT).show()
        }

        // Set up the Login button to show a simple message
        loginButton.setOnClickListener {
            val username = usernameEditText.text.toString()
            val password = passwordEditText.text.toString()
            val number = numberEditText.text.toString()

            // Here you can add your login logic
            if (username.isNotEmpty() && password.isNotEmpty() && number.isNotEmpty()) {
                Toast.makeText(this, "Login successful!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Please fill out all fields", Toast.LENGTH_SHORT).show()
            }
        }
    }
}

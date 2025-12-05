package com.example.studytracker

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SignupActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signup)

        // Input fields
        val editTextEmail = findViewById<EditText>(R.id.editTextEmail)
        val editTextPassword = findViewById<EditText>(R.id.editTextPassword)
        val checkBoxRemember = findViewById<CheckBox>(R.id.checkBox5)

        // Buttons
        val buttonSignup = findViewById<Button>(R.id.btn_signup)
        val buttonGoogleLogin = findViewById<Button>(R.id.buttonGoogleLogin)

        // TextViews
        val textViewLogin = findViewById<TextView>(R.id.textView61)

        // Handle Signup button
        buttonSignup.setOnClickListener {
            val email = editTextEmail.text.toString().trim()
            val password = editTextPassword.text.toString().trim()

            if (email.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Please enter all fields", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Signup successful!", Toast.LENGTH_SHORT).show()


                val intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)
                finish()
            }
        }

    }
}

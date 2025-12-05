package com.example.studytracker

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.profile)

        // Bottom navigation clicks
        findViewById<ImageView>(R.id.nav_home).setOnClickListener {
            startActivity(Intent(this, HomeActivity::class.java))
        }
        findViewById<ImageView>(R.id.nav_calendar).setOnClickListener {
            startActivity(Intent(this, CalendarActivity::class.java))
        }
        findViewById<ImageView>(R.id.nav_progress).setOnClickListener {
            startActivity(Intent(this, ProgressActivity::class.java))
        }
        findViewById<ImageView>(R.id.nav_profile).setOnClickListener {
            // Already on Profile
        }

        // Sign out button
        findViewById<Button>(R.id.button3).setOnClickListener {
            // Handle sign out logic here
        }
    }
}

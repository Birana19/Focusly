package com.example.studytracker

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class OnboardingActivity : AppCompatActivity() {
    lateinit var viewPager: androidx.viewpager2.widget.ViewPager2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding)

        viewPager = findViewById(R.id.viewPager)
        viewPager.adapter = OnboardingAdapter(this)
    }
}


package com.example.studytracker

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class OnboardingFragment1 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.onboarding_screen1, container, false)

        val nextBtn = view.findViewById<Button>(R.id.btn_next)
        nextBtn.setOnClickListener {
            (activity as OnboardingActivity).viewPager.currentItem = 1
        }

        return view
    }
}

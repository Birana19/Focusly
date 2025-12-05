package com.example.studytracker

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class OnboardingFragment2 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.onboarding_screen2, container, false)

        val nextBtn = view.findViewById<Button>(R.id.btn_next2)
        nextBtn.setOnClickListener {
            (activity as OnboardingActivity).viewPager.currentItem = 2
        }

        return view
    }
}

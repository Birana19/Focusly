package com.example.studytracker

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class OnboardingFragment3 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.onboarding_screen3, container, false)

        val startBtn = view.findViewById<Button>(R.id.btn_next)
        startBtn.setOnClickListener {
            val intent = Intent(activity, LetsBeginActivity::class.java)
            startActivity(intent)
            activity?.finish()
        }

        return view
    }
}

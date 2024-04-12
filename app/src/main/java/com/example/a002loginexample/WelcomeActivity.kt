package com.example.a002loginexample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.a002loginexample.databinding.ActivityWelcomeBinding

class WelcomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityWelcomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityWelcomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val sessionToken = intent.getStringExtra("SESSION_TOKEN")

        binding.sessionTokenTextView.text =  sessionToken

    }
}
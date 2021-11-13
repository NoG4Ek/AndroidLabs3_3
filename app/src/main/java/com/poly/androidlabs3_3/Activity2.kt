package com.poly.androidlabs3_3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.poly.androidlabs3_3.databinding.Activity2Binding

class Activity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = Activity2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bnToThird.setOnClickListener {
            goToThird()
        }

        binding.bnToFirst.setOnClickListener {
            finish()
        }

        binding.bnToAbout.setOnClickListener {
            goToAbout()
        }
    }

    private fun goToThird() {
        val intent = Intent(this, Activity3::class.java)
        startActivity(intent)
    }

    private fun goToAbout() {
        val intent = Intent(this, ActivityAbout::class.java)
        startActivity(intent)
    }
}
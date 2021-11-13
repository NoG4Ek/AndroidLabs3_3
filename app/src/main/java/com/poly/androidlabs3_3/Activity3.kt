package com.poly.androidlabs3_3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.poly.androidlabs3_3.databinding.Activity3Binding

class Activity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = Activity3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bnToSecond.setOnClickListener {
            finish()
        }

        binding.bnToFirst.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java, )
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
            startActivity(intent)
        }

        binding.bnToAbout.setOnClickListener {
            goToAbout()
        }
    }

    private fun goToAbout() {
        val intent = Intent(this, ActivityAbout::class.java)
        startActivity(intent)
    }
}
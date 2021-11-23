package com.poly.androidlabs3_3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.poly.androidlabs3_3.databinding.Activity3Binding
import androidx.core.view.GravityCompat

import android.view.View
import androidx.appcompat.app.ActionBarDrawerToggle

import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView


class Activity3 : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = Activity3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val navigationView = findViewById<View>(R.id.nav_view) as NavigationView
        navigationView.setNavigationItemSelectedListener(this)

        binding.bnToSecond.setOnClickListener {
            finish()
        }

        binding.bnToFirst.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
            startActivity(intent)
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        val navigationView = findViewById<NavigationView>(R.id.nav_view)
        navigationView.bringToFront()
        val drawer = findViewById<View>(R.id.drawer_layout) as DrawerLayout
        drawer.closeDrawer(GravityCompat.START)
        return when (item.itemId) {
            R.id.activityAbout -> {
                goToAbout()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun goToAbout() {
        val intent = Intent(this, ActivityAbout::class.java)
        startActivity(intent)
    }
}
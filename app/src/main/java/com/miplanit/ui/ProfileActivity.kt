package com.miplanit.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.miplanit.R
import com.miplanit.databinding.ActivityProfileBinding

class ProfileActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var binding: ActivityProfileBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_profile)
        initialiser()
    }

    private fun initialiser() {
        binding.tvContinue.setOnClickListener(this)
        binding.tvSkipForNow.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.tvSkipForNow -> {
                startActivity(Intent(this, ImportCalenderActivity::class.java))
            }
            R.id.tvContinue -> {
                startActivity(Intent(this, ImportCalenderActivity::class.java))
            }
        }
    }
}
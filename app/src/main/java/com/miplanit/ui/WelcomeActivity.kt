package com.miplanit.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.miplanit.R
import com.miplanit.databinding.ActivityWelcomeBinding

class WelcomeActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var binding: ActivityWelcomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_welcome)
        initializer()
    }

    private fun initializer() {
        binding.layLogin.setOnClickListener(this)
        binding.laySignup.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        when (view.id) {

            R.id.layLogin -> {
                startActivity(Intent(this, LoginActivity::class.java))
            }
            R.id.laySignup -> {
                startActivity(Intent(this, SignupActivity::class.java))
            }
        }
    }
}
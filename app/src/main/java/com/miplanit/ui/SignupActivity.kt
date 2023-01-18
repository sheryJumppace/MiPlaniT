package com.miplanit.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.miplanit.R
import com.miplanit.databinding.ActivitySignupBinding

class SignupActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var binding: ActivitySignupBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_signup)
        initializer()
    }

    private fun initializer() {
        binding.tvSignup.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        when (view.id) {
            R.id.tvSignup -> {
                startActivity(Intent(this, OTPActivity::class.java))
            }
        }
    }
}
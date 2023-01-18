package com.miplanit.ui

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.miplanit.R
import com.miplanit.databinding.ActivityOtpactivityBinding
import `in`.aabhasjindal.otptextview.OTPListener


class OTPActivity : AppCompatActivity() {
    lateinit var binding: ActivityOtpactivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_otpactivity)

        initializer()
    }

    private fun initializer() {
        binding.otpView.otpListener = object : OTPListener {
            override fun onInteractionListener() {
                binding.icVerified.visibility = View.GONE
            }

            override fun onOTPComplete(otp: String) {
                binding.icVerified.visibility = View.VISIBLE
            }

        }

    }
}
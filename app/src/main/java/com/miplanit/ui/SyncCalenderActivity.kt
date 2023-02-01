package com.miplanit.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.miplanit.R
import com.miplanit.databinding.ActivitySyncCalenderBinding

class SyncCalenderActivity : AppCompatActivity() {
    lateinit var binding: ActivitySyncCalenderBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_sync_calender)
    }
}
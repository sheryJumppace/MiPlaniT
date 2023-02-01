package com.miplanit.ui

import android.content.Intent
import android.graphics.Typeface
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.miplanit.R
import com.miplanit.customviews.ioslike_dialog.dialog.DialogNormal
import com.miplanit.customviews.ioslike_dialog.model.DialogTextStyle
import com.miplanit.databinding.ActivityImportCalenderBinding


class ImportCalenderActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var binding: ActivityImportCalenderBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_import_calender)
        initialiser()
    }

    private fun initialiser() {
        binding.tvSkipForNow.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.tvSkipForNow -> {
//              fsdfsdf

                DialogNormal(this)
                    .setTitle("“MiPlanIt Calendar” Wants to Use “google.com” to Sign In")
                    .setTitleClickListener { v2 ->
//                        Toast.makeText(this, "点击标题", Toast.LENGTH_SHORT).show()
                    }

                    .setContent("This allows the app and website to share information about you.") { v2 ->
//                        Toast.makeText(this, "点击内容", Toast.LENGTH_SHORT).show()
                    }

                    .setConfirm("Continue") { v2 ->
                        startActivity(Intent(this@ImportCalenderActivity , SyncCalenderActivity::class.java))
                    }

                    .setCancel(
                        "Cancel",
                        { v2 -> Toast.makeText(this, "点击取消", Toast.LENGTH_SHORT).show() },
                        true
                    )
                    .setCancelStyle(
                        DialogTextStyle.Builder(this).color(R.color.ios_like_red)
                            .typeface(Typeface.create(Typeface.SANS_SERIF, Typeface.NORMAL))
                            .build()
                    )
                    .setConfirmStyle(
                        DialogTextStyle.Builder(this).color(R.color.ios_like_blue)
                            .typeface(Typeface.create(Typeface.SANS_SERIF, Typeface.NORMAL)).build()
                    )
                    .setCanceledOnTouchOutside(true)
                    .show()


//              fsdfsdf
            }
        }
    }
}
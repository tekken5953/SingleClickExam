package com.example.singleclickexam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var count = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn: Button = findViewById(R.id.clickBtn)
        val tv: TextView = findViewById(R.id.countTextView)

        btn.setOnClickListener(object : OnSingleClickListener() {
            override fun onSingleClick(v: View?) {
                count++
                tv.text = count.toString()
            }
        })
    }
}
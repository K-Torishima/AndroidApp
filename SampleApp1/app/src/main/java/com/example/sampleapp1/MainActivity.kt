package com.example.sampleapp1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

// 続きはこちらから
// https://developer.android.com/training/basics/firstapp/starting-activity?hl=ja
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun sendMassage(view: View) {
    }
}
package com.example.formappt2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun showMessage(v: View) {
        if (v.id == R.id.btnSend) {
            val intent= Intent(this@MainActivity, NextActivity::class.java)

            startActivity(intent) //Start app

        }
    }
}
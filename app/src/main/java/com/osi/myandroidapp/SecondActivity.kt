package com.osi.myandroidapp

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second) // Attaching layout to Activity

        // Extract incoming value from another Activity
        val bundle: Bundle? = intent.extras
        val msg = bundle!!.getString("user_msg")

        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()

        txvUserMessage.text = msg
    }
}
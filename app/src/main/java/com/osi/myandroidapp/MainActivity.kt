package com.osi.myandroidapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.* // View binding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Event listener for ShowToast button
        btnShowToast.setOnClickListener {
            Log.i("MainActivity", "Button was clicked !")
            Toast.makeText(this, "Button was clicked", Toast.LENGTH_SHORT).show()
        }

        // Event listener for sendDataToNextActivity button
        btnSendMsgToNextActivity.setOnClickListener {
            val msg: String = etUserMessage.text.toString() // Here 'text' stands for getText()
                                                     // as there are no getter and setter in kotlin
//            Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()

            // Navigate from Current activity(MainActivity) to other here SecondActivity
//            val intent = Intent(this, SecondActivity::class.java)
//            startActivity(intent)
            // Above is the example of Explicit Intent

            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("user_msg", msg)
            startActivity(intent)
        }

        // Event listener for sendToOtherApp button
        btnShareToOtherApp.setOnClickListener {
            val msg: String = etUserMessage.text.toString()

            // Implicit intent
            val intent = Intent() // We are not passing parameter as we don't know target activity
            intent.action = Intent.ACTION_SEND
            // Sharing the msg to other apps
            intent.putExtra(Intent.EXTRA_TEXT, msg) // predefined key known to other applications
            intent.type = "text/plain"

            startActivity(Intent.createChooser(intent, "Please select app:"))
        }

        btnRecyclerViewDemo.setOnClickListener {
            val intent = Intent(this, HobbiesActivity::class.java)
            startActivity(intent)
        }
    }
}
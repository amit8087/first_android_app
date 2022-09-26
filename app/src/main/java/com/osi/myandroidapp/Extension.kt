package com.osi.myandroidapp

import android.content.Context
import android.widget.Toast

// Class 'Context' is the super class of 'Activity'.

fun Context.showToast(msg: String) {
    Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
}
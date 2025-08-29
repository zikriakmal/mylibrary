package com.alliance.mylibrary


import android.content.Context
import android.widget.Toast

class MyLibrary {
    companion object {
        fun showToast(context: Context, message: String) {
            Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
        }
    }
}
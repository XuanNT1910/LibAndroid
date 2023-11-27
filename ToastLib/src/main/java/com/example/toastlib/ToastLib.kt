package com.example.toastlib

import android.content.Context
import android.widget.Toast

class ToastLib {
    companion object{
        fun ShowMessage(context: Context, message: String, duration:Int){
            Toast.makeText(context,message,duration).show()
        }
    }
}
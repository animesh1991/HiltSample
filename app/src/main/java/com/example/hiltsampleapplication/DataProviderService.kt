package com.example.hiltsampleapplication

import android.util.Log
import javax.inject.Inject

class DataProviderService @Inject constructor() {

    fun saveMessageInDB(message : String) {
        Log.d(TAG, message)
    }

}
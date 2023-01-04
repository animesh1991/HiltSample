package com.example.hiltsampleapplication

import android.util.Log
import javax.inject.Inject

const val TAG = "DataRepository"

class DataRepository @Inject constructor(val dataProviderService: DataProviderService){

    fun logData(msg : String) {
        dataProviderService.saveMessageInDB(msg)
    }

}
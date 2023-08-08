package com.example.bletutorial.data

import com.example.bletutorial.util.Resource
import kotlinx.coroutines.flow.MutableSharedFlow

interface VoisReceiveManager {

    val data: MutableSharedFlow<Resource<VoisResult>>

    fun reconnect()

    fun disconnect()

    fun startReceiving()

    fun closeConnection()

}
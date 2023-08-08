package com.example.bletutorial.data

data class VoisResult(
    val temperature:Int,
    val humidity:UByte,
    val connectionState: ConnectionState
)

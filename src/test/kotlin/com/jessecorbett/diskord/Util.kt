package com.jessecorbett.diskord

import java.util.*

fun randomString(length: Long = 10): String {
    val source = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"
    return Random().ints(length, 0, source.length).toArray()
            .asSequence()
            .map(source::get)
            .map {
                if (it.isLetter() && Random().nextBoolean())
                    return@map it.toLowerCase()
                return@map it
            }
            .joinToString("")
}

const val base64Image = "data:image/png;base64,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"

package org.woigt.tcgcolector.database

import android.content.Context
import androidx.room.Room
import androidx.sqlite.driver.bundled.BundledSQLiteDriver
import data.database.CardDatabase

fun getCardDatabase(context: Context): CardDatabase {
    val dbFile = context.getDatabasePath("cardList.db")
    return Room.databaseBuilder<CardDatabase>(
        context = context.applicationContext,
        name = dbFile.absolutePath
    ).setDriver(BundledSQLiteDriver())
        .build()

}
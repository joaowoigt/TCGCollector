package data.database

import androidx.room.Room
import androidx.sqlite.driver.bundled.BundledSQLiteDriver
import java.io.File

fun getCardDatabase(): CardDatabase {
    val dbFile = File(System.getProperty("user.home"), "cardList.db")
    return Room.databaseBuilder<CardDatabase>(
        name = dbFile.absolutePath
    ).setDriver(BundledSQLiteDriver())
        .build()
}
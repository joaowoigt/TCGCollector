package data.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class CardEntity(
    @PrimaryKey val id: String,
    val name: String,
    val imageSmall: String,
    val imageLarge: String
)
package data.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert
import kotlinx.coroutines.flow.Flow

@Dao
interface CardDao {

    @Upsert
    suspend fun upsert(card: CardEntity)

    @Delete
    suspend fun delete(card: CardEntity)

    @Query("SELECT * FROM CardEntity")
    fun getAll(): Flow<List<CardEntity>>
}
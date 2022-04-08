package com.example.db.dao

import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.db.models.AntonymsCategoryModel
import kotlinx.coroutines.flow.Flow

interface AntonymsCategoryDao {

    @Insert
    suspend fun insertData(model: AntonymsCategoryDao)

    @Query("SELECT * FROM dictionary_category_table")
    fun getData(): Flow<List<AntonymsCategoryModel>>

    @Update
    suspend fun update(model: AntonymsCategoryModel)
}

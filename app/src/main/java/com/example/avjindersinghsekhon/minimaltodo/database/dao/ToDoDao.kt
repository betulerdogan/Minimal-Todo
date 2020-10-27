package com.example.avjindersinghsekhon.minimaltodo.database.dao

import androidx.room.*
import com.example.avjindersinghsekhon.minimaltodo.database.entity.ToDoEntity
import io.reactivex.Observable

/**
 *               Minimal-Todo
 * Developed by Betul Erdogan on 27/10/2020.
 *
 */


@Dao
interface ToDoDao {

    @Query("SELECT * FROM to_do_entity")
    fun getAll(): Observable<ToDoEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(vararg items: ToDoEntity)

    @Delete
    fun delete(item: ToDoEntity)
}
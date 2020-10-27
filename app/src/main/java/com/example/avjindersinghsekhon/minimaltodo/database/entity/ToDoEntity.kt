package com.example.avjindersinghsekhon.minimaltodo.database.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 *               Minimal-Todo
 * Developed by Betul Erdogan on 27/10/2020.
 *
 */

@Entity(tableName = "to_do_entity")
data class ToDoEntity(
        @PrimaryKey val identifier: String,
        val text: String,
        @ColumnInfo(name = "has_reminder") val hasReminder: Boolean,
        val description: String,
        val color: Int,
        val date: Long
)

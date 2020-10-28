package com.example.avjindersinghsekhon.minimaltodo.Main.model

import com.example.avjindersinghsekhon.minimaltodo.Utility.ToDoItem

/**
 *               Minimal-Todo
 * Developed by Betul Erdogan on 28/10/2020.
 *
 */


interface ToDoListener {
    fun onClick(item: ToDoItem)
    fun onRemove(item:ToDoItem)
}
package com.example.avjindersinghsekhon.minimaltodo.Main.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.avjindersinghsekhon.minimaltodo.Main.model.AlarmHelper
import com.example.avjindersinghsekhon.minimaltodo.Main.model.PrefsHelper
import com.example.avjindersinghsekhon.minimaltodo.Main.model.ToDoRepository
import com.example.avjindersinghsekhon.minimaltodo.database.dao.ToDoDao

/**
 *               Minimal-Todo
 * Developed by Betul Erdogan on 28/10/2020.
 *
 */


class ToDoViewModelFactory(
        private val dao: ToDoDao,
        private val alarmHelper: AlarmHelper,
        private val prefsHelper: PrefsHelper
) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        val repository = ToDoRepository(dao)
        return ToDoViewModel(repository, alarmHelper, prefsHelper) as T
    }
}
package com.example.worldcurrencies

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.worldcurrencies.models.ModelItem
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor (
    private val repository: Repository
) : ViewModel() {
    private val _itemData = MutableLiveData<MutableList<ModelItem>>()
    val itemData: LiveData<MutableList<ModelItem>> get() = _itemData

    init {
        loadItems()
    }

    private fun loadItems() {
        _itemData.value = repository.itemList()
    }
}


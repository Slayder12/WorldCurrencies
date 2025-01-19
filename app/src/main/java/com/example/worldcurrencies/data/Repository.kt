package com.example.worldcurrencies.data

import com.example.worldcurrencies.models.ModelItem

interface Repository {
    fun itemList(): MutableList<ModelItem>
}
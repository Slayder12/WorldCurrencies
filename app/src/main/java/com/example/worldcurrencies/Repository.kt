package com.example.worldcurrencies

import com.example.worldcurrencies.models.ModelItem

interface Repository {
    fun itemList(): MutableList<ModelItem>
}
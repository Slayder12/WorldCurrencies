package com.example.worldcurrencies.data

import com.example.worldcurrencies.R
import com.example.worldcurrencies.models.ModelItem
import javax.inject.Inject

class DatabasePrototype @Inject constructor() : Repository {
    override fun itemList() = mutableListOf(
        ModelItem("Доллар", R.drawable.icon_dollar),
        ModelItem("Евро", R.drawable.icon_euro),
        ModelItem("Йена", R.drawable.icon_yen),
        ModelItem("Фунт стерлингов", R.drawable.icon_pound),
        ModelItem("Рубль", R.drawable.icon_ruble)
    )
}
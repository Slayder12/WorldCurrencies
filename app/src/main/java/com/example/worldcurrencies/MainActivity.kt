package com.example.worldcurrencies

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.worldcurrencies.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val viewModel: MainViewModel by viewModels()

    private lateinit var binding: ActivityMainBinding
    private var adapter: CustomAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.toolbar.title = ""
        setSupportActionBar(binding.toolbar)
        binding.toolbar.overflowIcon?.setTint(ContextCompat.getColor(this, R.color.white))

        binding.recyclerViewRV.layoutManager = LinearLayoutManager(this)
        adapter = CustomAdapter(mutableListOf())
        binding.recyclerViewRV.adapter = adapter

        observeItemData()
    }

    private fun observeItemData() {
        viewModel.itemData.observe(this, Observer { itemData ->
            adapter?.updateData(itemData)
        })
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.exitMenuMain -> {
                finishAffinity()
            }
        }
        return super.onOptionsItemSelected(item)

    }
}
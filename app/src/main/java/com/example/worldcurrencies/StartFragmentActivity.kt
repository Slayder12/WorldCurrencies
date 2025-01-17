package com.example.worldcurrencies

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.worldcurrencies.databinding.ActivityStartFragmentBinding

class StartFragmentActivity : AppCompatActivity() {

    private lateinit var binding: ActivityStartFragmentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStartFragmentBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, StartFragment())
                .commit()
        }

    }
}
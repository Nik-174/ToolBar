package com.example.toolbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.example.toolbar.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationMenuView

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "rty454w"
        binding.bottonNav.selectedItemId = R.id.menu_title3
        binding.bottonNav.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.menu_title -> Toast.makeText(this, "vvv", Toast.LENGTH_SHORT).show()
                R.id.menu_title2 -> Toast.makeText(this, "qqqq", Toast.LENGTH_SHORT).show()
                R.id.menu_title3 -> Toast.makeText(this, "wwwww", Toast.LENGTH_SHORT).show()
                R.id.menu_title4 -> Toast.makeText(this, "rrrrrr", Toast.LENGTH_SHORT).show()
            }
            true
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {

            android.R.id.home -> finish()
            R.id.menu_title -> Toast.makeText(this, "1223", Toast.LENGTH_SHORT).show()
            R.id.menu_title2 -> Toast.makeText(this, "3445", Toast.LENGTH_SHORT).show()
            R.id.menu_title3 -> Toast.makeText(this, "5667", Toast.LENGTH_SHORT).show()
        }

        return true
    }
}
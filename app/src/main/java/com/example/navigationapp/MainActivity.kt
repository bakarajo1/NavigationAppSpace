package com.example.navigationapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.navigationapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setUpBottomNav()
    }

    private fun setUpBottomNav(){

        //val navController = findNavController(R.id.fragmentHost)
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.fragmentHost) as NavHostFragment
        val navController = navHostFragment.navController



        binding.bottomNavView.setupWithNavController(navController)
    }
}
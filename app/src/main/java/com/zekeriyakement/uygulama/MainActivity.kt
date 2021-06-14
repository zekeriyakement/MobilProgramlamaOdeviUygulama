package com.zekeriyakement.uygulama

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import java.security.AccessControlContext
import java.security.AccessController
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        navController = Navigation.findNavController(this@MainActivity,R.id.fragment_container_view)
//sen bu nu  NavHostFragment tanımla anlamına geliyor. " as "
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.fragment_container_view) as NavHostFragment
        //navcontroller olarak eşitliyoruz.
        navController = navHostFragment.navController

    }
}
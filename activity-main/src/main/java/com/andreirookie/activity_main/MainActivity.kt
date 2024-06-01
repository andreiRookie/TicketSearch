package com.andreirookie.activity_main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.andreirookie.activity_main.di.MainActivityComponent
import com.andreirookie.api.AppWithProvidersFacadeProvider
import com.andreirookie.api.HotelsFragmentMediator
import com.andreirookie.api.SearchFragmentMediator
import com.google.android.material.bottomnavigation.BottomNavigationView
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var searchFragmentMediator: SearchFragmentMediator

    @Inject
    lateinit var hotelsFragmentMediator: HotelsFragmentMediator

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        MainActivityComponent.create((application as AppWithProvidersFacadeProvider).provideFacade())
            .inject(this)

        val bottomNavView = findViewById<BottomNavigationView>(R.id.bottom_nav_view)

        searchFragmentMediator.openSearchFragment(
            R.id.container,
            supportFragmentManager
        )

        bottomNavView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.hotels -> {
                    hotelsFragmentMediator.openHotelsFragment(
                        R.id.container,
                        supportFragmentManager,
                    )
                    true
                }
                R.id.air_tickets -> {
                    searchFragmentMediator.openSearchFragment(
                        R.id.container,
                        supportFragmentManager
                    )
                    true
                }
                else -> false
            }
        }
   }
}
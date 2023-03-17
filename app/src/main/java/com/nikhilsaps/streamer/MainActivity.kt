package com.nikhilsaps.streamer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.FragmentTransaction
import com.etebarian.meowbottomnavigation.MeowBottomNavigation
import com.nikhilsaps.streamer.fragments.*

class MainActivity : AppCompatActivity() {
    lateinit var historyFragment: HistoryFragment
    lateinit var homeFragment: HomeFragment
    lateinit var menuFragment: MenuFragment
    lateinit var newFragment: NewFragment
    lateinit var trendingFragment: TrendingFragment
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val bottomNavigation: MeowBottomNavigation = findViewById(R.id.botomnav)

        //adding menu to my custom class
        bottomNavigation.add(MeowBottomNavigation.Model(1, R.drawable.trending_ic))
        bottomNavigation.add(MeowBottomNavigation.Model(2, R.drawable.new_ic))
        bottomNavigation.add(MeowBottomNavigation.Model(3, R.drawable.menu_ic))
        bottomNavigation.add(MeowBottomNavigation.Model(4, R.drawable.home_ic))
        bottomNavigation.add(MeowBottomNavigation.Model(5, R.drawable.history_ic))
        bottomNavigation.show(3)
        menuFragment = MenuFragment()
        supportFragmentManager.beginTransaction().replace(R.id.fram_frag, menuFragment)
            .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).commit()


        bottomNavigation.setOnClickMenuListener {
            when (it.id) {
                1 -> {
                    Toast.makeText(this, "Trending", Toast.LENGTH_SHORT).show()
                    trendingFragment = TrendingFragment()
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fram_frag, trendingFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).commit()


                }


                2 -> {
                    Toast.makeText(this, "NEW", Toast.LENGTH_SHORT).show()
                    newFragment = NewFragment()
                    supportFragmentManager.beginTransaction().replace(R.id.fram_frag, newFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).commit()


                }
                3 -> {


                    Toast.makeText(this, "Menu", Toast.LENGTH_SHORT).show()
                    menuFragment = MenuFragment()
                    supportFragmentManager.beginTransaction().replace(R.id.fram_frag, menuFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).commit()


                }
                4 -> {
                    Toast.makeText(this, "home", Toast.LENGTH_SHORT).show()
                    homeFragment = HomeFragment()
                    supportFragmentManager.beginTransaction().replace(R.id.fram_frag, homeFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).commit()


                }
                5 -> {
                    Toast.makeText(this, "History", Toast.LENGTH_SHORT).show()
                    historyFragment = HistoryFragment()
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fram_frag, historyFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).commit()


                }


            }
        }

    }
}
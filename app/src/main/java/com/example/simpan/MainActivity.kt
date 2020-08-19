package com.example.simpan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.simpan.ajuan.FragmentAjuan
import com.example.simpan.info_pribadi.FragmentInfoPribadi
import com.example.simpan.info_umum.FragmentInfoUmum
import com.example.simpan.lainnya.FragmentLainnya
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Load first fragment by default
        loadFragment(FragmentBeranda())
        bottomNavigationView.setOnNavigationItemSelectedListener { menuItem ->
            when {
                menuItem.itemId == R.id.navigation_beranda -> {
                    loadFragment(FragmentBeranda())
                    return@setOnNavigationItemSelectedListener true
                }
                menuItem.itemId == R.id.navigation_pribadi -> {
                    loadFragment(FragmentInfoPribadi())
                    return@setOnNavigationItemSelectedListener true
                }
                menuItem.itemId == R.id.navigation_umum -> {
                    loadFragment(FragmentInfoUmum())
                    return@setOnNavigationItemSelectedListener true
                }
                menuItem.itemId == R.id.navigation_ajuan -> {
                    loadFragment(FragmentAjuan())
                    return@setOnNavigationItemSelectedListener true
                }
                menuItem.itemId == R.id.navigation_lainnya -> {
                    loadFragment(FragmentLainnya())
                    return@setOnNavigationItemSelectedListener true
                }
                else -> {
                    return@setOnNavigationItemSelectedListener  false
                }
            }
        }
    }
    
    private fun loadFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().also {fragmentTransaction ->
            fragmentTransaction.replace(R.id.fragmentContainer, fragment)
            fragmentTransaction.commit()
        }
    }
}

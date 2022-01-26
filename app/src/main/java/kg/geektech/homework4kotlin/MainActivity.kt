package kg.geektech.homework4kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kg.geektech.homework4kotlin.adapters.ViewPagerAdapter
import kg.geektech.homework4kotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val adapter = ViewPagerAdapter(supportFragmentManager,lifecycle)

        binding.pager.adapter = adapter
    }
}
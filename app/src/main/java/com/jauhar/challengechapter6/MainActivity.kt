package com.jauhar.challengechapter6

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat
import com.jauhar.challengechapter6.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        WindowCompat.setDecorFitsSystemWindows(window, false)
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    /**
    private fun getData() {
        val model = ViewModelProvider(this).get(ProductViewModel::class.java)
        model.callApiProduct()
        model.getliveData().observe(this, Observer{
            adapter = ProductAdapter(it)
            if (it != null){
                binding.rvList.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
                binding.rvList.adapter = ProductAdapter(it)
            }
        })
    }
    **/

    }


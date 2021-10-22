package com.example.dependencyinjection_crocodiccore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.example.dependencyinjection_crocodiccore.databinding.ActivityDIDenganHiltBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class DIDenganHiltActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDIDenganHiltBinding

    private val viewModel2: MainViewModel2 by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_d_i_dengan_hilt)
        binding.viewModel2 = viewModel2

        viewModel2.sendValue()
    }
}
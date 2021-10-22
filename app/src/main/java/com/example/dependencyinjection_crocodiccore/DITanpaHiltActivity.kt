package com.example.dependencyinjection_crocodiccore

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.example.dependencyinjection_crocodiccore.data.SaveCounter
import com.example.dependencyinjection_crocodiccore.databinding.ActivityDITanpaHiltBinding

class DITanpaHiltActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDITanpaHiltBinding
    private val viewModel: MainViewModel by viewModels {
        MainViewModel.Factory(SaveCounter(this))
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_d_i_tanpa_hilt)
        binding.viewModel = viewModel
        viewModel.sendValue()
    }
}
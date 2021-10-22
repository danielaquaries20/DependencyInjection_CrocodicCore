package com.example.dependencyinjection_crocodiccore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dependencyinjection_crocodiccore.databinding.ActivityDetailCrocodicCore2Binding

class DetailCrocodicCore2Activity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailCrocodicCore2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailCrocodicCore2Binding.inflate(layoutInflater)
        setContentView(binding.root)

//        val namaString = intent.getStringExtra("nama2")
//        val sekolahString = intent.getStringExtra("sekolah2")
//        binding.tvNama2.text = namaString
//        binding.tvSekolah2.text = sekolahString
//
//        binding.btnKembali2.setOnClickListener {
//            onBackPressed()
//        }

    }
}
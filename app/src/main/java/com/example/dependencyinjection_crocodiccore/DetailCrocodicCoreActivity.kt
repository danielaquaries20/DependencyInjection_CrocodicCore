package com.example.dependencyinjection_crocodiccore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dependencyinjection_crocodiccore.databinding.ActivityDetailCrocodicCoreBinding

class DetailCrocodicCoreActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailCrocodicCoreBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailCrocodicCoreBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val namaString = intent.getStringExtra("nama")
        val sekolahString = intent.getStringExtra("sekolah")
        binding.tvNama.text = namaString
        binding.tvSekolah.text = sekolahString


        binding.btnKembali.setOnClickListener {
            onBackPressed()
        }
    }
}
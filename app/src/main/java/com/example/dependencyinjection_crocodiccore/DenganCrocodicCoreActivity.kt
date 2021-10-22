package com.example.dependencyinjection_crocodiccore

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.crocodic.core.extension.openActivity
import com.example.dependencyinjection_crocodiccore.databinding.ActivityDenganCrocodicCoreBinding

class DenganCrocodicCoreActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDenganCrocodicCoreBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDenganCrocodicCoreBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        binding.btnNextDetail.setOnClickListener {
//            val detailIntent = Intent(this, DetailCrocodicCoreActivity::class.java).apply {
//                putExtra("nama", "Daniel Aquaries Pratama")
//                putExtra("sekolah", "SMK N 11 Semarang")
//            }
//            startActivity(detailIntent)
//        }

        openActivity<DetailCrocodicCoreActivity> {
            putExtra("nama", "Daniel Aquaries Pratama")
            putExtra("sekolah", "SMK N 11 Semarang")
        }


    }
}
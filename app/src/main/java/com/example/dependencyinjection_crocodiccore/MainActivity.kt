package com.example.dependencyinjection_crocodiccore

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var buttonWithoutHilt: Button
    private lateinit var buttonWithHilt: Button
    private lateinit var buttonCrocodicCore: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonWithoutHilt = findViewById(R.id.btnDITanpaHilt)
        buttonWithHilt = findViewById(R.id.btnDIDenganHilt)
        buttonCrocodicCore = findViewById(R.id.btnCrocodicCore)

        buttonWithoutHilt.setOnClickListener {
            val go = Intent(this, DITanpaHiltActivity::class.java)
            startActivity(go)
        }

        buttonWithHilt.setOnClickListener {
            val maju = Intent(this, DIDenganHiltActivity::class.java)
            startActivity(maju)
        }

        buttonCrocodicCore.setOnClickListener {
            val depan = Intent(this, DenganCrocodicCoreActivity::class.java)
            startActivity(depan)
        }

    }
}
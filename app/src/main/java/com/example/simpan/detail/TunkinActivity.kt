package com.example.simpan.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.simpan.R

class TunkinActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tunkin)

        val button_kembali = findViewById<Button>(R.id.bt_kembalitunkin)
        button_kembali.setOnClickListener{
            onBackPressed()
        }

    }
}

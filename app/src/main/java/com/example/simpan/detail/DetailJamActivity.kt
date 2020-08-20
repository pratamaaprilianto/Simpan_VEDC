package com.example.simpan.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.simpan.R
import kotlinx.android.synthetic.main.activity_detail_jam.*

class DetailJamActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_jam)

        supportActionBar!!.title = "Detail Jam Kerja"
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
    }
}

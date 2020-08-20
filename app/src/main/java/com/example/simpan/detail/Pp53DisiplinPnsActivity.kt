package com.example.simpan.detail

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.simpan.MainActivity
import com.example.simpan.R
import kotlinx.android.synthetic.main.activity_pp53_disiplin_pns.*

class Pp53DisiplinPnsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pp53_disiplin_pns)

        btn_detailjam.setOnClickListener {
            val intent = Intent (this, DetailJamActivity::class.java)
            startActivity(intent)
        }
        val button_kembali = findViewById<Button>(R.id.bt_kembalipp53)

        button_kembali.setOnClickListener{
            onBackPressed()
        }
      }
    }




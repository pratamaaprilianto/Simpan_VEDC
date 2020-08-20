package com.example.simpan.detail

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.simpan.R
import com.example.simpan.adapter.adapter
import com.example.simpan.adapter.adapterRekap
import com.example.simpan.model.model_rekap
import kotlinx.android.synthetic.main.activity_rekap_penugasan.*

class RekapPenugasanActivity : AppCompatActivity() {

    private lateinit var adapterModell : adapterRekap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rekap_penugasan)

        val button_kembali = findViewById<Button>(R.id.bt_kembalirekap)
        button_kembali.setOnClickListener{
            onBackPressed()
        }

        val listModell = listOf<model_rekap>(
            model_rekap(no_rekap = "01215/B17.2/KP/2020", ket_rekap = "Dinas Luar", tgl_rekap = "17 sd 18/01/2020", laporan_rekap = "Laporan : Sudah"),
            model_rekap(no_rekap = "01216/B17.2/KP/2020", ket_rekap = "Dinas Dalam", tgl_rekap = "19 sd 18/01/2020", laporan_rekap = "Laporan : Sudah"),
            model_rekap(no_rekap = "01217/B17.2/KP/2020", ket_rekap = "Dinas Luar", tgl_rekap = "20 sd 18/01/2020", laporan_rekap = "Laporan : Sudah"),
            model_rekap(no_rekap = "01218/B17.2/KP/2020", ket_rekap = "Dinas Dalam", tgl_rekap = "23 sd 18/01/2020", laporan_rekap = "Laporan : Sudah")
        )

        adapterModell= adapterRekap(listModell)

        rec_rekappenugasan.apply {
            layoutManager = LinearLayoutManager(this@RekapPenugasanActivity)
            adapter = adapterModell
        }

    }

}

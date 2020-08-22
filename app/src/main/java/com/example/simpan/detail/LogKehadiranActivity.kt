package com.example.simpan.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.simpan.R
import com.example.simpan.adapter.adapterLogKehadiran
import com.example.simpan.model.model_logkehadiran
import kotlinx.android.synthetic.main.activity_log_kehadiran.*

class LogKehadiranActivity : AppCompatActivity() {

    private lateinit var adapterLogKehadiran: adapterLogKehadiran

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_kehadiran)

        val button_kembali = findViewById<Button>(R.id.bt_kembalilog)


        button_kembali.setOnClickListener{
            onBackPressed()
        }

        val listModel = listOf<model_logkehadiran>(
            model_logkehadiran(tanggal = "01/01/2020",jenis = "M",hari="Senin",datang = "07.43.45",
                late = "00.12.45",pulang = "15.57.63", psw = "-", potongan = "-", tolate = "-", status = "Tidak ganti jam"),
            model_logkehadiran(tanggal = "02/01/2020",jenis = "L",hari="Selasa",datang = "07.43.45",
                late = "00.12.45",pulang = "15.57.63", psw = "-", potongan = "-", tolate = "-", status = "Ganti jam"),
            model_logkehadiran(tanggal = "03/01/2020",jenis = "M",hari="Rabu",datang = "07.43.45",
                late = "00.12.45",pulang = "15.57.63", psw = "-", potongan = "-", tolate = "-", status = "Ganti jam"),
            model_logkehadiran(tanggal = "04/01/2020",jenis = "L",hari="Kamis",datang = "07.43.45",
                late = "00.12.45",pulang = "15.57.63", psw = "-", potongan = "-", tolate = "-", status = "Tidak ganti jam"),
            model_logkehadiran(tanggal = "05/01/2020",jenis = "M",hari="Jumat",datang = "07.43.45",
                late = "00.12.45",pulang = "15.57.63", psw = "-", potongan = "-", tolate = "-", status = "Tidak ganti jam"),
            model_logkehadiran(tanggal = "08/01/2020",jenis = "L",hari="Senin",datang = "07.43.45",
                late = "00.12.45",pulang = "15.57.63", psw = "-", potongan = "-", tolate = "-", status = "Ganti jam"),
            model_logkehadiran(tanggal = "09/01/2020",jenis = "M",hari="Selasa",datang = "07.43.45",
                late = "00.12.45",pulang = "15.57.63", psw = "-", potongan = "-", tolate = "-", status = "Ganti jam"),
            model_logkehadiran(tanggal = "10/01/2020",jenis = "L",hari="Rabu",datang = "07.43.45",
                late = "00.12.45",pulang = "15.57.63", psw = "-", potongan = "-", tolate = "-", status = "Tidak ganti jam")
        )

        adapterLogKehadiran = adapterLogKehadiran(listModel)
        rec_logkehadiran.apply{
            layoutManager = LinearLayoutManager(this@LogKehadiranActivity)
            adapter = adapterLogKehadiran
        }
    }
}

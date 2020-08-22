package com.example.simpan.detail

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
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
        var tahun_selected : String
        var bulan_selected : String

        tahun_selected = ""
        bulan_selected = ""

        val text_jml_terlambat = findViewById<TextView>(R.id.tv_jml_terlambat)
        val text_jml_psw = findViewById<TextView>(R.id.tv_jml_psw)
        val text_total = findViewById<TextView>(R.id.tv_total)

        val spinner_tahun : Spinner = findViewById(R.id.spin_tahunpp53)
        val spinner_bulan : Spinner = findViewById(R.id.spin_bulanpp53)

        val array_tahun = arrayOf("2018","2019","2020");
        val array_bulan = arrayOf("Januari","Februari","Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember")

        spinner_tahun.adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,array_tahun)
        spinner_bulan.adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,array_bulan)

        spinner_tahun.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(p0: AdapterView<*>?) {
                //TODO("Not yet implemented")
            }
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                tahun_selected = array_tahun.get(p2);
            }
        }
        spinner_bulan.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(p0: AdapterView<*>?) {
                //TODO("Not yet implemented")

            }

            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                bulan_selected = array_bulan.get(p2);

                if (tahun_selected.equals("2018") && bulan_selected.equals("Januari")) {
                    text_jml_terlambat.text = "00:28:29"
                    text_jml_psw.text = "0"
                    text_total.text = "40"
                } else if (tahun_selected.equals("2018") && bulan_selected.equals("Februari")) {
                    text_jml_terlambat.text = "00:10:00"
                    text_jml_psw.text = "0"
                    text_total.text = "20"
                } else if (tahun_selected.equals("2018") && bulan_selected.equals("Maret")) {
                    text_jml_terlambat.text = "00:00:00"
                    text_jml_psw.text = "0"
                    text_total.text = "10"
                } else if (tahun_selected.equals("2018") && bulan_selected.equals("April")) {
                    text_jml_terlambat.text = "00:15:00"
                    text_jml_psw.text = "2"
                    text_total.text = "15"
                } else if (tahun_selected.equals("2018") && bulan_selected.equals("Mei")) {
                    text_jml_terlambat.text = "00:20:50"
                    text_jml_psw.text = "0"
                    text_total.text = "20"
                }
            }
        }
    }
    }




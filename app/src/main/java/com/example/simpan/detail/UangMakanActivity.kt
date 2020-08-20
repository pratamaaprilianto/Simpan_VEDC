package com.example.simpan.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView
import com.example.simpan.R

class UangMakanActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_uang_makan)
        var tahun_selected : String
        var bulan_selected : String

        tahun_selected = ""
        bulan_selected = ""

        val text_total_Kehadiran = findViewById<TextView>(R.id.tv_totalkehadiran)
        val text_rp_hari = findViewById<TextView>(R.id.tv_rphari)
        val text_tv_pajak = findViewById<TextView>(R.id.tv_pajak)
        val text_tv_uang_makan = findViewById<TextView>(R.id.tv_totaluangmakan)

        val spinner_tahun : Spinner = findViewById(R.id.spin_tahunuangmakan)
        val spinner_bulan : Spinner = findViewById(R.id.spin_bulanuangmakan)

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
        spinner_bulan.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(p0: AdapterView<*>?) {
                //TODO("Not yet implemented")

            }

            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                bulan_selected = array_bulan.get(p2);

                if (tahun_selected.equals("2018") && bulan_selected.equals("Januari")) {
                    text_total_Kehadiran.text = "3"
                    text_rp_hari.text = "10.000"
                    text_tv_pajak.text = "10%"
                    text_tv_uang_makan.text = "9.000"
                } else if (tahun_selected.equals("2018") && bulan_selected.equals("Februari")) {
                    text_total_Kehadiran.text = "4"
                    text_rp_hari.text = "10.000"
                    text_tv_pajak.text = "20%"
                    text_tv_uang_makan.text = "8.000"
                } else if (tahun_selected.equals("2018") && bulan_selected.equals("Maret")) {
                    text_total_Kehadiran.text = "1"
                    text_rp_hari.text = "100.000"
                    text_tv_pajak.text = "50%"
                    text_tv_uang_makan.text = "50.000"
                } else if (tahun_selected.equals("2018") && bulan_selected.equals("April")) {
                    text_total_Kehadiran.text = "2"
                    text_rp_hari.text = "100.000"
                    text_tv_pajak.text = "30%"
                    text_tv_uang_makan.text = "40.000"
                } else if (tahun_selected.equals("2018") && bulan_selected.equals("Mei")) {
                    text_total_Kehadiran.text = "1"
                    text_rp_hari.text = "100.000"
                    text_tv_pajak.text = "40%"
                    text_tv_uang_makan.text = "60.000"
                }
                if (tahun_selected.equals("2018") && bulan_selected.equals("Juni")) {
                    text_total_Kehadiran.text = "3"
                    text_rp_hari.text = "10.000"
                    text_tv_pajak.text = "10%"
                    text_tv_uang_makan.text = "9.000"
                } else if (tahun_selected.equals("2018") && bulan_selected.equals("Juli")) {
                    text_total_Kehadiran.text = "4"
                    text_rp_hari.text = "10.000"
                    text_tv_pajak.text = "20%"
                    text_tv_uang_makan.text = "8.000"
                } else if (tahun_selected.equals("2018") && bulan_selected.equals("Agustus")) {
                    text_total_Kehadiran.text = "1"
                    text_rp_hari.text = "100.000"
                    text_tv_pajak.text = "50%"
                    text_tv_uang_makan.text = "50.000"
                } else if (tahun_selected.equals("2018") && bulan_selected.equals("September")) {
                    text_total_Kehadiran.text = "2"
                    text_rp_hari.text = "100.000"
                    text_tv_pajak.text = "30%"
                    text_tv_uang_makan.text = "40.000"
                } else if (tahun_selected.equals("2018") && bulan_selected.equals("Oktober")) {
                    text_total_Kehadiran.text = "3"
                    text_rp_hari.text = "100.000"
                    text_tv_pajak.text = "60%"
                    text_tv_uang_makan.text = "50.000"
                } else if (tahun_selected.equals("2018") && bulan_selected.equals("November")) {
                    text_total_Kehadiran.text = "5"
                    text_rp_hari.text = "90.000"
                    text_tv_pajak.text = "60%"
                    text_tv_uang_makan.text = "50.000"
                } else if (tahun_selected.equals("2018") && bulan_selected.equals("Desember")) {
                    text_total_Kehadiran.text = "5"
                    text_rp_hari.text = "80.000"
                    text_tv_pajak.text = "50%"
                    text_tv_uang_makan.text = "50.000"
                }
            }
        }
    }
}
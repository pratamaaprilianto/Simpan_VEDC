package com.example.simpan.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import com.example.simpan.R

class TunkinActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tunkin)

        val button_kembali = findViewById<Button>(R.id.bt_kembalitunkin)
        button_kembali.setOnClickListener{
            onBackPressed()
        }
        var tahun_selected : String
        var bulan_selected : String

        tahun_selected = ""
        bulan_selected = ""

        val text_akumulasi_kerja = findViewById<TextView>(R.id.tv_akumulasikurangjam)
        val text_pengurangan_tunkin = findViewById<TextView>(R.id.tv_pengurangntunkin)
        val text_potongan_kinerja = findViewById<TextView>(R.id.tv_potongankinerja)
        val text_total_potongan = findViewById<TextView>(R.id.tv_totalpotongan)
        val text_poin_tunkin = findViewById<TextView>(R.id.tv_pointunkin)
        val text_hitung_skp = findViewById<TextView>(R.id.tv_hitungskp)
        val text_nilai_tunkin = findViewById<TextView>(R.id.tv_nilaitunkin)

        val spinner_tahun : Spinner = findViewById(R.id.spin_tahuninfotunjangan)
        val spinner_bulan : Spinner = findViewById(R.id.spin_bulaninfotunjangan)

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
                    text_akumulasi_kerja.text = "00:00:00"
                    text_pengurangan_tunkin.text = "0"
                    text_potongan_kinerja.text = "0,0"
                    text_total_potongan.text = "0,0"
                    text_poin_tunkin.text = "100"
                    text_hitung_skp.text = "0,0"
                    text_nilai_tunkin.text = "0,0"

                } else if (tahun_selected.equals("2018") && bulan_selected.equals("Februari")) {
                    text_akumulasi_kerja.text = "00:00:00"
                    text_pengurangan_tunkin.text = "2"
                    text_potongan_kinerja.text = "0"
                    text_total_potongan.text = "2"
                    text_poin_tunkin.text = "80"
                    text_hitung_skp.text = "0,0"
                    text_nilai_tunkin.text = "0,0"

                } else if (tahun_selected.equals("2018") && bulan_selected.equals("Maret")) {
                    text_akumulasi_kerja.text = "00:00:00"
                    text_pengurangan_tunkin.text = "0"
                    text_potongan_kinerja.text = "0"
                    text_total_potongan.text = "50"
                    text_poin_tunkin.text = "20"
                    text_hitung_skp.text = "100"
                    text_nilai_tunkin.text = "80"

                }else if (tahun_selected.equals("2018") && bulan_selected.equals("April")) {
                    text_akumulasi_kerja.text = "00:15:00"
                    text_pengurangan_tunkin.text = "0"
                    text_potongan_kinerja.text = "0"
                    text_total_potongan.text = "0"
                    text_poin_tunkin.text = "80"
                    text_hitung_skp.text = "20"
                    text_nilai_tunkin.text = "70"

                }else if (tahun_selected.equals("2018") && bulan_selected.equals("Mei")) {
                    text_akumulasi_kerja.text = "00:20:00"
                    text_pengurangan_tunkin.text = "1"
                    text_potongan_kinerja.text = "1"
                    text_total_potongan.text = "1"
                    text_poin_tunkin.text = "90"
                    text_hitung_skp.text = "0,0"
                    text_nilai_tunkin.text ="50"
                }
            }

        }
    }
}

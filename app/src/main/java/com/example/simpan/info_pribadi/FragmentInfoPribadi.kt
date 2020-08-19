package com.example.simpan.info_pribadi

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.simpan.R
import com.example.simpan.detail.*
import kotlinx.android.synthetic.main.fragment_info_pribadi.*

/**
 * A simple [Fragment] subclass.
 */
class FragmentInfoPribadi : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_info_pribadi, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        cv_biodata.setOnClickListener{
            context?.startActivity(Intent(context, BiodataActivity::class.java))
        }

        cv_tunkin.setOnClickListener{
            context?.startActivity(Intent(context, TunkinActivity::class.java))
        }

        cv_uang_makan.setOnClickListener{
            context?.startActivity(Intent(context, UangMakanActivity::class.java))
        }

        cv_rekap_tugas.setOnClickListener{
            context?.startActivity(Intent(context, RekapPenugasanActivity::class.java))
        }

        cv_log_kehadiran.setOnClickListener{
            context?.startActivity(Intent(context, LogKehadiranActivity::class.java))
        }

        cv_log_pp53_disiplin.setOnClickListener{
            context?.startActivity(Intent(context, Pp53DisiplinPnsActivity::class.java))
        }
    }

}

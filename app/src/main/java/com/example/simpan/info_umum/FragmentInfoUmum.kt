package com.example.simpan.info_umum

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.simpan.R
import com.example.simpan.detail.BiodataActivity
import kotlinx.android.synthetic.main.fragment_info_pribadi.*
import kotlinx.android.synthetic.main.fragment_info_umum.*

/**
 * A simple [Fragment] subclass.
 */
class FragmentInfoUmum : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_info_umum, container, false)
    }


}

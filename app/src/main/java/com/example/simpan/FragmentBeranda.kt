package com.example.simpan

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.annotation.SuppressLint
import android.content.Intent
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.ViewFlipper
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.simpan.adapter.adapter
import com.example.simpan.model.model
import kotlinx.android.synthetic.main.fragment_beranda.*

class FragmentBeranda : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_beranda, container, false)
    }

    lateinit var viewflipper: ViewFlipper
    var image = intArrayOf(R.drawable.gbr1,R.drawable.gbr2,R.drawable.gbr3)

    @SuppressLint("WrongConstant")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        btn_notif.setOnClickListener{
            context?.startActivity(Intent(context, NotifikasiActivity::class.java))
        }
        viewflipper = view.findViewById(R.id.v_flipg)

        for(i in 0 until image.size){
            flip_image(image[i])
        }

        val listModell = listOf<model>(
            model(berita = "Berita Pendidikan", url = "http://p4tkboe.kemdikbud.go.id/p4tkboe/index.php?option=com_content&view=article&id=218&catid=8&Itemid=101", gambar = R.drawable.ber1),
            model(berita = "Berita Diklat", url = "http://p4tkboe.kemdikbud.go.id/p4tkboe/index.php?option=com_content&view=article&id=222&catid=8&Itemid=101", gambar = R.drawable.ber2),
            model(berita = "Berita Instansi", url = "http://p4tkboe.kemdikbud.go.id/p4tkboe/index.php?option=com_content&view=article&id=219&catid=8&Itemid=101", gambar= R.drawable.ber3),
            model(berita = "Artikel Progli", url = "http://p4tkboe.kemdikbud.go.id/p4tkboe/index.php?option=com_content&view=article&id=217&catid=8&Itemid=101", gambar=  R.drawable.ber4)
        )

        adapterModel = adapter(listModell)

        recyclerview.apply {
            layoutManager = LinearLayoutManager(context, LinearLayout.HORIZONTAL, false)
            adapter = adapterModel
        }
    }

    fun flip_image (i : Int){
        val view = ImageView(context)
        view.setBackgroundResource(i)

        viewflipper.addView(view)
        viewflipper.setFlipInterval(2500)
        viewflipper.setAutoStart(true)
        viewflipper.setInAnimation(context, android.R.anim.slide_in_left)
        viewflipper.setOutAnimation(context, android.R.anim.slide_out_right)

    }
    private lateinit var adapterModel : adapter
}
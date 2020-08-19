package com.example.simpan.adapter

import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.simpan.R
import com.example.simpan.model.model
import com.example.simpan.model.model_rekap
import kotlinx.android.synthetic.main.card_model.view.*


class adapter(val items: List<model>): RecyclerView.Adapter<adapter.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(
                parent.context
            ).inflate(R.layout.card_model, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding(items.get(position))
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView), View.OnClickListener{
        var url : String = ""

        fun binding(data: model){
            url = data.url
            itemView.lbList.setText(data.berita)
            itemView.card_beranda.setOnClickListener(this)

            Glide.with(itemView.context)
                .load(data.gambar)
                .into(itemView.imgList)

        }

        override fun onClick(p0: View?) {
            when(p0?.id){
                R.id.card_beranda -> loadWebsite(url)
            }
        }

        fun loadWebsite(url : String){
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            itemView.context.startActivity(i)
        }
    }
}
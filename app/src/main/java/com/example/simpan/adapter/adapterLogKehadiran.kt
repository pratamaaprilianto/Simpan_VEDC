package com.example.simpan.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.simpan.R
import com.example.simpan.model.model_logkehadiran
import kotlinx.android.synthetic.main.card_logkehadiran.view.*

class adapterLogKehadiran(val items: List<model_logkehadiran>): RecyclerView.Adapter<adapterLogKehadiran.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.card_logkehadiran,
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return items.size
    }


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun binding(data: model_logkehadiran) {
            itemView.tanggal.setText(data.tanggal)
            itemView.jenis.setText(data.jenis)
            itemView.hari.setText(data.hari)
            itemView.datang.setText(data.datang)
            itemView.late.setText(data.late)
            itemView.pulang.setText(data.pulang)
            itemView.psw.setText(data.psw)
            itemView.potongan.setText(data.potongan)
            itemView.tolate.setText(data.tolate)
            itemView.status.setText(data.status)
        }
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding(items.get(position))
    }
}
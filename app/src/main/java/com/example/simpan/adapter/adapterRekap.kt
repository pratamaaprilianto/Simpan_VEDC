package com.example.simpan.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.simpan.R
import com.example.simpan.model.model_rekap
import kotlinx.android.synthetic.main.card_rekap.view.*

class adapterRekap (val items: List<model_rekap>): RecyclerView.Adapter<adapterRekap.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.card_rekap, parent, false ))
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding(items.get(position))
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun binding(data: model_rekap) {
            itemView.no_rekapp.setText(data.no_rekap)
            itemView.ket_rekap.setText(data.ket_rekap)
            itemView.tgl_rekap.setText(data.tgl_rekap)
            itemView.laporan_rekap.setText(data.laporan_rekap)
        }
    }
}
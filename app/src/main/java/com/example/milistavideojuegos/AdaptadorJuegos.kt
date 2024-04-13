package com.example.milistavideojuegos

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdaptadorJuegos(val juegos_list: List<Juego>): RecyclerView.Adapter<AdaptadorJuegos.JuegoViewHolder>() {

    class JuegoViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        var imagenJuego: ImageView = itemView.findViewById(R.id.imagen_juego)
        var tituloJuego: TextView = itemView.findViewById(R.id.titulo_juego)
        var descJuego: TextView = itemView.findViewById(R.id.desc_juego)
        var consoJuego: TextView = itemView.findViewById(R.id.conso_juego)
        var precioJuego: TextView = itemView.findViewById(R.id.precio_juego)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): JuegoViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.lista_item, parent, false)
        return JuegoViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return juegos_list.size
    }

    override fun onBindViewHolder(holder: JuegoViewHolder, position: Int) {
        val juego: Juego = juegos_list[position]
        holder.imagenJuego.setImageResource(juego.imagen)
        holder.tituloJuego.text = juego.titulo
        holder.descJuego.text = juego.desc
        holder.consoJuego.text = juego.conso
        holder.precioJuego.text = juego.precio
    }
}
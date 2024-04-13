package com.example.milistavideojuegos

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val juegos = listOf(
            Juego(R.drawable.clastle,"Castlevania:Symphony of the Night","El primer juego de una nueva era en la saga Castlevania, acompaña a Alucard a explorar el castillo de su padre Dracula y descubre los secretos que este oculta.","Play Station 1(PSX)","40$"),
            Juego(R.drawable.mario,"Mario & Luigi: Super Star Saga","Los fontaneros mas famosos del mundo se aventuran a explorar el reino Judia, tras un ataque al castillo de la princesa Peach, que descubriran en esta aventura lleno de lugares nunca antes vistos por el duo de hermanos.","Gane Boy Advance(GBA)","30$"),
            Juego(R.drawable.tale,"Tale of the World","En este Spin-Off de la saga Tale encontraras tanto a viejos conocidos como nuevos aliados trabajando juntos para salvar su mundo de un mal que amenaza con erradicarlos.","Play Station Portable(PSP)","30$"),
            Juego(R.drawable.metroid,"Metroid:Zero Mision","La cazarecompensas mas famosa de la galaxia no siempre lo fue acompaña a Samus en su primera aventura y descubre como se convirtio en la cazadora que todos temen y respetan por igual.","Game Boy Advance(GBA)","30$"),
            Juego(R.drawable.zelda,"Zelda: Breath of the Wild","Tras el regreso de Ganon el reino de Hyrule confion en el heroe de la leyenda Link pero no fue suficiente, sin embargo la pricesa Zelda aun no pierde la esperanza sumiendo a Link a un letargo que cure sus heridas a costa de su memoria, pero tras 100 años durmiendo Hyrule aun podra ser salvado.","Nintendo Switch","60$"),
        )

        val recycler_juegos: RecyclerView = findViewById(R.id.list_view)

        recycler_juegos.layoutManager = LinearLayoutManager(this)
        recycler_juegos.adapter = AdaptadorJuegos(juegos)


    }
}
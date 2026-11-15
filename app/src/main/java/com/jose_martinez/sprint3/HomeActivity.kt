package com.jose_martinez.sprint3

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        // Accesibilidad:
        // He utilizado textos de strings.xml, colores de colors.xml y dimensiones de dimen.xml y una descripcion para la imagen, facilitando su accesibilidad.

        // UI:
        // He utilizado colores, tamaños de texto y un shape para crear una pantalla clara y atractiva.

        // UX:
        // La informacion esta organizada y el boton es facil de identificar y utilizar.

        // Buenas practicas:
        // Separamos el diseño XML de la logica Kotlin y utilizamos recursos para textos y colores.

        val btnMoreInfo = findViewById<Button>(R.id.btnMoreInfo)

        btnMoreInfo.setOnClickListener {
            Toast.makeText(
                this,
                R.string.home_toast,
                Toast.LENGTH_SHORT
            ).show()
        }

        val btnDetails = findViewById<Button>(R.id.btnDetails)

        btnDetails.setOnClickListener {
            val intent = Intent(this, DetailActivity::class.java)
            startActivity(intent)
        }

    }
}
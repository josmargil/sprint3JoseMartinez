package com.jose_martinez.sprint3

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        // Accesibilidad:
        // Utilizamos textos de strings.xml y una descripcion
        // para la imagen, facilitando su accesibilidad.

        // UI:
        // Hemos utilizado colores, tamaños de texto y un
        // shape para crear una pantalla clara y atractiva.

        // UX:
        // La informacion esta organizada y el boton es
        // facil de identificar y utilizar.

        // Buenas practicas:
        // Separamos el diseño XML de la logica Kotlin
        // y utilizamos recursos para textos y colores.

        val btnMoreInfo = findViewById<Button>(R.id.btnMoreInfo)

        btnMoreInfo.setOnClickListener {
            Toast.makeText(
                this,
                R.string.home_toast,
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}
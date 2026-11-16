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

        // UI (Interfaz de usuario):
        // He elegido un fondo oscuro con detalles morados y textos claros para diferenciar los elementos de la pantalla.
        // También he personalizado la tarjeta utilizando un shape con esquinas redondeadas y diferentes tamaños de texto.

        // Principios CRAP:
        // Contraste: he destacado el título con un tamaño mayor y negrita para diferenciarlo del resto de información.
        // Repetición: he mantenido los mismos colores y estilos para conseguir un diseño uniforme.
        // Alineación: he utilizado LinearLayout para organizar los componentes verticalmente y mantener los márgenes.
        // Proximidad: he agrupado la imagen, los textos y los botones dentro de una misma tarjeta.

        // UX (Experiencia de usuario):
        // He colocado primero la imagen y la información del evento y después los botones, para que el usuario siga un orden.
        // El primer botón muestra un Toast indicando que todavía no está implementado y el segundo abre DetailActivity.

        // Accesibilidad:
        // He añadido un contentDescription a la imagen para que pueda ser identificada por lectores de pantalla.
        // También he utilizado tamaños de texto en sp y botones con una altura mínima de 48dp para facilitar su uso.

        // Adaptación a diferentes pantallas:
        // He utilizado match_parent y wrap_content para adaptar los componentes al espacio disponible.
        // También he añadido un ScrollView para que se pueda desplazar el contenido cuando no cabe en pantalla.

        // Buenas prácticas:
        // He separado el diseño en XML y la lógica en Kotlin.
        // También he guardado los textos en strings.xml, los colores en colors.xml y las dimensiones en dimens.xml.
        // Así evito el hardcoding y puedo modificar los recursos sin tener que cambiar cada componente por separado.

        // Futura versión:
        // Al haber estado investigando, aprendiendo y ampliando un poco el proyecto, valoro la idea de que existen
        // varios LinearLayout anidados, por lo que podría ser necesario el cambio a ConstraintLayout si tengo la
        // idea de seguir ampliando y detallando aún más MyCard

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

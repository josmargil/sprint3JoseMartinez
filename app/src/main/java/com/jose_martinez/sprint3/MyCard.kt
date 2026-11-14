package com.jose_martinez.sprint3

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import com.jose_martinez.sprint3.databinding.ViewMyCardBinding

class MyCard(
    context: Context,
    attrs: AttributeSet? = null
) : LinearLayout(context, attrs) {

    private val binding = ViewMyCardBinding.inflate(
        LayoutInflater.from(context),
        this,
        true
    )

    fun setData(
        title: String,
        subtitle: String,
        description: String,
        image: Int
    ) {
        binding.txtCardTitle.text = title
        binding.txtCardSubtitle.text = subtitle
        binding.txtCardDescription.text = description

        // Añadimos la imagen desde Kotlin
        binding.imgCard.setImageResource(image)

        // Descripcion accesible de la imagen
        binding.imgCard.contentDescription = context.getString(
            R.string.card_image_description,
            title
        )
    }
}


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
        image: Int,
        date: String,
        location: String,
        category1: String,
        category2: String
    ) {

        // Configuro aquí la Informacion principal
        binding.txtCardTitle.text = title
        binding.txtCardSubtitle.text = subtitle
        binding.txtCardDescription.text = description

        // Configuro aquí la Imagen del evento
        binding.imgCard.setImageResource(image)
        binding.imgCard.contentDescription = context.getString(
            R.string.card_image_description,
            title
        )

        // Configuro aquí la Informacion del evento
        binding.txtCardDate.text = date
        binding.txtCardLocation.text = location

        // Configura aquí las Categorias
        binding.txtCategory1.text = category1
        binding.txtCategory2.text = category2

    }
}

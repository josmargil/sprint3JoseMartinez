package com.jose_martinez.practicatemario

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import com.jose_martinez.practicatemario.databinding.ViewContadorBinding

class Contador @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : LinearLayout(context, attrs, defStyleAttr) {

    private val binding = ViewContadorBinding.inflate(
        LayoutInflater.from(context),
        this,
        true
    )

    var valor: Int = 0

    fun setOnAumentarClickListener(listener: () -> Unit) {
        binding.btnAumentar.setOnClickListener {
            listener()
        }
    }

    fun setOnDisminuirClickListener(listener: () -> Unit) {
        binding.btnDisminuir.setOnClickListener {
            listener()
        }
    }
}



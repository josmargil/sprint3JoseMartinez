package com.jose_martinez.practicatemario

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import com.jose_martinez.practicatemario.databinding.ViewFlorNezuBinding

class FlorNezu @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : LinearLayout(context, attrs, defStyleAttr) {

    private val binding = ViewFlorNezuBinding.inflate(
        LayoutInflater.from(context),
        this,
        true
    )

    init {
        binding.btnFlor.setOnClickListener {
            if (binding.txtNezu.visibility == View.GONE) {
                binding.txtNezu.visibility = View.VISIBLE
            } else {
                binding.txtNezu.visibility = View.GONE
            }
        }
    }
}

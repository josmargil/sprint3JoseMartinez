package com.jose_martinez.practicatemario

import android.os.Bundle
import android.view.View
import android.widget.SeekBar
import androidx.appcompat.app.AppCompatActivity
import android.widget.Toast
import com.jose_martinez.sprint3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.volumenBar.setOnSeekBarChangeListener(
            object : SeekBar.OnSeekBarChangeListener {

                override fun onProgressChanged(
                    seekBar: SeekBar?,
                    progress: Int,
                    fromUser: Boolean
                ) {
                    binding.txtVolumen.text = "Volumen: $progress"
                }

                override fun onStartTrackingTouch(
                    seekBar: SeekBar?
                ) {
                }

                override fun onStopTrackingTouch(
                    seekBar: SeekBar?
                ) {
                }
            }
        )

        binding.cbNotificaciones.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                binding.cbNotificaciones.text = "Notificaciones activadas :D!"
            } else {
                binding.cbNotificaciones.text = "Notificaciones desactivadas... :("
            }
        }

        binding.tvContador.text =
            "${binding.aumentadorDisminuidor.valor}"

        binding.aumentadorDisminuidor.setOnAumentarClickListener {
            binding.aumentadorDisminuidor.valor++

            if (binding.aumentadorDisminuidor.valor == 10) {
                binding.tvContador.text = "SHARINGAN"
            } else {
                binding.tvContador.text =
                    "${binding.aumentadorDisminuidor.valor}"
            }
        }

        binding.aumentadorDisminuidor.setOnDisminuirClickListener {
            binding.aumentadorDisminuidor.valor--

            if (binding.aumentadorDisminuidor.valor == 10) {
                binding.tvContador.text = "SHARINGAN"
            } else {
                binding.tvContador.text =
                    "${binding.aumentadorDisminuidor.valor}"
            }
        }
    }
}


package com.jose_martinez.sprint3

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.jose_martinez.sprint3.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.myCard.setData(
            title = getString(R.string.home_title),
            subtitle = getString(R.string.home_subtitle),
            description = getString(R.string.home_description),
            image = R.drawable.velada_2027,
            date = getString(R.string.card_date_text),
            location = getString(R.string.card_location_text),
            category1 = getString(R.string.card_category_boxing),
            category2 = getString(R.string.card_category_entertainment)
        )
    }
}

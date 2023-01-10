package com.diyorbek.homework131022

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()

        val card: CardView = findViewById(R.id.orderTastyBurger)
        card.setOnClickListener {
            val intent2 = Intent(this, OrderActivity::class.java)
            startActivity(intent2)
            finish()
        }

    }
}
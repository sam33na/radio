package com.wdg.widgets

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.RadioButton

class MainActivity : AppCompatActivity() {
    private lateinit var fin:RadioButton
    private lateinit var marcline:RadioButton
    private lateinit var ice:RadioButton
    private lateinit var noImage:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fin=findViewById(R.id.Fin)
        marcline=findViewById(R.id.Marcline)
        ice=findViewById(R.id.Ice)
        noImage=findViewById(R.id.noImage)

        fin.setOnClickListener()
        {
            noImage.setImageResource(R.drawable.fin)
        }
        marcline.setOnClickListener()
        {
            noImage.setImageResource(R.drawable.mar)
        }
        ice.setOnClickListener()
        {
            noImage.setImageResource(R.drawable.ice)
        }

    }
}
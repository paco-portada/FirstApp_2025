package com.example.firstapp

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.util.Date

class MainActivity : AppCompatActivity(), View.OnClickListener {

    // var textView: TextView? = null
    lateinit var texto: TextView
    // var button: Button? = null
    lateinit var boton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        texto = findViewById(R.id.textView) as TextView
        boton = findViewById(R.id.button) as Button
        boton.setOnClickListener(this)
        actualizar()

    }

    override fun onClick(view: View?) {

        if (view == boton)
            actualizar()

    }

    private fun actualizar() {

        texto.text = Date().toString()

    }
}
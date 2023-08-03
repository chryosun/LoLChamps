package com.example.lolchamps

import android.content.Context
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.AttributeSet
import android.view.View
import android.widget.TextView

class MenuCampeones : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_campeones)

        val valorArgUser= intent.getStringExtra("usuario")
        val txtUser = findViewById<TextView>(R.id.txtMenuUser)

        txtUser.text= valorArgUser.toString()
        txtUser.setTextColor(Color.WHITE)
    }

}
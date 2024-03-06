package com.luvizotto.appcalculadoraimc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var btnCalcular:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Código para Activity 2
        btnCalcular = findViewById(R.id.btnCalcular)

        btnCalcular.setOnClickListener{
            val intent = Intent(this, ResultadoActivity::class.java)

            startActivity( intent )
        }


    }
}
package com.luvizotto.appcalculadoraimc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultadoActivity : AppCompatActivity() {

    private lateinit var pesoText:TextView
    private lateinit var alturaText:TextView
    private lateinit var resultadoText:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        pesoText = findViewById(R.id.pesoText)
        alturaText = findViewById(R.id.alturaText)
        resultadoText = findViewById(R.id.resultadoText)

        val bundle = intent.extras
        if ( bundle!= null ){

            val peso = bundle.getDouble("peso")
            val altura = bundle.getDouble("altura")

            pesoText.text = "Peso informado: $peso kg"
            alturaText.text = "Peso informado: $altura m"

            //Cálculo
            val imc = peso / (altura * altura)

            //Classificação
            if ( imc < 18.5 ){
                resultadoText.text = "BAIXO"
            }else if ( imc in 18.5..24.9 ){
                resultadoText.text = "NORMAL"
            }else if( imc in 25.0..29.9){
                resultadoText.text = "SOBREPESO"
            }else{
                resultadoText.text = "OBESIDADE"
            }

        }

    }
}
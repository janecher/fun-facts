package com.evgeniya.funfacts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    //Declare out View variables
    private var factTextView: TextView? = null
    private var showFactButton: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //assign the Views from the layout file to the corresponding variables
        factTextView = findViewById(R.id.factTextView)
        showFactButton = findViewById(R.id.showFactButton)
        showFactButton!!.setOnClickListener {
            //the button was clicked, so update the fact TextView with a new fact
            val fact = "Ostriches can run faster than horses."
            factTextView!!.text = fact
        }
    }
}
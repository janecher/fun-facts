package com.evgeniya.funfacts

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RelativeLayout
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    private val factBook = FactBook()
    //Declare out View variables
    private var factTextView: TextView? = null
    private var showFactButton: Button? = null
    private var relativeLayout: RelativeLayout? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //assign the Views from the layout file to the corresponding variables
        factTextView = findViewById(R.id.factTextView)
        showFactButton = findViewById(R.id.showFactButton)
        relativeLayout = findViewById(R.id.relativeLayout)
        showFactButton!!.setOnClickListener {
            //Update the screen with our new fact
            val fact = factBook.getFact();
            factTextView!!.text = fact
            relativeLayout!!.setBackgroundColor(Color.RED)
        }
    }
}
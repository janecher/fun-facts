package com.evgeniya.funfacts

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RelativeLayout
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    //get class name
    //private val TAG = MainActivity::class.java.simpleName
    private val factBook = FactBook()
    private  val colorWheel = ColorWheel()
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
            val fact = factBook.getFact()
            val color = colorWheel.getColor()
            factTextView!!.text = fact
            relativeLayout!!.setBackgroundColor(color)
            showFactButton!!.setTextColor(color)
        }

        //Testing
        //Toast.makeText(this, "Info message", Toast.LENGTH_LONG).show()
        //Log.d(TAG, "Info message")
    }
}
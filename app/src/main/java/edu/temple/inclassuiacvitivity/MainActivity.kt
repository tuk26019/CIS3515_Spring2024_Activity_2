package edu.temple.inclassuiacvitivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val spinner = findViewById<Spinner>(R.id.spinner)
        val displayTextView = findViewById<TextView>(R.id.textDisplay)

        /* TODO Step 1: Populate this array */
        //val numberArray = Array Of Numbers
        val numberArray = 1..100

        for (number in numberArray) {
            if (number % 2 == 0) {
                println(number)
            }
        }

        /* TODO Step 2: Create adapter to display items from array in Spinner */
        //spinner.adapter = ArrayAdapter...


        // TODO Step 3: Change TextView's text size to the number selected in the Spinner */
        //spinner.onItemSelectedListener = object: ...

    }
}
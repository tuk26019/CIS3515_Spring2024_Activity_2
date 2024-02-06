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
        val numberArray = (2..100 step 2).toList().toTypedArray()

        /* TODO Step 2: Create adapter to display items from array in Spinner */
        //spinner.adapter = ArrayAdapter...
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, numberArray)
        spinner.adapter = adapter


        // TODO Step 3: Change TextView's text size to the number selected in the Spinner */
        //spinner.onItemSelectedListener = object: ...
        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                val selectedItem = numberArray[position]
                displayTextView.textSize = selectedItem.toFloat()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                // Handle case when nothing is selected (if needed)
            }

        }
        }

    }
package com.sergienkoandrew.lab1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val model = ViewModelProvider(this).get(TextViewModel::class.java)

        val textObserver = Observer<String>{
            value -> findViewById<TextView>(R.id.textView).text = value
        }

        findViewById<Button>(R.id.button).setOnClickListener {
            model.textValue.setValue("New text")
        }

        model.textValue.observe(this, textObserver)
    }
}
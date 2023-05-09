package com.example.myapplication

import android.graphics.Color
import android.graphics.Color.rgb
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioGroup
import android.widget.Switch
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var textView: TextView
    private lateinit var przycisk: Button
    private lateinit var checkBox: CheckBox
    private lateinit var editText: EditText
    private  lateinit var switch1: Switch


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        inicjacjaKontrolek()

        przycisk.setOnClickListener() {
            onPrzyciskClick()
        }


        checkBox.setOnCheckedChangeListener { buttonView, isChecked ->

            if(editText.text.isNotEmpty()) {

                if (isChecked) {

                    Toast.makeText(this, "Jesteś podchorążym", Toast.LENGTH_SHORT).show()
                    textView.setText("pchor. " + editText.text)

                } else {

                    Toast.makeText(this, "Nie jesteś podchorążym", Toast.LENGTH_SHORT).show()
                    textView.text = editText.text
                }
            }
                else {

                    Toast.makeText(this, "Wprowadź dane!", Toast.LENGTH_SHORT).show()
                }
        }


        switch1.setOnCheckedChangeListener{ _, isChecked ->

            if(editText.text.isNotEmpty()) {

                if (isChecked) {

                    Toast.makeText(this, "Jesteś inżynierem", Toast.LENGTH_SHORT).show()
                    textView.setText("pchor. inż.  " + editText.getText())

                } else {

                    Toast.makeText(this, "Nie jesteś inżynierem", Toast.LENGTH_SHORT).show()
                    textView.setText("pchor. " + editText.getText())
                }
            }
            else {

                Toast.makeText(this, "Wprowadź dane!", Toast.LENGTH_SHORT).show()
            }

        }

        }

        private fun onPrzyciskClick() {

            if(editText.text.isNotEmpty()) {
                textView.text = editText.text

            } else {

                Toast.makeText(this, "Wprowadź dane!", Toast.LENGTH_SHORT).show()
            }
        }


        private fun inicjacjaKontrolek() {

            textView = findViewById(R.id.uzytkownik)
            przycisk = findViewById(R.id.przycisk1)
            checkBox = findViewById(R.id.checkBox)
            editText = findViewById(R.id.wprowadzone)
            switch1 = findViewById(R.id.switch1)
        }
    }

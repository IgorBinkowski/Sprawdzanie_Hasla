package com.example.sprawdzaniehasla

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.Sprawdź).setOnClickListener {
            var password = findViewById<TextInputEditText>(R.id.Hasło).text.toString()
            var potwierdź = findViewById<TextInputEditText>(R.id.Potwierdź).text.toString()
            var znak = "-?+(\\.[%!_$#&*-]+)?".toRegex()
            if (password == potwierdź) {
                findViewById<CheckBox>(R.id.checkBox).isChecked = password.any()
            } else {
                findViewById<CheckBox>(R.id.checkBox).isChecked =false
                if (password.any { it.isUpperCase() } && potwierdź.any { it.isUpperCase() }) {
                    findViewById<CheckBox>(R.id.checkBox2).isChecked = password.any()
                } else {
                    findViewById<CheckBox>(R.id.checkBox2).isChecked = false
                }
                if (password.any { it.isLowerCase() } && potwierdź.any { it.isLowerCase() }) {
                    findViewById<CheckBox>(R.id.checkBox3).isChecked = password.any()
                } else {
                    findViewById<CheckBox>(R.id.checkBox3).isChecked = false
                }
                if (password.any { it.isUpperCase() } && potwierdź.any { it.isUpperCase() }) {
                    findViewById<CheckBox>(R.id.checkBox4).isChecked = password.any()
                } else {
                    findViewById<CheckBox>(R.id.checkBox4).isChecked = false
                }
                if (password.any { it.isUpperCase() } && potwierdź.any { it.isUpperCase() }) {
                    findViewById<CheckBox>(R.id.checkBox5).isChecked = password.any()
                } else {
                    findViewById<CheckBox>(R.id.checkBox5).isChecked = false
                }
            }
        }
    }
}
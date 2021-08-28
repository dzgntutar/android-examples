package com.dutar.basiccalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var sayi1: Int? = null
    var sayi2: Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun topla(view: View) {
        sayi1 = editTextOne.text.toString().toIntOrNull()
        sayi2 = editTextTwo.text.toString().toIntOrNull()

        if (sayi1 != null || sayi2 != null)
            textView.text = "Sonu. ${sayi1!! + sayi2!!}"
        else
            textView.text = "HATA!!!"

    }

    fun cikar(view: View) {
        sayi1 = editTextOne.text.toString().toIntOrNull()
        sayi2 = editTextTwo.text.toString().toIntOrNull()

        if (sayi1 != null || sayi2 != null)
            textView.text = "Sonu. ${sayi1!! - sayi2!!}"
        else
            textView.text = "HATA!!!"
    }

    fun carp(view: View) {
        sayi1 = editTextOne.text.toString().toIntOrNull()
        sayi2 = editTextTwo.text.toString().toIntOrNull()

        if (sayi1 != null || sayi2 != null)
            textView.text = "Sonu. ${sayi1!! * sayi2!!}"
        else
            textView.text = "HATA!!!"
    }

    fun bol(view: View) {
        sayi1 = editTextOne.text.toString().toIntOrNull()
        sayi2 = editTextTwo.text.toString().toIntOrNull()

        if (sayi1 != null || sayi2 != null)
            textView.text = "Sonu. ${sayi1!! / sayi2!!}"
        else
            textView.text = "HATA!!!"
    }
}
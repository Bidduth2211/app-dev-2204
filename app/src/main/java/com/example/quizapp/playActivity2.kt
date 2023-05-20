package com.example.quizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class playActivity2 : AppCompatActivity() {
    private val quizList = listOf<quiz>(

     quiz("What is the capital of bangladesh?",
         "Dhaka",
         "Mymensingh",
         "khulna",
         "b.baria",
         "Dhaka" ),

     quiz("What is the currency of bangladesh?",
         "taka",
         "Dollar",
         "Rupi",
         "Uro",
         "Dhaka" ),

     quiz("What is the fruit of bangladesh?",
         "Mango",
         "Banana",
         "Orrange",
         "Apple",
         "Mango" ),

     quiz("What is the Victory day of bangladesh?",
         "16 dec",
         "21 feb",
         "26 mar",
         "10 apr",
         "16 dec"),

        quiz(" Who is the P.M of bangladesh?",
         "Sheik Hassina",
         "Nerendra modi",
         "shi jin ping",
         "jue bidden",
         "Shiek Hassina" ),

     quiz("What is the national animel of bangladesh?",
         "Lion",
         "Cat",
         "Dog",
         "R.B. Tiger",
         "R.B. Tiger"),                                                                                                                                       )



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_play3)
    }
}
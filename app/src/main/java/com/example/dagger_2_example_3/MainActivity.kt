package com.example.dagger_2_example_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val applicationGraph: ApplicationGraph = DaggerApplicationGraph.create()
        val userRepository: UserRepository = applicationGraph.repository()
        val userRepository2: UserRepository = applicationGraph.repository()

        Log.i("MSG", (userRepository == userRepository2).toString())
    }
}
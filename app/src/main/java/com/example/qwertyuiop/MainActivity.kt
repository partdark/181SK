package com.example.qwertyuiop

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView.OnItemClickListener
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bleading: Button = findViewById(R.id.button)
        val tunnel: Button = findViewById(R.id.button2)
        val easy: Button = findViewById(R.id.button3)
        val kvivti: Button = findViewById(R.id.button4)
        val kind: Button = findViewById(R.id.button5)
        val amour: Button = findViewById(R.id.button6)
        val movement: Button = findViewById(R.id.button7)
        val better: Button = findViewById(R.id.button8)
        val discovery: Button = findViewById(R.id.button9)
        val home: Button = findViewById(R.id.button10)
        val fools: Button = findViewById(R.id.button11)
        val girl: Button = findViewById(R.id.button12)

        bleading.setOnClickListener(){
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
        tunnel.setOnClickListener(){
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
        }
        easy.setOnClickListener(){
            val intent = Intent(this, MainActivity4::class.java)
            startActivity(intent)
        }
        kvivti.setOnClickListener(){
            val intent = Intent(this, MainActivity5::class.java)
            startActivity(intent)
        }
        kind.setOnClickListener(){
            val intent = Intent(this, MainActivity6::class.java)
            startActivity(intent)
        }
        amour.setOnClickListener(){
            val intent = Intent(this, MainActivity7::class.java)
            startActivity(intent)
        }
        movement.setOnClickListener(){
            val intent = Intent(this, MainActivity8::class.java)
            startActivity(intent)
        }
        better.setOnClickListener(){
            val intent = Intent(this, MainActivity9::class.java)
            startActivity(intent)
        }
        discovery.setOnClickListener(){
            val intent = Intent(this, MainActivity10::class.java)
            startActivity(intent)
        }
        home.setOnClickListener(){
            val intent = Intent(this, MainActivity11::class.java)
            startActivity(intent)
        }
        fools.setOnClickListener(){
            val intent = Intent(this, MainActivity12::class.java)
            startActivity(intent)
        }
        girl.setOnClickListener(){
            val intent = Intent(this, MainActivity13::class.java)
            startActivity(intent)
        }
    }
}
package com.example.proyectofinal

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn: Button = findViewById(R.id.btnIniciar)
        btn.setOnClickListener {
            val intent: Intent = Intent(this, Inicio::class.java)
            startActivity(intent)

            val btn: Button = findViewById(R.id.btnRegistar)
            btn.setOnClickListener {
                val intent: Intent = Intent(this, Registro::class.java)
                startActivity(intent)

                val btn: Button = findViewById(R.id.imageButton3)
                btn.setOnClickListener {
                    val intent: Intent = Intent(this, compras::class.java)
                    startActivity(intent)

                    val btn: Button = findViewById(R.id.imageButton6)
                    btn.setOnClickListener {
                        val intent: Intent = Intent(this, Usuario::class.java)
                        startActivity(intent)

                        val btn: Button = findViewById(R.id.imageButton4)
                        btn.setOnClickListener {
                            val intent: Intent = Intent(this, Informacion::class.java)
                            startActivity(intent)
                        }


                    }

                }
            }
        }
    }
}
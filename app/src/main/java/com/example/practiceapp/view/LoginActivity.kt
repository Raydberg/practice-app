package com.example.practiceapp.view

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.practiceapp.R

class LoginActivity : AppCompatActivity() {
    private lateinit var btnRegister: Button;
    private lateinit var btnLogin: Button;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)
        initComponent()
        initListeners()
        initUI()

    }


    private fun initUI() {

    }

    private fun initComponent() {
        btnRegister = findViewById(R.id.btnRegister)
        btnLogin = findViewById(R.id.btnLogin)
    }

    private fun initListeners() {
        btnRegister.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
        }
    }

}
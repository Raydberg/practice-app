package com.example.practiceapp.view

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.practiceapp.R
import com.google.android.material.appbar.MaterialToolbar

class RegisterActivity : AppCompatActivity() {

    private lateinit var btnBack: MaterialToolbar;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_register)
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }

        initComponents()
        initListeners()
        initUI()

    }

    private fun initUI() {

    }

    private fun initListeners() {
        // Solo se ejecutara cuando toque el icono
        btnBack.setNavigationOnClickListener {
            finish()
        }
    }

    private fun initComponents() {
        btnBack = findViewById(R.id.topAppBar)
    }

}
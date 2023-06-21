package com.example.portfolio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.portfolio.databinding.ActivityMainBinding
import com.example.portfolio.databinding.ActivityTestBinding

class test : AppCompatActivity() {

    private lateinit var binding: ActivityTestBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityTestBinding.inflate(layoutInflater)

        setContentView(binding.root)

        val id = intent.getStringExtra("id")
        val pw = intent.getStringExtra("pw")
        binding.edittextid2.setText("아이디 : ${id} \n비밀번호 : ${pw}")
    }
}
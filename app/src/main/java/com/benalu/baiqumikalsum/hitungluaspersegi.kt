package com.benalu.baiqumikalsum

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.benalu.baiqumikalsum.databinding.ActivityHitungluaspersegiBinding

class hitungluaspersegi : AppCompatActivity() {
    private lateinit var binding: ActivityHitungluaspersegiBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHitungluaspersegiBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.Hitung.setOnClickListener {
            val panjang = binding.Panjang.text.toString()
            val lebar = binding.Lebar.text.toString()
            val hasil = panjang.toInt() * lebar.toInt()
            binding.Hasil.text = hasil.toString()
        }
        binding.Kembali.setOnClickListener {
            val Kembali = Intent(this@hitungluaspersegi, loginku::class.java)
            startActivity(Kembali)
        }
    }
}
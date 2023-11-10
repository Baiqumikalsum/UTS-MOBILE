package com.benalu.baiqumikalsum

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.benalu.baiqumikalsum.databinding.ActivityLoginkuBinding

class loginku : AppCompatActivity() {
    private lateinit var binding: ActivityLoginkuBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginkuBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.LoginButton.setOnClickListener {
            val Username = binding.Usernamenya.text.toString()
            val Password = binding.Passwordnya.text.toString()
            val Gagal: String = "Username dan Password Salah"
            if (Username == "umi" && Password == "222") {
                val moveIntent = Intent(this@loginku, hitungluaspersegi::class.java)
                startActivity(moveIntent)
            } else {
                binding.Salah.text = Gagal
            }
        }
    }
}
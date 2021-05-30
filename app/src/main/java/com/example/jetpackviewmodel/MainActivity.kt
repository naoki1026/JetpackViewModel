package com.example.jetpackviewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.jetpackviewmodel.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var _binding : ActivityMainBinding? = null
    private val binding get() = _binding!!


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)
        val myViewModel : MyViewModel = ViewModelProvider(this).get(MyViewModel::class.java)

        binding.text1.text = updateData(myViewModel)
        binding.button1.setOnClickListener {
            val name = binding.frmName.text.toString()
            val email = binding.frmEmail.text.toString()
            val age = binding.frmAge.text.toString().toInt()
            myViewModel.add( name, email, age)
            binding.text1.text = updateData(myViewModel)
        }
    }

    fun updateData(vm : MyViewModel) : String {
        val data = vm.getAll()
        var people = ""
        for(item in data){
            people += item.to_S()
            people += "\n"
        }
        return people
    }
}
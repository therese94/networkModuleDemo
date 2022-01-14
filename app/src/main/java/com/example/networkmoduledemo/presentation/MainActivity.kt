package com.example.networkmoduledemo.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.example.networkmoduledemo.R
import com.example.networkmoduledemo.databinding.ActivityMainBinding
import dagger.hilt.EntryPoint
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private val viewModel: MainViewModel by viewModels()
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        onClickSuccessBtn()
        onClickErrorBtn()

        observeSuccess()
        observeError()
    }

    private fun onClickSuccessBtn() {
        binding.getSuccessBtn.setOnClickListener {
            viewModel.getSuccessData()
        }
    }

    private fun onClickErrorBtn() {
        binding.getErrorBtn.setOnClickListener {
            viewModel.getErrorData()
        }
    }

    private fun observeSuccess() {
        viewModel.successData.observe(this, {
            binding.successText = it
        })
    }

    private fun observeError() {
        viewModel.errorData.observe(this, {
            binding.errorText = it
        })
    }
}
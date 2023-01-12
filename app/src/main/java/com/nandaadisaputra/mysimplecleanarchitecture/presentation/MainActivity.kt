package com.nandaadisaputra.mysimplecleanarchitecture.presentation

import android.os.Bundle
import androidx.lifecycle.Observer
import com.nandaadisaputra.mysimplecleanarchitecture.R
import com.nandaadisaputra.mysimplecleanarchitecture.base.activity.BaseActivity
import com.nandaadisaputra.mysimplecleanarchitecture.data.constant.Const
import com.nandaadisaputra.mysimplecleanarchitecture.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding, MainViewModel>(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel.setName(Const.USERNAME.NAME)
        viewModel.message.observe(this, Observer {
            binding.tvWelcome.text = it.welcomeMessage
        })
    }
}
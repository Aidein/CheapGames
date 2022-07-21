package com.example.cheapgames.ui.fragment.main

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.View
import androidx.lifecycle.lifecycleScope
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.cheapgames.R
import com.example.cheapgames.databinding.FragmentMainScreenBinding
import com.example.cheapgames.di.RetrofitModule

class MainScreenFragment : Fragment(R.layout.fragment_main_screen) {
    private val binding by viewBinding(FragmentMainScreenBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}
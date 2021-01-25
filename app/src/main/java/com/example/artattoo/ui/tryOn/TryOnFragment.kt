package com.example.artattoo.ui.tryOn

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.artattoo.R

class TryOnFragment : Fragment() {

    private lateinit var tryOnViewModel: TryOnViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        tryOnViewModel =
                ViewModelProviders.of(this).get(TryOnViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_tryon, container, false)

        return root
    }
}
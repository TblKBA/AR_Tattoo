package com.example.artattoo.ui.profile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.example.artattoo.R
import com.example.artattoo.ui.AR.ARViewModel

class ArFragment : Fragment() {

    private lateinit var arViewModel: ARViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        arViewModel =
            ViewModelProviders.of(this).get(ARViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_ar, container, false)

        return root
    }
}
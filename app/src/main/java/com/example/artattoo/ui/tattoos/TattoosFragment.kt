package com.example.artattoo.ui.tattoos

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.artattoo.R


class TattoosFragment : Fragment() {

    private lateinit var tattoosViewModel: TattoosViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        tattoosViewModel =
                ViewModelProviders.of(this).get(TattoosViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_tattoos, container, false)
        val textView: TextView = root.findViewById(R.id.text_dashboard)
        tattoosViewModel.text.observe(this, Observer {
            textView.text = it
        })
        return root
    }
}
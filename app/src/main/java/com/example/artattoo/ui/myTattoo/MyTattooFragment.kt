package com.example.artattoo.ui.myTattoo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.artattoo.R

class MyTattooFragment : Fragment() {

    private lateinit var mytattooViewModel: MyTattooViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        mytattooViewModel =
                ViewModelProviders.of(this).get(MyTattooViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_mytattoo, container, false)
        val textView: TextView = root.findViewById(R.id.text_dashboard)
        mytattooViewModel.text.observe(this, Observer {
            textView.text = it
        })
        return root
    }
}
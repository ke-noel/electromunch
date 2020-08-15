package com.example.ghostpowermunch.ui.away

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.ghostpowermunch.R

class AwayFragment : Fragment() {

    private lateinit var awayViewModel: AwayViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        awayViewModel =
                ViewModelProviders.of(this).get(AwayViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_away, container, false)
        val textView: TextView = root.findViewById(R.id.text_away)
        awayViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}
package com.example.drawerviewsapp.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.drawerviewsapp.R
import com.example.drawerviewsapp.databinding.FragmentHomeBinding
import com.google.firebase.database.DatabaseReference

class HomeFragment : Fragment() {
    private var _binding: FragmentHomeBinding? = null
    lateinit var _base: DatabaseReference
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    companion object {
        @JvmStatic
        fun newInstance() =
            HomeFragment().apply {
            }
    }
}
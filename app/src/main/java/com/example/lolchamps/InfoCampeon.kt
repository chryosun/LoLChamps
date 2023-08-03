package com.example.lolchamps

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.navigation.fragment.findNavController

class InfoCampeon : Fragment() {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val back = view.findViewById<ImageButton>(R.id.btnBack)

        back.setOnClickListener{
            findNavController().popBackStack()
        }
    }
    companion object {
        fun newInstance() =
            InfoCampeon().apply {
                arguments = Bundle().apply {
                }
            }
    }
}
package com.example.lolchamps

import android.os.Bundle
import android.text.TextUtils.replace
import android.view.View
import android.widget.ImageButton
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import androidx.navigation.Navigation.findNavController
import androidx.navigation.fragment.findNavController


class ListaCampeones : Fragment(R.layout.fragment_lista_campeones) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val ornn = view.findViewById<ImageButton>(R.id.btnOrnn)
        val malzahar = view.findViewById<ImageButton>(R.id.btnMalzahar)
        val sion = view.findViewById<ImageButton>(R.id.btnSion)
        val akali = view.findViewById<ImageButton>(R.id.btnAkali)
        val zed = view.findViewById<ImageButton>(R.id.btnZed)

        ornn.setOnClickListener{
            findNavController().navigate(R.id.action_listaCampeones_to_infoCampeon,bundleOf("campeon" to "ornn"))
        }

        malzahar.setOnClickListener{
            findNavController().navigate(R.id.action_listaCampeones_to_infoCampeon,bundleOf("campeon" to "malzahar"))
        }

        sion.setOnClickListener{
            findNavController().navigate(R.id.action_listaCampeones_to_infoCampeon,bundleOf("campeon" to "sion" ))
        }

        akali.setOnClickListener{
            findNavController().navigate(R.id.action_listaCampeones_to_infoCampeon,bundleOf("campeon" to "akali"))
        }

        zed.setOnClickListener{
            findNavController().navigate(R.id.action_listaCampeones_to_infoCampeon,bundleOf("campeon" to "zed"))
        }


    }


}


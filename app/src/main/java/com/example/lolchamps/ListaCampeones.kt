package com.example.lolchamps

import android.os.Bundle
import android.text.TextUtils.replace
import android.view.View
import android.widget.ImageButton
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit


class ListaCampeones : Fragment(R.layout.fragment_lista_campeones) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val ornn = view.findViewById<ImageButton>(R.id.btnOrnn)
        val malzahar = view.findViewById<ImageButton>(R.id.btnMalzahar)
        val sion = view.findViewById<ImageButton>(R.id.btnSion)
        val akali = view.findViewById<ImageButton>(R.id.btnAkali)
        val zed = view.findViewById<ImageButton>(R.id.btnZed)

        ornn.setOnClickListener{
        requireActivity().supportFragmentManager.commit {
            replace(R.id.fragmentContainerView2, InfoCampeon.newInstance())}
        }

        malzahar.setOnClickListener{
            requireActivity().supportFragmentManager.commit {
                replace(R.id.fragmentContainerView2, InfoCampeon.newInstance())}
        }

        sion.setOnClickListener{
            requireActivity().supportFragmentManager.commit {
                replace(R.id.fragmentContainerView2, InfoCampeon.newInstance())}
        }

        akali.setOnClickListener{
            requireActivity().supportFragmentManager.commit {
                replace(R.id.fragmentContainerView2, InfoCampeon.newInstance())}
        }

        zed.setOnClickListener{
            requireActivity().supportFragmentManager.commit {
                replace(R.id.fragmentContainerView2, InfoCampeon.newInstance())}
        }


    }
        companion object {


            fun newInstance() =
                ListaCampeones().apply {
                    arguments = Bundle().apply {

                    }
                }
        }

}


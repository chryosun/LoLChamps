package com.example.lolchamps

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.google.firebase.firestore.FirebaseFirestore

class InfoCampeon : Fragment() {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var campeon= arguments?.getString("campeon")
        val back = view.findViewById<ImageButton>(R.id.btnBack)
        val txtNom= view.findViewById<TextView>(R.id.txtCampeon)
        val txtDifcultad= view.findViewById<TextView>(R.id.txtDificultad)
        val txtVida= view.findViewById<TextView>(R.id.txtVida)
        val db = FirebaseFirestore.getInstance()

        db.collection("campeones").document(campeon.toString()).get().addOnSuccessListener { document ->
            document?.let {
                val campeon = document.toObject(Campeon::class.java)

            }

        }

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

data class Campeon(
    val dificultad: String = "",
    val dañoAtaque: String = "",
    val vida: String="",
    val rangoAtaque: String?="",
    val rol:String?=""
)
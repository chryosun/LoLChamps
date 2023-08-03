package com.example.lolchamps

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.google.firebase.firestore.FirebaseFirestore


class Registrarse : Fragment(R.layout.fragment_registrarse) {
    private lateinit var btnRegistrarse : Button
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnRegistrarse=view.findViewById(R.id.btnRegIngresar)
        val tBoxNom = view.findViewById<EditText>(R.id.tboxRegNombre)
        val tBoxUser = view.findViewById<EditText>(R.id.tboxRegUsuario)
        val tBoxContra = view.findViewById<EditText>(R.id.tboxRegContra)
        val db = FirebaseFirestore.getInstance()

        btnRegistrarse.setOnClickListener {

            if (tBoxUser.text.isEmpty() || tBoxContra.text.isEmpty() || tBoxNom.text.isEmpty()) {
                mostrar_snack_bar("No se han ingresado todos los datos...")
            } else {
                //show_data(name_catch,apellido_catch,correo_catch)
                val nom_catch = tBoxNom.text.toString().trim()
                val user_catch = tBoxUser.text.toString().trim()
                val contra_catch = tBoxContra.text.toString().trim()


                db.collection("usuarios").document(user_catch).set(Usuario(nom_catch,contra_catch))
                    .addOnSuccessListener { documentReference ->
                        mostrar_snack_bar("Se agrego el usuario exitosamente")
                        findNavController().navigate(R.id.action_login_to_registrarse)
                        findNavController().popBackStack()
                    }
                    .addOnFailureListener { e ->
                        mostrar_snack_bar("Hubo un error en la base de datos, Usuario no creado")
                    }
            }
        }
    }
    private fun mostrar_snack_bar(mensaje: String) {
        Snackbar.make(btnRegistrarse, mensaje, Snackbar.LENGTH_SHORT).show()
    }

}
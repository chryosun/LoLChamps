package com.example.lolchamps

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import com.google.android.material.snackbar.Snackbar
import com.google.firebase.firestore.FirebaseFirestore


class Login : Fragment(R.layout.fragment_login) {

    private lateinit var btnLogueo : Button
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val tBoxUser = view.findViewById<EditText>(R.id.tboxLogUsuario)
        val tBoxContra = view.findViewById<EditText>(R.id.tboxLogContra)
        val db = FirebaseFirestore.getInstance()

        btnLogueo.setOnClickListener {

            val user_catch = tBoxUser.text.toString().trim()
            val contra_catch = tBoxContra.text.toString().trim()

            db.collection("usuarios").document(tBoxUser.text.toString()).get()
                .addOnSuccessListener { document ->
                    document?.let {
                        val usuario = document.toObject(Usuarios::class.java)
                    }
                        .addOnSuccessListener {
                            Log.d("Ingreso de datos", "Se ingresaron los datos correctamente")
                        }
                        .addOnFailureListener { error ->
                            Log.e("ErrorFirebase", "El error es ${error.toString()}")
                        }

                    if (tBoxUser.text.isEmpty() || tBoxContra.text.isEmpty()) {
                        mostrar_snack_bar("No se han ingresado todos los datos")
                    } else {
                        //show_data(name_catch,apellido_catch,correo_catch)
                    } 
                }
        }
    }private fun mostrar_snack_bar(mensaje: String) {
        Snackbar.make(btnLogueo, mensaje, Snackbar.LENGTH_SHORT).show()
    }

}
data class Usuarios(
    val usuario: String = "",
    val contra: String = ""
)
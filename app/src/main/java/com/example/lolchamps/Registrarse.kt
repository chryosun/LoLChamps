package com.example.lolchamps

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import com.google.android.material.snackbar.Snackbar
import com.google.firebase.firestore.FirebaseFirestore


class Registrarse : Fragment(R.layout.fragment_registrarse) {
//    private lateinit var btnRegistrarse : Button
//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//
//        btnRegistrarse=view.findViewById(R.id.btnLogIngresar)
//        val tBoxUser = view.findViewById<EditText>(R.id.tboxLogUsuario)
//        val tBoxContra = view.findViewById<EditText>(R.id.tboxLogContra)
//        val db = FirebaseFirestore.getInstance()
//
//        btnRegistrarse.setOnClickListener {
//
//            if (tBoxUser.text.isEmpty() || tBoxContra.text.isEmpty()) {
//                mostrar_snack_bar("No se han ingresado todos los datos...")
//            } else {
//                //show_data(name_catch,apellido_catch,correo_catch)
//                val user_catch = tBoxUser.text.toString().trim()
//                val contra_catch = tBoxContra.text.toString().trim()
//
//
//                db.collection("usuarios").document(tBoxUser.text.toString()).get().addOnSuccessListener { document ->
//                    document?.let {
//                        val usuario = document.toObject(Usuario::class.java)
//
//                        if (usuario?.contraseña.toString() == contra_catch){
//                            val intento= Intent(this.activity,MenuCampeones::class.java)
//                            startActivity(intento)
//                        }
//                        else{
//                            mostrar_snack_bar("Contraseña incorrecta")
//                        }
//                    }
//
//                }.addOnFailureListener{
//                    mostrar_snack_bar("Error! No existe el usuario ingresado...")
//                }
//            }
//        }
//    }private fun mostrar_snack_bar(mensaje: String) {
//        Snackbar.make(btnRegistrarse, mensaje, Snackbar.LENGTH_SHORT).show()
//    }

}
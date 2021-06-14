package com.zekeriyakement.uygulama

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import kotlinx.android.synthetic.main.fragment_liste.*

class Liste_Fragment : Fragment(R.layout.fragment_liste) {

     private  lateinit var navController: NavController

     private  lateinit var mainActivity : MainActivity

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        mainActivity = requireActivity() as MainActivity

        fr_first_button.setOnClickListener {

            navController.navigate(R.id.action_liste_Fragment_to_detay_Fragment)
        }


    }

}
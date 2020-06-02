package com.essa.curso.jetpack.jetpack.ui.startbasic

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.essa.curso.jetpack.jetpack.R
import kotlinx.android.synthetic.main.start_basic_fragment.*

/*
    Clase que hereda de fragment

    1. SE CREA UNA REFERENCIA HACIA EL VIEWMODEL CREADO, QUE LUEGO EN EL METODO onActivityCreated SERÁ
       INSTANCIADO Y ENLAZADO CON SU VIEWMODEL
    2. SE ENLAZA EL FRAGMENT CON SU VISTA XML

* */
class StartBasicFragment : Fragment() {

    //CONSTANTE DE INSTANCIA DEL FRAGMENT
    companion object {
        fun newInstance() = StartBasicFragment()
    }

    //SE CREA UNA REFERENCIA AL VIEW MODEL
    private lateinit var viewModelBasic: StartBasicViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        /*
            ACA SE ENLAZA EL LAYOUT CORRESPONDIENTE AL FRAGMENT, Y SU ENLACE SE CONFIGURA EN FALSE
        */
        return  inflater.inflate(R.layout.start_basic_fragment, container, false);
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        /*
            ACA SE ESTA ENLAZANDO LA VARIABLE VIEWMODELBASIC CON SU CORRESPONDIENTE ARCHIVO VIEMODEL.KT
        */
        viewModelBasic = ViewModelProviders.of(this).get(StartBasicViewModel::class.java)
        tv_message.text = viewModelBasic.data.value
    }

}

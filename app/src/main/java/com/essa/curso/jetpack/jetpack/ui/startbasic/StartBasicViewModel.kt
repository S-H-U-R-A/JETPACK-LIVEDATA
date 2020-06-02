package com.essa.curso.jetpack.jetpack.ui.startbasic

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


/**
 * Lo primero que se debe hacer es crear una clase que herede de view model,
 * en la cual se van a crear diferentes lista mutables de objetos liveData donde se va a almacenar
 * la info que se quiere volver observable, posterior a esto se crea una objeto liveData que va
 * a ser usado como getter para obtener la info de un elemento de la lista mutable
 * */
class StartBasicViewModel : ViewModel() {
    //Se define una variable Mutable
    private val _data = MutableLiveData<String>()
    //Se le asigna a esta variable publica el valor de la anterior
    //Para que con el metodo get retorne el valor
    //Por ultimo un liveData es un contenedor para un dato observable y esta optimizada para manejar el ciclo de vida
    val data: LiveData<String>
        get() = _data

    init {
        _data.value = "Hola, Jetpack"
    }
}

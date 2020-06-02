package com.essa.curso.jetpack.jetpack

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.essa.curso.jetpack.jetpack.ui.startbasic.StartBasicFragment

class StartBasic : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.start_basic_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, StartBasicFragment.newInstance())
                .commitNow()
        }
    }
}

package com.coayo.biblioteca;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by cice on 31/10/16.
 */
//este layout es el horizontal en vez del activity_main

public class Inicio extends AppCompatActivity {
    Context context;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inicio);
         context = this;

        // inyecto los fragmentos
        FragmentManager miFragmentMmanager = getSupportFragmentManager();
        FragmentTransaction transaccion= miFragmentMmanager.beginTransaction();

        fgbook fragmentolibros = new fgbook();
        transaccion.add(R.id.fgcategorias,fragmentolibros);

        transaccion.commit();



    }

}

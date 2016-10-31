package com.coayo.biblioteca;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends Activity {
    //private RecyclerView RVCat;
    /// RecyclerView.Adapter CatAdapter1;

    // declara los fragmentos

    RecyclerView.LayoutManager CatLayoutManager;
    private ArrayList<String> categorias;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        final DataBaseModel myDB = new DataBaseModel(this);
        context = this;

        final RecyclerView RVCat = (RecyclerView)findViewById(R.id.rvCat);
        RVCat.setAdapter(null);
        myDB.open();
        //categorias =
        categorias = (ArrayList<String>) myDB.getCategorias();
        final CatAdapter miadaptador = new CatAdapter(categorias);
        myDB.close();



     RVCat.setHasFixedSize(true);
// http://www.codigoandroid.es/curso-programacion-android/obtener-la-orientacion-de-pantalla-del-dispositivo-android/
        // http://jarroba.com/programar-fragments-fragmentos-en-android/

        RVCat.setAdapter(miadaptador);

        RVCat.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));

    }
    // al girase debe ponerse la otra vista e inflar los layouts ec el otro layout

}

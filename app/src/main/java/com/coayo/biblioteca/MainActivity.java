package com.coayo.biblioteca;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

public class MainActivity extends Activity {
    //private RecyclerView RVCat;
    /// RecyclerView.Adapter CatAdapter1;
    /*private */RecyclerView.LayoutManager CatLayoutManager;
    private List<String> categorias;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final DataBaseModel myDB = new DataBaseModel(this);
        context = this;
        myDB.open();

        final List<String> categorias = myDB.getCategorias();
        CatAdapter miadaptador = new CatAdapter(categorias);
        myDB.close();

        final RecyclerView RVCat = (RecyclerView)findViewById(R.id.rvCat);
        RVCat.setAdapter(null);

       // RVCat.setHasFixedSize(true);

        RVCat.setAdapter(miadaptador);

      RVCat.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));

    }
}

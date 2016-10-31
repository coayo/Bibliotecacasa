package com.coayo.biblioteca;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by cice on 31/10/16.
 */
// esto inserta el fragmento de lirbos en el contenedor quees inicio
public class fgbook extends Fragment {
    TextView tvfrcontenido;
    Context contexto;

     public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstance){
        View view = inflater.inflate(R.layout.fgbook,container,false);
         contexto = view.getContext();

        tvfrcontenido = (TextView) view.findViewById(R.id.tvcontenido);

         return view;

    }

}

package com.coayo.biblioteca;

/**
 * Created by cice on 31/10/16.
 */

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class fgcategoria extends Fragment{
        Context contexto;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstance){
            View  view = inflater.inflate(R.layout.fgcategoria,container,false);
        contexto = view.getContext();
        return view;

    }


}

package com.coayo.biblioteca;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class CatAdapter extends RecyclerView.Adapter<CatAdapter.CatViewHolder> {

    private ArrayList<String> ListaCtgs;
    //TextView CatName;

    // Clase que maneja los datos al textview que recibira el dato bindeado
    public class CatViewHolder extends RecyclerView.ViewHolder{
        public TextView textviewCatName;

        public CatViewHolder(View v){
            super(v);
            textviewCatName = (TextView) v.findViewById(R.id.rvCat);
        }
                    /*aqui falta ahora crear el onclick al elemento*/
    }
    /*Hasta aqui la clase del viewHolder*/


    public CatAdapter(ArrayList<String> categorias){
        this.ListaCtgs = categorias;
    }

    @Override
    public CatAdapter.CatViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
            View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.categoria, viewGroup,false);
            CatAdapter.CatViewHolder elvholder = new CatViewHolder(v);
                    return elvholder;
    }

    @Override
    public void onBindViewHolder(CatAdapter.CatViewHolder holder, int position) {
            String cat= this.ListaCtgs.get(position);
            holder.textviewCatName.setText(cat);

    }

     public int getItemCount() {
        return ListaCtgs.size();
    }
}

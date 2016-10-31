package com.coayo.biblioteca;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class CatAdapter extends RecyclerView.Adapter<CatAdapter.CatViewHolder> {

    private List<String> ListaCtgs;
    //TextView CatName;

    // Clase que maneja los datos al textview que recibira el dato bindeado
    public static class CatViewHolder extends RecyclerView.ViewHolder{
        public TextView textviewCatName;

        public CatViewHolder(View v){
            super(v);
            textviewCatName = (TextView) v.findViewById(R.id.rvCat);
        }
                    /*aqui falta ahora crear el onclick al elemento*/
    }
    /*Hasta aqui la clase del viewHolder*/


    public CatAdapter(List<String> categorias){
        this.ListaCtgs = categorias;
    }

    @Override
    public CatAdapter.CatViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
            View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.categoria, viewGroup,false);

                    return new CatViewHolder(v);
    }

    @Override
    public void onBindViewHolder(CatAdapter.CatViewHolder holder, int position) {
            holder.textviewCatName.setText(ListaCtgs.get(position));
    }

    public int getItemCount() {
        return ListaCtgs.size();
    }
}

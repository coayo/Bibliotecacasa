package com.coayo.biblioteca;
/**
 * Created by home on 26/10/2016.
 */

public class BookModel{
    int id;
    String titulo,imagen,tamanyo,paginas;

    BookModel(int ID, String tit, String img, String tam, String pags){
        this.id = ID;
        this.titulo = tit;
        this.imagen = img;
        this.tamanyo = tam;
        this.paginas = pags;

    }

    public int getId(){
        return id;
    }
    public void setId(int ID){
        this.id = ID;
    }

    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String tit){
        this.titulo = tit;
    }
    public String getImagen(){
        return imagen;
    }
    public void setImagen(String img){
        this.imagen =  img;
    }
    public String getTamanyo(){
        return tamanyo;
    }
    public void setTamanyo(String tam){
        this.tamanyo = tam;
    }
    public void setPaginas(String pags){
        this.paginas = pags;
    }

    public String getPaginas(){
        return paginas;
    }


}

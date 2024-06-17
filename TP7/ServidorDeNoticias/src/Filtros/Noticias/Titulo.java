package Filtros.Noticias;

import Noticias.Noticia;

import java.util.Locale;

public class Titulo implements FiltroNoticia{
    private String titulo;

    public Titulo(String titulo){
        this.titulo = titulo;
    }

    @Override
    public boolean find(Noticia noticia) {
        return noticia.getTitulo().equalsIgnoreCase(this.titulo);
    }
}

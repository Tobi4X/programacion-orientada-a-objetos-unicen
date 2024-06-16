package Filtros.Noticias;

import Noticias.Noticia;

public class Categoria implements FiltroNoticia{
    private String categoria;
    public Categoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public boolean find(Noticia noticia) {
        return noticia.getCategoria().equalsIgnoreCase(this.categoria);
    }
}

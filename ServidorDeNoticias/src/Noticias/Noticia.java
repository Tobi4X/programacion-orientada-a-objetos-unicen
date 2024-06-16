package Noticias;

public class Noticia {
    private String agencia;
    private String titulo;
    private String categoria;
    private Cuerpo cuerpo;

    public Noticia(String agencia, String titulo, String categoria, Cuerpo cuerpo) {
        this.agencia = agencia;
        this.titulo = titulo;
        this.categoria = categoria;
        this.cuerpo = cuerpo;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getCategoria() {
        return categoria;
    }

    public Cuerpo getCuerpo() {
        return cuerpo;
    }

}

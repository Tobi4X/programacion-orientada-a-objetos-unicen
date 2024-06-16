package Noticias.Elementos;

public class Texto implements Elemento{
    private int id;
    private String texto;

    public Texto(int id, String texto) {
        this.id = id;
        this.texto = texto;
    }

    public int getId() {
        return id;
    }

    public String getTexto() {
        return texto;
    }

    @Override
    public String getElemento() {
        return this.getTexto();
    }
}

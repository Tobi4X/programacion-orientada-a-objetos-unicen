package Noticias.Elementos;

public class Imagen implements Elemento{
    private int id;
    private String informacion;
    public Imagen(int id, String informacion) {
        this.id = id;
        this.informacion = informacion;
    }
    public int getId() {
        return id;
    }
    public String getInformacion() {
        return informacion;
    }

    @Override
    public String getElemento() {
        return this.getInformacion();
    }
}

package Noticias.Elementos;

public class Video implements Elemento{
    private int id;
    private String informacion;
    public Video(int id, String informacion) {
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

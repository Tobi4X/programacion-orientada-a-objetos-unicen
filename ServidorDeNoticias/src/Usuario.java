import Filtros.Noticias.FiltroNoticia;
import Noticias.Noticia;

import java.util.List;

public class Usuario {
    private int id;
    private String nombre;
    private String apellido;
    private String correo;
    private String pass;
    private List<FiltroNoticia> intereses;

    public Usuario(String pass, String correo, String apellido, String nombre, int id) {
        this.pass = pass;
        this.correo = correo;
        this.apellido = apellido;
        this.nombre = nombre;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public String getPass() {
        return pass;
    }

    public List<FiltroNoticia> getIntereses() {
        return intereses;
    }

    public void setIntereses(List<FiltroNoticia> intereses) {
        for (FiltroNoticia f : intereses) {
            this.intereses.add(f);
        }
    }

    public void setInterese(FiltroNoticia f) {
        this.intereses.add(f);
    }

    public boolean leInteresa(Noticia noticia){
        boolean bandera = true;
        for (FiltroNoticia f : intereses) {
            if(!f.find(noticia)) bandera = false;
        }
        return bandera;
    }

}

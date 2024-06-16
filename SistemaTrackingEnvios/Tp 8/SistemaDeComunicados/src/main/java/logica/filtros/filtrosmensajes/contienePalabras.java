package logica.filtros.filtrosmensajes;

import logica.Mensaje;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class contienePalabras implements FilterMsg {
    private List<String> palabras = new ArrayList<>();

    public contienePalabras(String... palabra) {
        Collections.addAll(palabras, palabra);
    }

    @Override
    public boolean find(Mensaje msg) {
        boolean flag = false;
        for (String palabra : palabras) {
            if(msg.getMensaje().contains(palabra)){
                flag = true;
            }
        }
        return flag;
    }
}

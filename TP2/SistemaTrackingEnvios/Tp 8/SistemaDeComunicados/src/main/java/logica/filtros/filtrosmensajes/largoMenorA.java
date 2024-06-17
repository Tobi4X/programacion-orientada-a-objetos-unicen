package logica.filtros.filtrosmensajes;

import logica.Mensaje;

public class largoMenorA implements FilterMsg {
    private int size;

    public largoMenorA(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }


    @Override
    public boolean find(Mensaje msg) {
        return msg.getMensaje().size() <= size;
    }
}

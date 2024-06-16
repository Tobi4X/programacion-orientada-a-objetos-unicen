package logica.receptor;

import logica.Mensaje;
import logica.filtros.filtrosmensajes.FilterMsg;

import java.util.List;
import java.util.ArrayList;

public class Empleado implements Receptor{

    private String nombre;
    private String apellido;
    private int edad;
    private String nroLegajos;
    private List<Mensaje> notificaciones;

    public Empleado(String nombre, String apellido, int edad, String nroLegajos) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.nroLegajos = nroLegajos;
        this.notificaciones = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public String getNroLegajos() {
        return nroLegajos;
    }

    public List<Mensaje> getNotificaciones() {
        List<Mensaje> notificaciones = new ArrayList<>(this.notificaciones);
        return notificaciones;
    }

    public boolean filtrarMensajes(FilterMsg filtro){
        boolean flag = false;
        int i = 0;
        while(flag == false && i < this.notificaciones.size()){
            flag = filtro.find(notificaciones.get(i));
            i++;
        }
        return flag;
    }

    @Override
    public void recibirMensaje(Mensaje m) {
        if(!this.notificaciones.contains(m)){
            this.notificaciones.add(m);
        }
    }

    @Override
    public void enviarMensaje(Mensaje m, Receptor... receptors) {
        m.setSender(this);
        for(Receptor receptor : receptors){
            receptor.recibirMensaje(m);
        }
    }

    @Override
    public List<Receptor> getIntegrantes() {
        return List.of(this);
    }

    @Override
    public int getCantMensajes() {
        return this.notificaciones.size();
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", nroLegajos='" + nroLegajos + '\'' +
               ", notificaciones=" + getCantMensajes() +
                '}';
    }

}

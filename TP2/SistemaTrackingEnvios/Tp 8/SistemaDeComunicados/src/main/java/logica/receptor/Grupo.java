package logica.receptor;

import java.util.*;

import logica.Mensaje;
import logica.filtros.filtrosmensajes.FilterMsg;

public class Grupo implements Receptor{
    private String nombre;
    private String descripcion;
    private List<Receptor> integrantes = new ArrayList();
    private FilterMsg condicionesDeEntrega;

    public Grupo(String nombre, String descripcion, FilterMsg condicionesDeEntrega) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.condicionesDeEntrega = condicionesDeEntrega;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setIntegrantes(List<Receptor> integrantes) {
        this.integrantes = integrantes;
    }

    public FilterMsg getCondicionesDeEntrega() {
        return condicionesDeEntrega;
    }

    public void setCondicionesDeEntrega(FilterMsg condicionesDeEntrega) {
        this.condicionesDeEntrega = condicionesDeEntrega;
    }

    public void setIntegrantes(Receptor... integrantes) {
        this.integrantes.addAll(List.of(integrantes));
    }

    private List<Empleado> filtrarIntegrantes(List<Empleado> integrantes, FilterMsg filterMsg){
        List<Empleado> lista = new ArrayList<>();
        for (Empleado receptor : integrantes) {
            if(receptor.filtrarMensajes(filterMsg)){
                lista.add(receptor);
            }
        }
        return lista;
    }

    private List<Empleado> sinRepetir(){
        List<Empleado> integrantes = new ArrayList<>();

        for(Receptor integrante : this.integrantes){
            for(Receptor integ : integrante.getIntegrantes()) {
                if (!integrantes.contains(integ)){
                    integrantes.add((Empleado) integ);
                }
            }
        }

        return integrantes;
    }

    public List<Empleado> getIntegrantesSinRepetir(){
        List<Empleado> lista = this.sinRepetir();
        return lista;
    }

    public List<Empleado> getIntegrantesSinRepetir(FilterMsg filterMsg){
        return filtrarIntegrantes(getIntegrantesSinRepetir(), filterMsg);
    }

    public List<Empleado> getIntegrantesSinRepetir(Comparator<Empleado> comparator){
        List<Empleado> lista = getIntegrantesSinRepetir();
        lista.sort(comparator);
        return lista;
    }

    public List<Empleado> getIntegrantesSinRepetir(FilterMsg filterMsg, Comparator<Empleado> comparator){
        List<Empleado> lista = getIntegrantesSinRepetir(filterMsg);
        lista.sort(comparator);
        return lista;
    }

    @Override
    public List<Receptor> getIntegrantes() {
        List<Receptor> integrantes = new ArrayList<>();
        for (Receptor receptor : this.integrantes) {
            integrantes.addAll(receptor.getIntegrantes());
        }
        return integrantes;
    }

    @Override
    public void recibirMensaje(Mensaje m) {
        if(this.condicionesDeEntrega != null && this.condicionesDeEntrega.find(m)){
            for(Receptor receptor : integrantes){
                receptor.recibirMensaje(m);
            }
        }
    }

    @Override
    public void enviarMensaje(Mensaje m, Receptor... receptors) {
        for(Receptor receptor : receptors){
            receptor.recibirMensaje(m);
        }
    }

    @Override
    public List<Mensaje> getNotificaciones() {

        List<Mensaje> notificaciones = new ArrayList<>();

        for (Receptor receptor : integrantes) {
            notificaciones.addAll(receptor.getNotificaciones());
        }

        return notificaciones;

    }

    @Override
    public int getCantMensajes() {
        int cantMensajes = 0;
        for (Receptor receptor : integrantes) {
            cantMensajes += receptor.getCantMensajes();
        }
        return cantMensajes;
    }
}

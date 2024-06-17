package tpCinco.camiones.elementos;

import tpCinco.camiones.Cola;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Camion extends Elemento {
    private static Cola camionesPendientes = new Cola();
    private LocalDate fechaDeCarga;

    public Camion(LocalDate fechaDeCarga) {
        this.fechaDeCarga = fechaDeCarga;
        camionesPendientes.agregar(this);
    }

    public LocalDate getFechaDeCarga() {
        return fechaDeCarga;
    }

    public Elemento clonar(){
        return new Camion(fechaDeCarga);
    }

    public List<Camion> getCamionesPendientes() {
        List<Camion> camionesPendientes = new ArrayList<>();
        for (Elemento elemento : Camion.camionesPendientes.obtener()) {
            camionesPendientes.add((Camion) ((Camion)elemento).clonar());
        }
        return camionesPendientes;
    }

    public void descargar(Barco barco){
        barco.cargar();
        Camion.camionesPendientes.eliminar(this);
    }

    @Override
    public boolean comparar(Elemento elemento) {
        return this.fechaDeCarga.isAfter(((Camion) elemento).getFechaDeCarga());
    }
}

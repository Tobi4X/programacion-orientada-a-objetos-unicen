package Envios;

import Direccion;
import TrackingEnvios.Persona;

public class Correspondecia implements Envios{
    private Direccion direccion;
    private Persona destinatario;
    private Persona remitente;
    private double peso;
    private int tracking;

    public Correspondecia(Direccion direccion, Persona destinatario, Persona remitente, double peso, int tracking) {
        this.direccion = direccion;
        this.destinatario = destinatario;
        this.remitente = remitente;
        this.peso = peso;
        this.tracking = tracking;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public Persona getDestinatario() {
        return destinatario;
    }

    public Persona getRemitente() {
        return remitente;
    }

    public double getPeso() {
        return peso;
    }

    public int getTracking() {
        return tracking;
    }

    @Override
    public boolean isSucursal() {
        return false;
    }

    @Override
    public void setTracking(int trackCode) {
        this.tracking = trackCode;
    }
}

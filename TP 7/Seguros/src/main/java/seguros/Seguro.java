package seguros;

import calculadores.CalculadorDeValor;
import logico.Filtro;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Seguro implements EleSeguro{
    private int dni;
    private double montoAsegurado;
    private String desc;
    private int nroPoliza;
    private CalculadorDeValor valor;

    public Seguro(int dni, double montoAsegurado, String desc, int nroPoliza) {
        this.dni = dni;
        this.montoAsegurado = montoAsegurado;
        this.desc = desc;
        this.nroPoliza = nroPoliza;
    }

    public int getDni() {
        return dni;
    }

    public double getMontoAsegurado() {
        return montoAsegurado;
    }

    public String getDesc() {
        return desc;
    }

    public int getNumeroPoliza() {
        return nroPoliza;
    }

    public void setCalcValor(CalculadorDeValor valor) {
        this.valor = valor;
    }

    @Override
    public double getValor() {
        return valor.calcular(this);
    }

    @Override
    public List<EleSeguro> filtrarSeguros(Filtro ff, Comparator cc) {
        List<EleSeguro> ll = new ArrayList<>();
        if (ff.find(this))
            ll.add(this);
        return ll;
    }

}

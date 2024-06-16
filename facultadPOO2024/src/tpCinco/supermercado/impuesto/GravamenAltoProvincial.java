package tpCinco.supermercado.impuesto;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class GravamenAltoProvincial extends Impuesto {

    public GravamenAltoProvincial(String nombre, double porcentaje, double valorFijo) {
        super(nombre, porcentaje, valorFijo);
    }

    @Override
    public double aplicarFijo(double monto){
        System.out.println("Steam");
        if(LocalDate.now().getDayOfWeek().equals(DayOfWeek.SUNDAY)) return monto + montoFijo;
        else return monto;
    }

    @Override
    public String toString() {
        return "GravamenAltoProvincial{" +
                "nombre='" + nombre + '\'' +
                ", porcentaje=" + porcentaje +
                ", montoFijo=" + montoFijo +
                '}';
    }

}

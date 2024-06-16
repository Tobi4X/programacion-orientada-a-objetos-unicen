package tpCinco.supermercado.impuesto;

import java.time.LocalDate;

public class GravamenBajoNacional extends Impuesto {

    public GravamenBajoNacional(String nombre, double porcentaje, double valor) {
        super(nombre, porcentaje, valor);
    }

    @Override
    public double aplicarFijo(double monto) {
        System.out.println("leche");
        if((LocalDate.now().getYear() % 2) == 0) return monto + montoFijo;
        else return monto;
    }

    @Override
    public String toString() {
        return "GravamenBajoNacional{" +
                "nombre='" + nombre + '\'' +
                ", porcentaje=" + porcentaje +
                ", montoFijo=" + montoFijo +
                '}';
    }
}

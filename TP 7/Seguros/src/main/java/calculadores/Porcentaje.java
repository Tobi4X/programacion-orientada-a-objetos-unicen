package calculadores;

import seguros.Seguro;

public class Porcentaje implements CalculadorDeValor{
    private double porcentaje;

    public Porcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public double calcular(Seguro ss) {
        return ss.getMontoAsegurado() * (porcentaje/100);
    }
}

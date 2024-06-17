package calculadores;

import seguros.Seguro;

public class Fijo implements CalculadorDeValor{
    private double valor;

    public Fijo(double valor) {
        this.valor = valor;
    }

    @Override
    public double calcular(Seguro ss) {
        return valor;
    }
}

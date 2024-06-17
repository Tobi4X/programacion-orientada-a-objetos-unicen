package calculadores;

import seguros.Seguro;

public class CalcCompuesto implements CalculadorDeValor{
    CalculadorDeValor c1;
    CalculadorDeValor c2;

    public CalcCompuesto(CalculadorDeValor c1, CalculadorDeValor c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public double calcular(Seguro ss) {
        return c1.calcular(ss) + c2.calcular(ss);
    }
}

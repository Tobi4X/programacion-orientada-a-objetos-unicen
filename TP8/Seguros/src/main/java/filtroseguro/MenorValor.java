package filtroseguro;

import logico.Filtro;
import seguros.Seguro;

public class MenorValor implements Filtro {
    private int valor;

    public MenorValor(int valor) {
        this.valor = valor;
    }

    @Override
    public boolean find(Object o) {
        try{
            return ((Seguro) o).getValor() < valor;
        } catch (Exception e){
            return false;
        }
    }
}

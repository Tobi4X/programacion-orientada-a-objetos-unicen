package comparadores;

import seguros.Seguro;

import java.util.Comparator;

public class MayorValor implements Comparator<Seguro> {

    public MayorValor() {
    }

    @Override
    public int compare(Seguro o1, Seguro o2) {
        return (int) (o1.getValor() - o2.getValor());
    }

}

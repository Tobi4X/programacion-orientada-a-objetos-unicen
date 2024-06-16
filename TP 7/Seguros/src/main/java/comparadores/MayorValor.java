package comparadores;

import seguros.EleSeguro;

import java.util.Comparator;

public class MayorValor implements Comparator {

    public MayorValor() {
    }

    @Override
    public int compare(Object o1, Object o2) {
        try{
            return (int) (((EleSeguro)o1).getValor()-((EleSeguro)o2).getValor());
        }catch (Exception e){
            return 0;
        }
    }

}

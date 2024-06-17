package seguros;

import logico.Filtro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SeguroIntegrador implements EleSeguro{
    private int dni;
    private List<EleSeguro> listaSegurosInculidos;

    public SeguroIntegrador(int dni) {
        this.dni = dni;
    }

    public int getDni() {
        return dni;
    }

    public List<EleSeguro> getListaSegurosInculidos() {
        return new ArrayList<>(listaSegurosInculidos);
    }

    public void addSeguros(EleSeguro... seguro) {
        this.listaSegurosInculidos.addAll(Arrays.asList(seguro));
    }

    public void deleteSeguros(EleSeguro... seguro) {
        this.listaSegurosInculidos.removeAll(Arrays.asList(seguro));
    }

    @Override
    public double getMontoAsegurado() {
        double monto = 0;
        for (EleSeguro seguro : listaSegurosInculidos)
            monto += seguro.getMontoAsegurado();
        return monto;
    }

    @Override
    public int getNumeroPoliza() {
        int numeroPoliza = 0;
        for (EleSeguro seguro : listaSegurosInculidos){
            int aux = seguro.getNumeroPoliza();
            if(aux > numeroPoliza){
                numeroPoliza = aux;
            }
        }
        return numeroPoliza;
    }

    @Override
    public double getValor() {
        double valor = 0;
        for (EleSeguro seguro : listaSegurosInculidos)
            valor += seguro.getValor();
        return valor;
    }

    @Override
    public List<EleSeguro> filtrarSeguros(Filtro ff, Comparator comp) {
        List<EleSeguro> ll = new ArrayList<>();
        for (EleSeguro seguro : listaSegurosInculidos){
            ll.addAll(seguro.filtrarSeguros(ff, comp));
        }
        ll.sort(comp);
        return ll;
    }
}

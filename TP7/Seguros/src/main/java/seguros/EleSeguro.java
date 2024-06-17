package seguros;
import logico.Filtro;

import java.util.Comparator;
import java.util.List;

public interface EleSeguro {
    double getMontoAsegurado();
    int getNumeroPoliza();
    double getValor();
    List<EleSeguro> filtrarSeguros(Filtro ff, Comparator comp);
}

package seguros;

import logico.Filtro;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SeguroTemporal implements EleSeguro{
    private EleSeguro seguro;
    private LocalDate fechaLimite;

    public SeguroTemporal(LocalDate fechaLimite, EleSeguro seguro) {
        this.fechaLimite = fechaLimite;
        this.seguro = seguro;
    }

    public EleSeguro getSeguro() {
        return seguro;
    }

    public LocalDate getFechaLimite() {
        return fechaLimite;
    }

    public boolean getVigencia(){
        return LocalDate.now().isBefore(fechaLimite);
    }

    @Override
    public double getMontoAsegurado() {
        if(this.getVigencia())
            return seguro.getMontoAsegurado();
        System.out.println("El seguro esta vencido");
        return 0;
    }

    @Override
    public int getNumeroPoliza() {
        if (this.getVigencia())
            return seguro.getNumeroPoliza();
        System.out.println("El seguro esta vencido");
        return 0;
    }

    @Override
    public List<Seguro> filtrarSeguros(Filtro ff, Comparator<Seguro> comp) {
        if(this.getVigencia())
            return seguro.filtrarSeguros(ff, comp);
        System.out.println("El seguro esta vencido");
        return new ArrayList<>();
    }

    @Override
    public double getValor() {
        if (this.getVigencia())
            return seguro.getValor();
        System.out.println("El seguro esta vencido");
        return 0;
    }
}

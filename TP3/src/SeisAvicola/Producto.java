package SeisAvicola;

import java.time.LocalDate;

public abstract class Producto {
    protected String nroLote;
    protected LocalDate fechaVencimiento;

    public Producto(String nroLote, LocalDate fechaVencimiento) {
        this.nroLote = nroLote;
        this.fechaVencimiento = fechaVencimiento;
    }
}

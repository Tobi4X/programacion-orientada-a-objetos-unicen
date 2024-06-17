package logica;

import logica.receptor.Empleado;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Mensaje {
    private List<String> mensaje;
    private Empleado sender;
    private LocalDate fechaDeEnvio;

    public Mensaje(LocalDate fechaDeEnvio) {
        this.fechaDeEnvio = fechaDeEnvio;
        this.mensaje = new ArrayList<>();
    }

    public List<String> getMensaje() {
        return mensaje;
    }

    public Empleado getSender() {
        return sender;
    }

    public LocalDate getFechaDeEnvio() {
        return fechaDeEnvio;
    }

    public void setMensaje(String... mensaje) {
        Arrays.stream(mensaje).forEach(msg -> this.mensaje.add(msg));
    }

    public void setSender(Empleado sender) {
        this.sender = sender;
    }

}

package logica.receptor;

import logica.Mensaje;

import java.util.List;

public interface Receptor {
    List<Mensaje> getNotificaciones();
    void recibirMensaje(Mensaje m);
    void enviarMensaje(Mensaje m, Receptor... receptors);
    List<Receptor> getIntegrantes();
    int getCantMensajes();
}

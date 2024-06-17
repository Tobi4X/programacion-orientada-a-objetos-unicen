package logic.envios;

import java.util.ArrayList;
import java.util.List;

public class Conjunto implements Envios {
    private List<Envios> envios;
    private int tracking;

    public Conjunto(int tracking) {
        this.tracking = tracking;
        this.envios = new ArrayList<>();
    }

    public List<Envios> getEnvios() {
        List<Envios> envios = new ArrayList<>();
        envios.addAll(this.envios);
        return envios;
    }

    public int getTracking() {
        return tracking;
    }

    @Override
    public boolean isSucursal() {
        return this.envios.getFirst().isSucursal();
    }

    @Override
    public void setTracking(int trackCode) {
        for (Envios envio : this.envios) {
            envio.setTracking(this.tracking);
        }
    }
}

package tpCuatro.juegoCartas;

import java.util.ArrayList;
import java.util.List;

public class Juego {
    private List<Jugador> jugadores;
    private Mazo mazo;

    public Juego(List<Jugador> jugadores, Mazo mazo) {
        this.jugadores = jugadores;
        this.mazo = mazo;
    }

    public void jugar(){
        while(mazo.getCartas().size()>0) {
            mazo.mezclarCartas();
            List<Carta> cartasJugadas;
            cartasJugadas = this.darCartas(2);
            this.contarPuntos().ganarCartas(cartasJugadas);
            this.sacarCartas();
        }
        System.out.println("El ganador es el jugador " + this.ganador().getNumero());
    }

    private List<Carta> darCartas(int cant){
        List<Carta> cartasJugadas = new ArrayList<>();
        for (int i = 0; i < cant; i++) {
            for (Jugador jugador : this.jugadores) {
                jugador.anadirManoActual(mazo.getCartas().pop());
                mazo.eliminarCarta();
            }
        }
        for (Jugador jugador : this.jugadores) {
            cartasJugadas.addAll(jugador.getManoActual());
        }
        return cartasJugadas;
    }

    private Jugador contarPuntos(){
        Jugador j = new Jugador();
        for (Jugador jugador : this.jugadores) {
            if (jugador.devolverPuntos() > j.devolverPuntos()) {
                j = jugador;
            }
        }
        return j;
    }

    private void sacarCartas(){
        for (Jugador jugador : this.jugadores) {
            jugador.limpiarMano();
        }
    }

    private Jugador ganador(){
        Jugador j = new Jugador();
        for (Jugador jugador : this.jugadores) {
            if (jugador.getCartasGanadas().size() > j.getCartasGanadas().size()) {
                j = jugador;
            }
        }
        return j;
    }

    public static void main(String[] args) {
        Jugador santinoTheGoat = new Jugador(1);
        Jugador santinoTheGoat2 = new Jugador(2);
        List<Jugador> jugadores = new ArrayList<>();
        List<String> palos = new ArrayList<>();
        palos.add("basto");
        palos.add("oro");
        palos.add("espada");
        palos.add("copa");
        jugadores.add(santinoTheGoat);
        jugadores.add(santinoTheGoat2);
        Mazo darioMazini = new Mazo(40,palos);
        Juego juego = new Juego(jugadores, darioMazini);
        juego.jugar();
    }
}

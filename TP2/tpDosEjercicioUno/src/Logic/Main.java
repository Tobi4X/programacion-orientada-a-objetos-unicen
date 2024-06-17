package Logic;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Persona tobiJota = new Persona("Tobias", "Jensen", "45189931", LocalDate.of(2004,3,20));
        tobiJota.setSexo("Masculino");
        System.out.println(tobiJota.esMayor() == true ? "Es Mayor" : "Es menor");
        System.out.println(tobiJota.puedeVotar() == true ? "Puede Votar" : "No Puede Votar");
        System.out.println(tobiJota.toString());
        tobiJota.setfNacimiento(LocalDate.of(2015, 3,20));
        System.out.println(tobiJota.esMayor() == true ? "Es Mayor" : "Es menor");
        System.out.println(tobiJota.puedeVotar() == true ? "Puede Votar" : "No Puede Votar");
        System.out.println(tobiJota.toString());
    }
}
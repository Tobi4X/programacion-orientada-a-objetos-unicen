package Logic;

public class App {
    public static void main(String[] args){
        Serie strangerThings = new Serie("Stranger Things");
        Temporada strangerThingsTempUno = new Temporada(1, strangerThings);
        Temporada strangerThingsTempDos = new Temporada(2, strangerThings);

        Episodio strangerThingsTempUnoEpisodioUno = new Episodio("Piloto", "Episodio de prueba", strangerThingsTempUno);
        Episodio strangerThingsTempUnoEpisodioDos = new Episodio("Dos", "Episodio 2", strangerThingsTempUno);
        Episodio strangerThingsTempUnoEpisodioTres = new Episodio("Tres", "Episodio 3", strangerThingsTempUno);

        Episodio strangerThingsTempDosEpisodioUno = new Episodio("Piloto", "Episodio de prueba", strangerThingsTempDos);
        Episodio strangerThingsTempDosEpisodioDos = new Episodio("Dos", "Episodio 2", strangerThingsTempDos);
        Episodio strangerThingsTempDosEpisodioTres = new Episodio("Tres", "Episodio 3", strangerThingsTempDos);

        strangerThings.temporada(1).episodio(1).verEpisodio();
        strangerThings.temporada(1).episodio(2).verEpisodio();
        strangerThings.temporada(1).episodio(1).calificar(6);
        //System.out.println(strangerThings.temporada(1).episodio(1).getCalificacion());
        strangerThings.temporada(1).episodio(2).calificar(4);
        strangerThings.temporada(1).episodio(3).calificar(1);

        strangerThings.temporada(2).episodio(1).verEpisodio();
        strangerThings.temporada(2).episodio(2).verEpisodio();
        strangerThings.temporada(2).episodio(1).calificar(5);
        strangerThings.temporada(2).episodio(2).calificar(4);
        strangerThings.temporada(2).episodio(3).calificar(1);

        System.out.println(strangerThings.toString());
        System.out.println(strangerThings.temporada(1).toString());
        System.out.println(strangerThings.temporada(1).episodio(1).toString());
        System.out.println(strangerThings.promedioCalificaciones());
        System.out.println(strangerThings.temporada(1).promedioCalificaciones());
        strangerThings.temporada(1).episodio(3).verEpisodio();
        System.out.println(strangerThings.temporada(1).promedioCalificaciones());
        System.out.println(strangerThings.temporada(2).promedioCalificaciones());
        System.out.println(strangerThings.promedioCalificaciones());
        System.out.println(strangerThings.episodiosVistos());
    }
}

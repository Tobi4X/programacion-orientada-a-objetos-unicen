package tpCuatro.jardinPrivado;

public class App {
    public static void main(String[] args) {
        System.out.println(Planta.getIdPlanta());
        Planta.imprimirPlantas();
        for(int i=0; i<10;i++){
            Planta p = new Planta();
            System.out.println(Planta.getIdPlanta());
        }
        System.out.println(Planta.getIdPlanta());
        Planta.imprimirPlantas();
    }
}

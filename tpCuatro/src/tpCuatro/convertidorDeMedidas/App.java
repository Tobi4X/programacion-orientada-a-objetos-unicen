package tpCuatro.convertidorDeMedidas;

public class App {
    public static void main(String[] args) {
        int kg = 1;
        int cm = 1;
        int litro = 1;

        System.out.println(Convertir.kgToLb(kg));
        System.out.println(Convertir.cmToInch(cm));
        System.out.println(Convertir.ltToGalon(litro));
        System.out.println(Convertir.lbToKG(kg));
        System.out.println(Convertir.inchToCM(cm));
        System.out.println(Convertir.galonToLt(litro));


    }
}

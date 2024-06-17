package tpCuatro.convertidorDeMedidas;

public abstract class Convertir {
    private static final double aCM = 2.54;
    private static final double aKG = 0.453592;
    private static final double aLt = 3.78541;

    public static double inchToCM (double num){
        return num *= aCM;
    }

    public static double lbToKG (double num){
        return num *= aKG;
    }

    public static double galonToLt (double num){
        return num *= aLt;
    }

    public static double cmToInch (double num){
        return num /= aCM;
    }

    public static double kgToLb (double num){
        return num /= aKG;
    }

    public static double ltToGalon (double num){
        return num /= aLt;
    }

}

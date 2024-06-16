package filter;

public class RepuestaMayor implements Filtro{
    private int num;

    public RepuestaMayor(int num) {
        this.num = num;
    }

    @Override
    public boolean check(Object o) {
        try{
            return (Integer) o > num;
        } catch (Exception e){
            return false;
        }
    }

}

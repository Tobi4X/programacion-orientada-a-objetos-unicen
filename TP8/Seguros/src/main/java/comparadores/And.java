package comparadores;

import java.util.Comparator;

public class And implements Comparator {
    private Comparator c1;
    private Comparator c2;

    public And(Comparator c1, Comparator c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    public int compare(Object o1, Object o2) {
        if(c1.compare(o1, o2) == 0){
            return c2.compare(o1, o2);
        }
        return c1.compare(o1, o2);
    }
}

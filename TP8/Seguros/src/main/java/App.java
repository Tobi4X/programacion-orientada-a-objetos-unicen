import logico.Filtro;
import logico.logicos.combinados.And;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        List<Double> ll = new ArrayList<Double>();
        ll.add(4.0);
        ll.add(5.0);
        ll.add(6.0);
        ll.add(3.0);
        ll.add(2.0);
        ll.add(10.0);
        System.out.println(ll);
        Collections.sort(ll, Collections.reverseOrder());
        System.out.println(ll);
    }
}

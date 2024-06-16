package logica;

import logica.comparator.ComparadorCantMensajes;
import logica.comparator.ComparadorEdad;
import logica.filtros.filtrosmensajes.FilterMsg;
import logica.filtros.filtrosmensajes.contienePalabras;
import logica.filtros.filtrosmensajes.largoMenorA;
import logica.filtros.filtrosmensajes.logicos.compuestos.FilterMsgAnd;
import logica.receptor.Empleado;
import logica.receptor.Grupo;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {

        Empleado emp1 = new Empleado("aRoberto", "sanchez", 243243, "4332323491391958533");
        Empleado emp2 = new Empleado("fRoberto", "sanchez", 22323, "4334913919585331313");
        Empleado emp3 = new Empleado("gRoberto", "sanchez", 243243, "43491391958531313");
        Empleado emp4 = new Empleado("Rboberto", "sanchez", 4324243, "43323231313");
        Empleado emp5 = new Empleado("noberto", "sanchez", 234324, "43323231313");
        Empleado emp6 = new Empleado("fRoberto", "sanchez", 23, "43323231313");
        Empleado emp7 = new Empleado("jRaoberto", "sanchez", 243243, "491391958533323231313");
        Empleado emp8 = new Empleado("kRoberto", "sanchez", 213, "43323231313");
        Empleado emp9 = new Empleado("lRoberto", "sanchez", 243243, "4491391958533231313");
        Empleado emp10 = new Empleado("dRoberto", "sanchez", 2354, "43323231313");
        Empleado emp11 = new Empleado("Rroberto", "sanchez", 243243, "4332349139195853313");
        Empleado emp12 = new Empleado("yRoberto", "sanchez", 234324, "491391958532323149139195853");

        FilterMsg filtroGrupoUno = new FilterMsgAnd(new contienePalabras("java", "jdk"), new largoMenorA(25));

        Grupo grupoDos = new Grupo("olimpiadas 2023", "como hacer una bomba", null);
        Grupo grupoUno = new Grupo("olimpiadas 2024", "como hacer una bomba", filtroGrupoUno);

        grupoDos.setIntegrantes(emp1, emp3, emp5);
        grupoUno.setIntegrantes(emp1, grupoDos, emp2, emp3, emp4, emp5, emp6, emp7, emp8, emp9, emp10, emp11, emp12);

        Mensaje msgUno = new Mensaje(LocalDate.now());
        Mensaje msgDos = new Mensaje(LocalDate.now());

        msgUno.setMensaje("hola", "como", "java");
        msgDos.setMensaje("hola", "como", "java","hola", "como", "estan","hola", "como", "estan","hola", "como", "estan","hola", "como", "estan","hola", "como", "estan","hola", "como", "estan","hola", "como", "estan","hola", "como", "estan","hola", "como", "estan","hola", "como", "estan","hola", "como", "estan","hola", "como", "estan","hola", "como", "estan","hola", "como", "estan","hola", "como", "estan");

        emp1.enviarMensaje(msgUno, emp3, emp4, emp5, grupoUno);
        emp2.enviarMensaje(msgDos, emp2, emp7,grupoDos,grupoUno);

        System.out.println("Grupo uno sin repetir "+grupoUno.getIntegrantesSinRepetir());
        System.out.println("Grupo dos sin repetir "+grupoDos.getIntegrantesSinRepetir());
        System.out.println("Grupo uno "+grupoUno.getIntegrantes());
        System.out.println("Grupo dos "+grupoDos.getIntegrantes());

        System.out.println("Grupo uno sin repetir por edad "+grupoUno.getIntegrantesSinRepetir(new ComparadorEdad()));
        System.out.println("Grupo uno sin repetir por cant msj"+grupoUno.getIntegrantesSinRepetir(new ComparadorCantMensajes()));

    }
}

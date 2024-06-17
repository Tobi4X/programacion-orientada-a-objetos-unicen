public class Main {
    public static void main(String[] args){
        Banco banco = new Banco("Panama Papers", new Cliente(1, "Pelado", "Cogido", 20901, "pelaextragamer", "apruebotodo123"));
        CajaDeAhorro caja1 = new CajaDeAhorro(1);
        banco.cliente(1).crearCuenta(caja1);
        System.out.println(banco.cliente(1).toString());
        banco.cliente(1).getCajasDeAhorro(1).deposito(1000000);
        System.out.println(banco.cliente(1).toString());
        banco.cliente(1).getCajasDeAhorro(1).extraccion(2000000);
        banco.cliente(1).getCajasDeAhorro(1).extraccion(75000);
        System.out.println(banco.cliente(1).toString());
        banco.cliente(1).eliminarCuenta(caja1);
        System.out.println(banco.cliente(1).toString());
        Cliente cliente2 = new Cliente(2, "Jota", "Violado", 23012, "thejotasgamer145", "ELMASQUECOGE");
        banco.agregarCliente(cliente2);
        System.out.println(banco.cliente(2).toString());
    }
}
// Cabe comeme los huevos peludos

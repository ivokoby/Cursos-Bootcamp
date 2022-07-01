public class Main {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Trabajador trabajador = new Trabajador();
        cliente.nombre = "Carlos";
        cliente.edad = 20;
        cliente.telefono = 12345678;
        cliente.credito = 200;
        System.out.println("Me llamo " + cliente.nombre + ", tengo " + cliente.edad + " años, mi telefono es " + cliente.telefono
                + " y mi credito es " + cliente.credito + "$");

        trabajador.nombre = "Mateo";
        trabajador.edad = 21;
        trabajador.telefono = 23456789;
        trabajador.salario = 100;
        System.out.println("Me llamo " + trabajador.nombre + ", tengo " + trabajador.edad + " años, mi telefono es " + trabajador.telefono
                + " y mi salario es " + trabajador.salario + "$");

    }
}

class Persona{
    int edad;
    int telefono;
    String nombre;
}

class Cliente extends Persona{
    double credito;
}

class Trabajador extends Persona {
    double salario;
}
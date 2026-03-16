import java.util.Scanner;

public class SistemaGestionEmpleados {

    public static void main(String[] args) {
        Empleados empleados = new Empleados(Constantes.CAPACIDAD_INICIAL_EMPLEADOS);
        empleados.darAlta(new Empleado("Juan Juan", Cargo.DESARROLLADOR, 50000));
        empleados.darAlta(new Empleado("María María", Cargo.DISEÑADORA, 45000));
        empleados.darAlta(new Empleado("Pedro Pedro", Cargo.GERENTE, 60000));

        Scanner scanner = new Scanner(System.in);
        System.out.print(Constantes.PREGUNTA_PORCENTAJE_AUMENTO);
        double porcentaje = scanner.nextDouble();

        empleados.aumentarSalario(porcentaje);
        empleados.mostrarListado();

        scanner.close();
    }
}

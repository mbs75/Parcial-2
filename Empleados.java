/**
 * Gestiona una colección de empleados.
 * <p>
 * Esta clase actúa como un contenedor mutable para un conjunto de {@link Empleado}
 * con una capacidad fija definida en el constructor. Proporciona operaciones de alta,
 * listado y aumento de salarios.
 * </p>
 */
public class Empleados {

    /**
     * Lista interna de empleados.
     * <p>
     * Se usa un array para simplificar con una capacidad fija.
     * </p>
     */
    private final Empleado[] lista;

    /** Número de empleados actualmente almacenados. */
    private int count;

    /**
     * Crea un gestor de empleados con capacidad fija.
     *
     * @param capacidad número máximo de empleados que se pueden registrar
     */
    public Empleados(int capacidad) {
        this.lista = new Empleado[capacidad];
        this.count = 0;
    }

    /**
     * Da de alta un nuevo empleado.
     *
     * @param empleado empleado a añadir
     * @throws IllegalStateException si se supera la capacidad máxima
     */
    public void darAlta(Empleado empleado) {
        if (count >= lista.length) {
            throw new IllegalStateException("No se pueden añadir más empleados: capacidad llena");
        }
        lista[count++] = empleado;
    }

    /**
     * Aumenta el salario de todos los empleados en un porcentaje.
     *
     * @param porcentaje porcentaje de aumento (por ejemplo, 10 para +10%)
     */
    public void aumentarSalario(double porcentaje) {
        for (int i = 0; i < count; i++) {
            Empleado empleado = lista[i];
            double nuevoSalario = empleado.getSalario() * (1 + porcentaje / 100);
            empleado.setSalario(nuevoSalario);
        }
    }

    /**
     * Muestra por consola la lista de empleados registrados.
     */
    public void mostrarListado() {
        System.out.println(Constantes.TITULO_LISTA_EMPLEADOS);
        for (int i = 0; i < count; i++) {
            System.out.println(lista[i]);
        }
    }
}

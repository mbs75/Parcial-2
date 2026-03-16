/**
 * Representa un empleado de la empresa.
 * <p>
 * Esta clase mantiene tres atributos: nombre, cargo y salario.
 * Las reglas de validación se aplican en los setters y se usan también en el
 * constructor para garantizar que un {@code Empleado} siempre se cree en un
 * estado válido.
 * </p>
 */
class Empleado {
    /** Nombre completo del empleado (mínimo dos palabras). */
    private String nombre;

    /** Cargo profesional del empleado. */
    private Cargo cargo;

    /** Salario mensual del empleado. */
    private double salario;

    /**
     * Construye un empleado con los datos especificados.
     *
     * @param nombre nombre completo (al menos dos palabras)
     * @param cargo cargo profesional (no nulo)
     * @param salario salario mensual (>= {@link Constantes#SALARIO_MINIMO_CONVENIO})
     * @throws IllegalArgumentException si alguno de los parámetros no cumple las reglas
     */
    public Empleado(String nombre, Cargo cargo, double salario) {
        setNombre(nombre);
        setCargo(cargo);
        setSalario(salario);
    }

    /**
     * Obtiene el nombre completo del empleado.
     *
     * @return el nombre completo
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre completo del empleado.
     *
     * @param nombre nombre completo (al menos dos palabras). No puede ser nulo ni vacío.
     * @throws IllegalArgumentException si el nombre es nulo, vacío o tiene menos de dos palabras
     */
    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }
        String[] partes = nombre.trim().split("\\s+");
        if (partes.length < 2) {
            throw new IllegalArgumentException("El nombre debe contener al menos dos palabras");
        }
        this.nombre = nombre;
    }

    /**
     * Obtiene el cargo profesional del empleado.
     *
     * @return el cargo
     */
    public Cargo getCargo() {
        return cargo;
    }

    /**
     * Establece el cargo del empleado.
     *
     * @param cargo cargo a asignar (no puede ser nulo)
     * @throws IllegalArgumentException si el cargo es nulo
     */
    public void setCargo(Cargo cargo) {
        if (cargo == null) {
            throw new IllegalArgumentException("El cargo no puede ser nulo");
        }
        this.cargo = cargo;
    }

    /**
     * Obtiene el salario mensual del empleado.
     *
     * @return salario mensual
     */
    public double getSalario() {
        return salario;
    }

    /**
     * Establece el salario mensual del empleado.
     *
     * @param salario salario mensual (>= 0 y >= {@link Constantes#SALARIO_MINIMO_CONVENIO})
     * @throws IllegalArgumentException si el salario es negativo o está por debajo del convenio
     */
    public void setSalario(double salario) {
        if (salario < 0) {
            throw new IllegalArgumentException("El salario no puede ser negativo");
        }
        if (salario < Constantes.SALARIO_MINIMO_CONVENIO) {
            throw new IllegalArgumentException("El salario no puede estar por debajo del convenio: " + Constantes.SALARIO_MINIMO_CONVENIO);
        }
        this.salario = salario;
    }

    /**
     * Devuelve una representación textual del empleado.
     *
     * @return cadena con nombre, cargo y salario
     */
    @Override
    public String toString() {
        return Constantes.EMPLEADO_TO_STRING_PREFIX +
                Constantes.EMPLEADO_TO_STRING_NOMBRE + nombre + '\'' +
                Constantes.EMPLEADO_TO_STRING_CARGO + cargo + '\'' +
                Constantes.EMPLEADO_TO_STRING_SALARIO + salario +
                Constantes.EMPLEADO_TO_STRING_SUFFIX;
    }
}

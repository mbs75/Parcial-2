/**
 * Constantes compartidas por la aplicación.
 * <p>
 * Reúne mensajes de texto, formatos y valores numéricos que deben permanecer
 * centralizados para facilitar la modificación y la localización.
 * </p>
 */
public final class Constantes {

    private Constantes() {
        // Prevent instantiation
    }

    // Textos mostrados en consola

    /** Pregunta para solicitar el porcentaje de aumento de salario. */
    public static final String PREGUNTA_PORCENTAJE_AUMENTO = "Introduzca el porcentaje de aumento de salario: ";

    /** Título que se muestra antes de la lista de empleados. */
    public static final String TITULO_LISTA_EMPLEADOS = "Lista de Empleados:";

    // Textos usados en la representación de Empleado (toString)

    /** Prefijo del método {@code toString()} de {@link Empleado}. */
    public static final String EMPLEADO_TO_STRING_PREFIX = "Empleado{";

    /** Texto del campo nombre en {@code toString()}. */
    public static final String EMPLEADO_TO_STRING_NOMBRE = "nombre='";

    /** Texto del campo cargo en {@code toString()}. */
    public static final String EMPLEADO_TO_STRING_CARGO = ", cargo='";

    /** Texto del campo salario en {@code toString()}. */
    public static final String EMPLEADO_TO_STRING_SALARIO = ", salario=";

    /** Sufijo del método {@code toString()} de {@link Empleado}. */
    public static final String EMPLEADO_TO_STRING_SUFFIX = "}";

    // Números "mágicos"

    /** Capacidad inicial usada para la lista de empleados en el ejemplo. */
    public static final int CAPACIDAD_INICIAL_EMPLEADOS = 3;

    /** Salario mínimo de convenio usado para validar los salarios. */
    public static final double SALARIO_MINIMO_CONVENIO = 15000.0;
}

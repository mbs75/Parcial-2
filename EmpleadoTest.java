import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmpleadoTest {

    @Test
    void crearEmpleado_ValoresValidos_NoLanzaExcepcion() {
        assertDoesNotThrow(() -> new Empleado("Juan Pérez", Cargo.DESARROLLADOR, 20_000));
        assertDoesNotThrow(() -> new Empleado("María López", Cargo.DISEÑADORA, 15_000));
        assertDoesNotThrow(() -> new Empleado("Ana María", Cargo.GERENTE, 50_000));
    }

    @Test
    void crearEmpleado_NombreVacio_LanzaIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class,
                () -> new Empleado("", Cargo.DESARROLLADOR, 20_000));
    }

    @Test
    void crearEmpleado_NombreUnaPalabra_LanzaIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class,
                () -> new Empleado("Juan", Cargo.DESARROLLADOR, 20_000));
    }

    @Test
    void crearEmpleado_CargoNulo_LanzaIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class,
                () -> new Empleado("Juan Pérez", null, 20_000));
    }

    @Test
    void crearEmpleado_SalarioNegativo_LanzaIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class,
                () -> new Empleado("Juan Pérez", Cargo.DESARROLLADOR, -1));
    }

    @Test
    void crearEmpleado_SalarioCero_LanzaIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class,
                () -> new Empleado("Juan Pérez", Cargo.DESARROLLADOR, 0));
    }

    @Test
    void crearEmpleado_SalarioPorDebajoDelConvenio_LanzaIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class,
                () -> new Empleado("Juan Pérez", Cargo.DESARROLLADOR, 10_000));
    }
}

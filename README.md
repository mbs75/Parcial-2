# Sistema de Gestión de Empleados

Este proyecto es un pequeño ejemplo en Java que gestiona una lista de empleados y permite aumentar sus salarios.

## 📌 Estructura del proyecto

- `Empleado.java`: modelo que representa un empleado con nombre, cargo y salario.
- `Cargo.java`: enum con los cargos profesionales válidos.
- `Empleados.java`: gestor de una colección de empleados (alta, listado, aumento de salario).
- `SistemaGestionEmpleados.java`: clase con el método `main` para ejecutar el programa.
- `Constantes.java`: contiene mensajes y valores fijos para evitar strings mágicos.
- `EmpleadoTest.java`: tests JUnit 5 para validar las reglas de negocio del modelo.
- `TESTING.md`: análisis de caja negra con casos válidos y no válidos.

## 🧩 Uso

1. Compilar: `javac *.java`
2. Ejecutar: `java SistemaGestionEmpleados`

## 🧪 Tests

Este proyecto utiliza JUnit 5 para pruebas unitarias. Para ejecutar los tests:

- Si usas un IDE como IntelliJ/VS Code, simplemente ejecuta `EmpleadoTest`.
- Con Maven/Gradle: añade la dependencia de JUnit 5 y ejecuta la suite de tests.

## 📝 Autoría y versión

- **Autor**: (tu nombre aquí)
- **Versión**: 1.0.0

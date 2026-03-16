# Testing de Caja Negra - Clase `Empleado`

Este documento describe el análisis de cajas negras para los atributos de la clase `Empleado`.

## Criterios de aceptación (valores válidos)

- **Nombre**: no puede ser vacío; debe contener al menos dos palabras (p. ej. "Juan Pérez").
- **Cargo**: debe ser uno de los valores definidos en `Cargo` (`DESARROLLADOR`, `DISEÑADORA`, `GERENTE`).
- **Salario**: debe estar presente, no puede ser negativo y no puede estar por debajo del salario mínimo de convenio (se asumirá **15 000** como valor de ejemplo).

---

## 1) Análisis de parámetros

| Parámetro | Tipo | Dominio válido | Restricciones adicionales |
|-----------|------|----------------|--------------------------|
| `nombre`  | `String` | Cualquier cadena de texto | No vacío; debe contener al menos dos palabras separadas por espacios |
| `cargo`   | `Cargo` (enum) | `DESARROLLADOR`, `DISEÑADORA`, `GERENTE` | Debe ser uno de los valores definidos en el enum |
| `salario` | `double` | >= 0 | Debe ser >= 0 y >= convenio (15 000) |

---

## 2) Casos válidos

| Caso | `nombre` | `cargo` | `salario` | Resultado esperado |
|------|----------|---------|-----------|-------------------|
| V1 | "Juan Pérez" | `Cargo.DESARROLLADOR` | 20 000 | Se crea `Empleado` correctamente |
| V2 | "María López" | `Cargo.DISEÑADORA` | 15 000 | Se crea `Empleado` correctamente (igual a convenio) |
| V3 | "Ana María" | `Cargo.GERENTE` | 50 000 | Se crea `Empleado` correctamente |

---

## 3) Casos no válidos

| Caso | `nombre` | `cargo` | `salario` | Problema esperado |
|------|----------|---------|-----------|-------------------|
| NV1 | "" (vacío) | `Cargo.DESARROLLADOR` | 20 000 | Nombre no debe estar vacío |
| NV2 | "Juan" (una palabra) | `Cargo.DESARROLLADOR` | 20 000 | Nombre debe tener al menos dos palabras |
| NV3 | "Juan Pérez" | (null / no válido) | 20 000 | Cargo no válido / no está en el enum |
| NV4 | "Juan Pérez" | `Cargo.DESARROLLADOR` | -1 | Salario negativo |
| NV5 | "Juan Pérez" | `Cargo.DESARROLLADOR` | 0 | Salario igual a cero (si se asume convenio > 0) |
| NV6 | "Juan Pérez" | `Cargo.DESARROLLADOR` | 10 000 | Salario por debajo de convenio (15 000) |

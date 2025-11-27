# Sistema de Procesamiento de Pedidos de Restaurante

Sistema de Procesamiento de Pedidos de Restaurante implementado con **Arquitectura de 3 Capas** y **5 Patrones de Diseño** en Java.

## Descripción

Sistema de procesamiento de pedidos para restaurante que permite crear pedidos, agregar extras dinámicamente y procesar pagos con diferentes métodos.

**Funcionalidades:**
- Crear pedidos (Desayuno, Almuerzo, Cena)
- Agregar extras opcionales (Queso Extra, Porción Extra, Bebida Premium)
- Procesar pagos (Efectivo, Tarjeta, Transferencia)
- Almacenar pedidos en memoria
- Ver estadísticas del sistema

## Arquitectura de 3 Capas

**Presentación**: Interfaz de usuario (consola)

**Negocio**: Lógica del restaurante, reglas de negocio, patrones

**Datos**: Persistencia y procesamiento de pagos

## Patrones de Diseño

**Factory Method** - Crea diferentes tipos de pedidos

**Singleton** - Única instancia del DAO

**Decorator** - Agrega extras dinámicamente

**Strategy** - Métodos de pago intercambiables

**DAO** - Abstrae el acceso a datos

## Principios SOLID

**Single Responsibility** - Cada clase tiene una única responsabilidad

**Open/Closed** - Abierto a extensión, cerrado a modificación

**Liskov Substitution** - Las implementaciones son sustituibles

**Interface Segregation** - Interfaces específicas y pequeñas

**Dependency Inversion** - Dependencia en abstracciones

## Estructura

```
datos/          - Capa de Acceso a Datos (6 archivos)
negocio/        - Capa de Lógica de Negocio (12 archivos)
presentacion/   - Capa de Presentación (1 archivo)
Main.java       - Clase principal
```

## Instalación y Ejecución

**Requisitos**: Java 8 o superior

**Ejecutar**:
```bash
java Main
```

## Características

- 20 archivos Java
- 600 líneas de código aproximadas
- 5 patrones de diseño
- 3 interfaces
- 72 combinaciones posibles de pedidos

## Ventajas

**Separación de responsabilidades** - Cada capa con función específica

**Mantenibilidad** - Fácil modificar una capa sin afectar otras

**Testabilidad** - Cada capa se puede probar independientemente

**Escalabilidad** - Simple agregar nuevas funcionalidades

**Reutilización** - La lógica de negocio puede usarse con diferentes interfaces


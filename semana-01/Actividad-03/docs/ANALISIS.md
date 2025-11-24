# Actividad 3: Creacion de la clase principal

## Objetivo de la Actividad
Crear el primer Objeto del dominio, la clase **`Event`**, definiendo sus atributos (características), el constructor (fábrica de objetos) y un método (comportamiento) básico con base al dominio asignado.


## 1. Decisión de Atributos (Características)

Elegimos los 3 atributos que son esenciales para identificar y describir un Evento desde el punto de vista de negocio de "Celebraciones Especiales":
- `codigoEvento`: El codigo unico para cada evento creado.
- `tipoEvento`: El tipo de evento (ej: boda, fiesta infantil y/o empresarial).
- `asistentes`: El numero de personas esperadas para el evento. 


## 2. Definición del Constructor y el Método

### A. El Constructor

* **Propósito:** Asegurar que cada Objeto `Event` que se cree tenga, de forma obligatoria, un **código**, un **tipo** y el número de **asistentes** definidos desde el inicio. Si estos datos faltan, el Evento no se puede registrar.

### B. El Método de Comportamiento

* **Método:** `mostrarInformacion()`.
* **Propósito:** Este método es el primer **comportamiento** que le damos al objeto. Permite que el Objeto `Event` se muestre e imprima todos sus datos
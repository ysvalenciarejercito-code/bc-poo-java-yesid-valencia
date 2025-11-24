# Actividad 2: Comparación de Paradigmas PE y POO

## Paradigmas de Programación
Paradigma se refiere a como organizamos, estructuramos y escribimos el codigo en programacion.

## 1. Programación Estructurada (PE)

### Concepto y Organización

La Programación Estructurada se enfoca en la secuencia de pasos que se traducen como instrucciones y en el control del flujo del programa con base a dichas instrucciones.

* Su enfoque principal es el seguimiento de pasos.
* Su organizar es dividir el codigo en bloques logicos llamados funciones.
* Aca las variables y funciones existen en forma separada.
* Utiliza estructuras de control básicas como `if` (condicionales), `while`/`for` (bucles).
* A medida que el proyecto crece, es difícil manejar la interacción entre las funciones y los datos sueltos, lo que aumenta el riesgo de errores en la gestión de información.

### Estructura en Código (Clase `EventPE.java`)

En este paradigma, la información del Evento (`codigoEvento`, `asistentes`) y la acción (`mostrarInformacion()`) son independientes.

* En el `main`, llamamos a la acción (`EventPE.mostrarInfo()`) sin necesidad de crear un objeto. La función opera sobre las variables que están "flotando" en ese archivo debido a que no estan protegidas.

---

## 2. Programación Orientada a Objetos (POO)

### Concepto y Organización

La Programación Orientada a Objetos se enfoca en la creación de **entidades (Objetos)** que representan elementos del mundo real.

* Se centra en quien es el objeto con base a la plantilla llamada Clase.
* **Encapsulamiento:** Es uno de los pilares mas importantes de POO que es agrupar los atributos y metodos de una clase, tambien cambiando su control de acceso hacia todo el programa.
* Si necesito un nuevo Evento, simplemente creo un nuevo Objeto de la Clase `Event`, sin reescribir la lógica lo que ocasiona que se reutiliza codigo.
* **Ventaja Principal:** El encapsulamiento mejora la **seguridad** y la **modularidad**, haciendo que proyectos grandes sean más fáciles de mantener y modificar.

### Estructura en Código (Clase `EventPOO.java`)

En este paradigma, creamos la Clase `EventPOO` como una plantilla organizado.

* **Implementación:** Usamos **Atributos** (`codigoEvento`, `asistentes`) y los unimos a un **Método** (`mostrarInformacionEvento()`) dentro de la misma Clase.
* En el `main`, debemos crear una **instancia** (un Objeto) de la Clase, como `bodaClienteA`. Para que la Boda muestre sus datos, le pedimos directamente a bodaClienteA que ejecute su propia acción (`bodaClienteA.mostrarInfo()`).
* **Ventaja:** Si creamos otro objeto (`fiestaCorporativa`), sus datos son **independientes**; un cambio en la Boda no afecta a la Fiesta Corporativa.

---
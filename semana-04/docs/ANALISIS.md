# Actividad 4: Múltiples Objetos

##  Objetivo de la Actividad
Demostrar el uso de la **plantilla** clase (`Event`) creado en la actividad anterior para construir cinco objetos reales, verificando que cada uno funciona con sus propios datos.


## 1. El Proceso de Construcción (Instanciación)

* La instanciacion es el proceso de utilizar la plantilla creada por una clase que contiene sus atributos (variables) y comportamientos (metodos) para la creacion de una instancia u objeto. 
* En el Código (`Main.java`): Usamos la palabra **`new`** para llamar al constructor de la clase y crear cinco Eventos distintos. Por ejemplo, `Event boda = new Event(...)`.

## 2. La Necesidad de Cinco Eventos

La empresa "Celebraciones Especiales" no maneja solo un evento, maneja muchos. Por eso, crear cinco objetos es fundamental:

* **Reutilización:** Demostramos que el molde `Event` es **eficiente**. No tuvimos que reescribir código cinco veces; solo lo usamos cinco veces.
* **Independencia:** Cada uno de los cinco Objetos es una **entidad única**.  Si la Boda cambia de asistentes, el evento de la Cena de Gala no se entera ni se afecta. Esto asegura la **organización de los datos**.

## 3. Uso del Comportamiento (`mostrarInformacion()`)

Después de crear cada Objeto, debemos verificar que están vivos y correctos.

* **Acción:** Le pedimos a cada uno de los cinco Objetos que ejecute su propia acción: **`mostrarInformacion()`**.
* **Resultado:** Esto confirma que el método es una **capacidad personal** de cada Objeto. La Boda solo muestra los datos de la Boda, y la Conferencia solo muestra sus propios datos. Esto prueba que la estructura que hicimos está funcionando correctamente.
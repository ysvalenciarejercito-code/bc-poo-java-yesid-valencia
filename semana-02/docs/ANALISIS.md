## 📝 3. Estructura del `ANALISIS.md` Semanal (`semana-XX/docs/ANALISIS.md`)

Este es el documento donde explicas tu diseño de POO. **Recuerda que este contenido debe cambiar totalmente cada semana** para reflejar el nuevo problema.

```markdown
# Análisis del Dominio: [Tu Dominio]

## 1. Identificación de Objetos

### Objeto Principal: [Nombre de la Clase Principal, e.g., Reserva]
- **Justificación:** [Explicar por qué es la entidad central del problema (Dominio)]
- **Atributos identificados:** [Listar los atributos privados necesarios y su tipo, e.g., `private String codigoReserva;`]
- **Comportamientos:** [Listar los métodos públicos, e.g., `public void mostrarInformacion()`, `public double calcularPrecio()`]

### Objeto Secundario: [Nombre de la Clase Secundaria, e.g., Cliente]
- **Justificación:** [Explicar su rol de soporte o relación con el objeto principal]
- **Relación con objeto principal:** [Describir cómo se relacionan (Asociación, Composición o Agregación) e.g., "Una `Reserva` está asociada a un `Cliente`."]

## 2. Diagrama de Clases (opcional)
[Insertar diagrama UML de clases o una descripción textual clara de la herencia/relaciones]

## 3. Decisiones de Diseño
- ¿Por qué elegí estos atributos? [Ej: Elegí un `String` para el ID de reserva porque contiene letras y números.]
- ¿Qué validaciones implementé? [Ej: Se valida que el precio sea mayor a cero en el constructor.]
- ¿Qué relaciones identifiqué? [Ej: Se implementó **Encapsulamiento** haciendo todos los atributos `private` y usando *getters* y *setters*.]

## 4. Dificultades Encontradas
[Opcional: Describir un problema técnico o conceptual encontrado durante la implementación y cómo se resolvió.]
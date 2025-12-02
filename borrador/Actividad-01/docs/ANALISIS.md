# Análisis del Dominio: Empresa de Eventos "Celebraciones Especiales"

## 1. Identificación de Objetos (Actividad 1 - Ejercicio 01)

Se han identificado 5 objetos principales con base al dominio asignado que es Empresa de Eventos "Celebraciones Espciales".

---

### Objeto 1: Evento (Objeto Principal)

- **¿Qué es?:** Es un acontecimiento planificado y organizado para un cliente, representando el objetivo y funcion del dominio o empresa.
- **Características:**
    - `codigo` Identificador único del evento.
    - `tipo` Categoría del evento (ej: boda, evento empresarial, fiesta infantil).
    - `fecha` Día y hora del evento.
    - `lugar` Ubicación donde se realizara.
    - `asistentes` Número de personas esperadas.
- **Comportamientos:**
    - `agendar()`: Registrar el evento en el calendario de la empresa.
    - `planificar()`: Definir los servicios requeridos (catering, decoración, etc.).
    - `coordinar()`: Gestionar el equipo interno y los proveedores.
    - `ejecutar()`: Realizar la logística y supervisión durante el evento.
    - `facturar()`: Generar el cobro final al cliente.

---

### Objeto 2: Cliente

- **¿Qué es?:** La persona o empresa que contrata y financia el Evento, siendo la fuente de ingreso.
- **Características:**
    - `idCliente` Identificador único del cliente.
    - `nombreCompleto` Nombre del cliente principal.
    - `telefono` Número de contacto.
    - `correo` Dirección de email para comunicarse con el cliente.
    - `tipoCliente` Social (Boda/Cumpleaños) o empresarial.
- **Comportamientos:**
    - `solicitarCotizacion()`: Iniciar la petición de un servicio.
    - `aprobarPresupuesto()`: Dar el visto bueno para la ejecución.
    - `realizarPago()`: Registrar un abono o pago final del evento.

---

### Objeto 3: Organizador

- **¿Qué es?:** El empleado de la empresa encargado de la gestión interna, planificación detallada y la logística directa de uno o varios Eventos.
- **Características:**
    - `idOrganizador` Identificador de empleado.
    - `nombre` Nombre del organizador de eventos.
    - `eventosAsignados` Cantidad de eventos activos a su cargo.
    - `cargo` Rol específico (ej: Coordinador de Logística).
- **Comportamientos :**
    - `asignarEvento()`: Vincularse a un nuevo Evento.
    - `supervisarProveedores()`: Evaluar y coordinar a los aliados.
    - `generarReporte()`: Documentar el progreso semanal del Evento.

---

### Objeto 4: Proveedor

- **¿Qué es?:** Una empresa externa y/o aliada que proporciona servicios especializados (catering, fotografía, música) necesarios para complementar y realizar el Evento.
- **Características:**
    - `nit` Identificación de la empresa.
    - `nombreEmpresa` Nombre comercial del proveedor.
    - `servicioOfrecido` Tipo de servicio (ej: "Mobiliario", "Catering").
    - `tarifaBase` Costo de referencia del servicio.
- **Comportamientos:**
    - `presentarCotizacion()`: Enviar un presupuesto detallado para un evento.
    - `ejecutarServicio()`: Prestar el servicio el día del evento.
    - `emitirFactura()`: Generar el documento de cobro a "Celebraciones Especiales".

---

### Objeto 5: Servicio

- **¿Qué es?:** Un paquete o un ítem específico que la empresa le vende al cliente. Es cada cosa que se suma al total de la cuenta y que arma la fiesta: el alquiler de la tarima, la docena de centros de mesa, o el menú de tres platos, etc.
- **Características:**
    - `nombre` Nombre del paquete o ítem (ej: "Menú Infantil").
    - `descripcion` Detalles del servicio ofrecido.
    - `precioUnitario` Costo por unidad o paquete.
    - `cantidad` Unidades requeridas para el evento (ej: 150 sillas, 1 paquete de decoración).
- **Comportamientos:**
    - `calcularSubtotal()`: Multiplicar precio por cantidad.
    - `agregarADetalle()`: Incluir este ítem en el presupuesto de un Evento.
    - `modificarCantidad()`: Ajustar el número de unidades solicitadas.

---

## 2. Decisiones de Diseño

- **Objeto Principal:** La clase **`Evento`** es la entidad principal ya que agrupa y coordina a todos los demás objetos (Cliente lo contrata, Organizador lo gestiona, y usa Proveedores/Servicios).

- **Especialidad:** La inclusión de `Proveedor` y `Servicio` son vitales porque la empresa no produce todo y tambien especializa sus funciones.
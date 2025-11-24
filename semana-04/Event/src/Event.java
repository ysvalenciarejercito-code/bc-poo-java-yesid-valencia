public class Event {
    String codigoEvento;
    String tipoEvento;
    int numeroAsistentes;

    //Constructor
    public Event(String codigoEvento, String tipoEvento, int numeroAsistentes) {
        this.codigoEvento = codigoEvento;
        this.tipoEvento = tipoEvento;
        this.numeroAsistentes = numeroAsistentes;

        System.out.println("Evento creado: " + this.codigoEvento);
    }

    //Metodo para mostrar la informacion del objeto
    public void mostrarInformacion() {
        System.out.println("\nDatos del evento ");
        System.out.println("Código: " + this.codigoEvento);
        System.out.println("Tipo: " + this.tipoEvento);
        System.out.println("Asistentes esperados: " + this.numeroAsistentes);
        System.out.println("---------------------------");
    }
}


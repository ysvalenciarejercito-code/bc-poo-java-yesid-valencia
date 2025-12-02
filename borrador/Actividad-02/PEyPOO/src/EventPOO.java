public class EventPOO {
    //Variables
    String codigoEvento;
    String tipoEvento;
    int asistentes;

    // Inicializa los atributos
    public EventPOO(String codigoEvento, String tipoEvento, int asistentes) {
        this.codigoEvento = codigoEvento;
        this.tipoEvento = tipoEvento;
        this.asistentes = asistentes;
    }
    public void mostrarInformacionEvento() {
        System.out.println("--- PROGRAMACIÒN ORIENTADA A OBJETOS ---");
        System.out.println("Código: " + this.codigoEvento);
        System.out.println("Tipo: " + this.tipoEvento);
        System.out.println("Asistentes: " + this.asistentes);
    }
}

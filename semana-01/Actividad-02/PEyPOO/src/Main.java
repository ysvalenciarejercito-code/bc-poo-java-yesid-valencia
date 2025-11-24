//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Se muestra la informacion del evento con base a la PE
        EventPE.mostrarInformacion();

        // Se cambia el numero de asistentes
        EventPE.asistentes = 75;
        //Se muestra de nuevo la informacion
        EventPE.mostrarInformacion();


        //Se instancia con base a la clase EventPOO y su constructor
        EventPOO bodaClienteA = new EventPOO("EVENT-POO-002", "Boda Clásica", 150);
        bodaClienteA.mostrarInformacionEvento();

        //Se crea un segundo objeto diferente al primero bodaClienteA
        EventPOO fiestaCorporativa = new EventPOO("EVENT-POO-003", "Aniversario Corporativo", 200);
        fiestaCorporativa.mostrarInformacionEvento();

        System.out.println("================================================");
    }
}
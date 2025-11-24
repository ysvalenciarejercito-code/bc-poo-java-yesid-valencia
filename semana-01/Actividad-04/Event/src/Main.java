//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Objeto 1: Boda
        Event boda = new Event("BODA-001", "Boda Clásica", 180);
        //Objeto 2: Aniversario Corporativo
        Event corpAniversario = new Event("CORP-002", "Aniversario Corporativo", 450);
        //Objeto 3: Fiesta de 15 Años
        Event quinceanera = new Event("QINCE-003", "Fiesta de 15 Años", 120);
        //Objeto 4: Conferencia
        Event conferencia = new Event("CONF-004", "Seminario Empresarial", 80);
        // Objeto 5: Cena de Gala
        Event cenaGala = new Event("GALA-005", "Cena de Gala Exclusiva", 50);

        System.out.println("\n----------Informacion de las 5 instancias----------");
        boda.mostrarInformacion();
        corpAniversario.mostrarInformacion();
        quinceanera.mostrarInformacion();
        conferencia.mostrarInformacion();
        cenaGala.mostrarInformacion();

    }
}
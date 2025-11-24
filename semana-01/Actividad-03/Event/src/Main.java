//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Creación del primer objeto que es la bodaClienteA.
        Event bodaClienteA = new Event("BODA-C001", "Boda Clásica", 180);

        //Creación del segundo objeto que es la fiestaCorporativa.
        Event fiestaCorporativa = new Event("CORP-L020", "Lanzamiento de Producto", 450);

        System.out.println("\n--- Datos de los objetos ---");

        //Metodo mostrarInformacion() para el objeto 1 bodaClienteA
        bodaClienteA.mostrarInformacion();

        //Metodo mostrarInformacion() para el objeto 2 fiestaCorporativa
        fiestaCorporativa.mostrarInformacion();

        }
    }
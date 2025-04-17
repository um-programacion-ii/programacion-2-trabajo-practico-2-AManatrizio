package interfaces;
import java.util.Scanner;

public class Consola {

    private final Scanner scanner;

    public Consola() {
        this.scanner = new Scanner(System.in);
    }

    public String leerTexto(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextLine();
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
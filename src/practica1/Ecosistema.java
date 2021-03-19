package practica1;
import java.util.Scanner;

public class Ecosistema {
    Scanner entrada= new Scanner(System.in);
    private int seleccion;
    
    public void menu(){
        System.out.println("------ECOSISTEMA DE DISPOSITIVOS-----");
        System.out.println("1. Crear Dispositivo");
        System.out.println("2. Administrar Dispositivo");
        System.out.println("3. Acciones con Dispositivos");
        System.out.println("4. Acciones Externas con Dispositivos");
        System.out.println("5. Cargas masivas");
        System.out.println("6. Logs");
        System.out.println("7. Salir");
        System.out.print("Selecciones una opcion: ");
        seleccion=entrada.nextInt();
    }
      
    public int getSeleccion() {
        return seleccion;
    }
}

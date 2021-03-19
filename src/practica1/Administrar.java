
package practica1;

import java.util.Scanner;

public class Administrar extends Ecosistema{
    Scanner entrada= new Scanner(System.in);
    @Override
    public void menu(){
        System.out.println("\n-----ADMINISTRAR DISPOSITIVOS------");
        System.out.println("1. Computadora Portatil");
        System.out.println("2. Tablet");
        System.out.println("3. SmartWatch");
        System.out.println("4. Smartphone");
        System.out.println("5. Auriculares inalambricos");
        System.out.print("Seleccione una opcion: ");
        int seleccion= entrada.nextInt();
    }
    
    
}

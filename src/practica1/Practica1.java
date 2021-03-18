package practica1;
import java.util.ArrayList;
import java.util.Scanner;

public class Practica1 {
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int seleccion;
        int numero_cel=0;
        boolean salida= false;

        //objeto lista para acceder al ArrayList de la clase Crear
        Crear lista = new Crear();  
        //Aceso al ArrayList de la clase Crear
        lista.lista_dispositivos= new ArrayList();
        
        // menu principal
            Ecosistema ecosistema= new Ecosistema();
            //Crear dispositivo
            Ecosistema crear= new Crear();
            Crear dispositivo= new Crear();
        
        while(salida!=true){
            ecosistema.menu();
            seleccion= ecosistema.getSeleccion();
            switch(seleccion){
                case 1: crear.menu();
                        seleccion=crear.getSeleccion();
                        switch(seleccion){
                            case 1: System.out.println("\n-----Creacion de nueva Computadora Portatil-----");
                                    dispositivo.dispositivo_nuevo();
                                break;
                            case 2: System.out.println("\n-----Creacion de una nueva Tablet-----");
                                    dispositivo.dispositivo_nuevo();
                                break;
                            case 3: System.out.println("\n-----Creacion de nuevo SmartWatch------");
                                    dispositivo.dispositivo_nuevo();
                                break;
                            case 4: System.out.println("\n-----Creacion de nuevo Smartphone-----");
                                    dispositivo.dispositivo_nuevo();
                                break;
                            }
                    break;
                case 2: 
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6: 
                    break;
            }
            //Opcion para salir del programa
            if(seleccion==7){
                System.out.println("Has salido");
                salida=true;
            }
            //si la opcion seleccionada no esta en el menu
            else if(seleccion>7){System.out.println("Opcion no valida");
            }
        }
    }
    
}

package practica1;
import java.util.Scanner;

public class Administrar extends Crear{
    Scanner entrada= new Scanner(System.in);
    private int seleccion, indice;
    private String nuevo_correo, nuevo_nombre, modificar, visible;
    boolean nuevo_encendido,nuevo_visible;
    
    public Administrar() {
    }
    @Override
    public void menu(){
        System.out.println("\n-----ADMINISTRAR DISPOSITIVOS------");
        System.out.println("1. Computadora Portatil");
        System.out.println("2. Tablet");
        System.out.println("3. SmartWatch");
        System.out.println("4. Smartphone");
        System.out.println("5. Auriculares inalambricos");
        System.out.print("Seleccione una opcion: ");
        seleccion= entrada.nextInt();
        switch(seleccion){
            case 1: administrar();
                break;
            case 2: 
                break;
            case 3: 
                break;
            case 4:
                break;
            case 5:
                break;
            default: 
        }
    }
    
    public void administrar(){
        System.out.println("\nDispositivos Disponibles: ");
        lista();
        System.out.println("\n1. Editar Correo Electronico");
        System.out.println("2. Editar Nombre del dispositivo");
        System.out.println("3. Apagar visibilidad del dispositivo");
        System.out.println("4. Apagar el dispositivo");
        System.out.print("Seleccione una opcion: ");
        seleccion=entrada.nextInt();
        switch(seleccion){
            case 1: modificar=lista_dispositivos.get(getSeleccion1()-1);
                    indice=lista_dispositivos.indexOf(modificar);
                    System.out.print("Ingresar nuevo correo electronico: ");
                    entrada.nextLine();
                    nuevo_correo=entrada.nextLine();
                    lista_dispositivos.set(indice, nuevo_correo);
                    System.out.print("\nNuevo Correo modificado: "+lista_dispositivos.get(getSeleccion1()-1));
                break;
            case 2: modificar=lista_dispositivos.get(getSeleccion1()-1);
                    indice=lista_dispositivos.indexOf(modificar);
                    System.out.print("Ingresar nuevo Nombre: ");
                    entrada.nextLine();
                    nuevo_nombre=entrada.nextLine();
                    lista_dispositivos.set(indice, nuevo_nombre);
                    System.out.print("\nNuevo Nombre modificado: "+lista_dispositivos.get(getSeleccion1()-1));
                break;
            case 3: isVisibilidad();
                    if(isVisibilidad()==true){
                        System.out.print("Apagar la visibilidad del dispositivo? si/no: ");
                        visible=entrada.nextLine();
                        setVisibilidad(false);
                    }else{
                        System.out.print("Encender la visibilidad del dispositivo? si/no: ");
                        visible=entrada.nextLine();
                        setVisibilidad(true);
                    }
                break;
            case 4: isEncendido();
                    if(isEncendido()==true){
                        System.out.print("Apagar el dispositivo? si/no: ");
                        visible=entrada.nextLine();
                        setEncendido(false);
                    }else{
                        System.out.print("Encender el dispositivo? si/no: ");
                        visible=entrada.nextLine();
                        setEncendido(true);
                    }
                break;
            case 5: 
                break;
        }
    }
        
    
    
}

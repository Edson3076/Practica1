package practica1;
import java.util.ArrayList;
import java.util.Scanner;

public class Crear extends Ecosistema{
    Scanner entrada= new Scanner(System.in);
    private int seleccion, confirmar;
    private String correo, nombre, visible;
    private boolean encendido, visibilidad=false;
    private int numero_tel;
    ArrayList<String> lista_dispositivos = new ArrayList<String>();
    public Crear() {
    }
    
    @Override
    public void menu(){
        do{
        System.out.println("\n-----CREAR DISPOSITIVO-----");
        System.out.println("1. Computadora portatil");
        System.out.println("2. Tablet");
        System.out.println("3. SmartWatch");
        System.out.println("4. Smartphone");
        System.out.println("5. Auriculares Inalambricos");
        System.out.println("6. Regresar");
        System.out.print("Seleccione una opcion: ");
        seleccion=entrada.nextInt();
        switch(seleccion){
            case 1: pedir_datos();
                break;
            case 2: pedir_datos();
                    
                break;
            case 3: pedir_datos();
                    
                break;
            case 4: pedir_datos();
                    ingresar_valor();
                break;
            case 5: mostrar_dispositivos();
                break;
            case 6: break;
            
        }
        } while(seleccion!=6);
    }
    
    public void pedir_datos () {
        entrada.nextLine();
        if(seleccion==4){
            System.out.print("Ingrese el numero telefonico: ");
            numero_tel=entrada.nextInt();
        }
        System.out.print("Ingrese el correo electronico: ");
        correo= entrada.nextLine();
        System.out.print("Ingrese el nombre del dispositivo: ");
        nombre= entrada.nextLine();
        System.out.print("visible para conectar con otros dispositivos? si o no: ");
        visible= entrada.nextLine();
        if(visible=="si"){
            visibilidad=true;
        }
        encendido=true;
        switch(seleccion){
            case 1: System.out.println("\n-----Creacion de nueva Computadora Portatil-----");
                    dispositivo_nuevo();
                break;
            case 2: System.out.println("\n-----Creacion de una nueva Tablet-----");
                    dispositivo_nuevo();
                break;
            case 3: System.out.println("\n-----Creacion de nuevo SmartWatch------");
                    dispositivo_nuevo();
                break;
            case 4: System.out.println("\n-----Creacion de nuevo Smartphone-----");
                    dispositivo_nuevo();
                break;
        }
    }
    
    public void mostrar_dispositivos(){
        String valor;
        int indice=0;
        System.out.println("\n-----CREACION DE NUEVOS AURICULARES-----");
        System.out.print("Ingrese un nombre para los Auriculares: ");
        entrada.nextLine();
        String nombre_auri=entrada.nextLine();
        System.out.println("Listado de dispositivos: ");
        if(lista_dispositivos.isEmpty()){
            System.out.println("No existe valores en la lista!!");
        }
        else{ 
        for(int i=0; i<lista_dispositivos.size();i++){
                System.out.println(i+1 +" "+lista_dispositivos.get(i));
                
            }
        System.out.print("Seleccione un dispositivo para conectar: ");
        seleccion=entrada.nextInt();
        // pendiente de mostrar con el dispositivo conectado
        for(int i=0; i<=seleccion; i++){
            
        }
            System.out.println("Conexion establecida con: ");
        
           
        }
        
    }
    
    public void dispositivo_nuevo(){
        System.out.println("Correo electronico: "+correo);
        System.out.println("Nombre del dispositivo: "+nombre);
        if(seleccion==4){
            System.out.println("Numero de telefono: "+numero_tel);
        }
        System.out.println("Visible para conectar: "+visible);
        System.out.println("NOTA: El dispositivo sera endendido por defecto.");
        System.out.print("Presione 1 para continuar:  ");
        confirmar=entrada.nextInt();
        if(confirmar==1){
            lista_dispositivos.add(nombre);
            System.out.println("Dispositivo Creado");
        }
        
    }
    
    public void ingresar_valor(){
        lista_dispositivos.add(nombre);
    }

    
    public int getNumero_tel() {
        return numero_tel;
    }

    public void setNumero_telefono(int numero_tel) {
        this.numero_tel = numero_tel;
    }

    @Override
    public int getSeleccion() {
        return seleccion;
    }

    public void setSeleccion(int seleccion) {
        this.seleccion = seleccion;
    }
}

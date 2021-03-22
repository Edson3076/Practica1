package practica1;
import java.util.Scanner;

public  class Acciones extends Crear{
    Scanner entrada= new Scanner(System.in);
    private int seleccion, confirmar;
    private String tipo, texto, compartir;
    @Override
    public void menu(){
        System.out.println("\n-----ACCIONES CON DISPOSITIVOS-----");
        System.out.println("1. Computadora Portatil");
        System.out.println("2. Tablet");
        System.out.println("3. SmartWatch");
        System.out.println("4. SmartPhone");
        System.out.print("Seleccione una opcion: ");
        seleccion= entrada.nextInt();
        switch(seleccion){
            case 1: tipo="Computadora Portatil";
                    seleccion();
                break;
            case 2: tipo="Tablet";
                    seleccion();
                break;
            case 3: tipo="SmartWatch";
                    seleccion();
                break;
            case 4: tipo="SmartPhone";
                    seleccion();
                break;
            default: break;
        }
    
    
    }
    public void seleccion(){
        System.out.println("\nTipo de dispositivo: "+tipo);
        System.out.println("Nombre del dispositivo: "+lista_dispositivos.get(seleccion-1));
        System.out.println("Seleccione el tipo de accion a realizar:");
        System.out.println("\n1. Tomar Fotografia");
        System.out.println("2. Copiar Datos");
        System.out.println("3. Pegar texto");
        System.out.println("4. Compartir Documentos");
        System.out.println("5. Reproducir Musica");
        System.out.print("Seleccione una opcion: ");
        seleccion=entrada.nextInt();
        switch(seleccion){
            case 1: fotografia();
                break;
            case 2: copiar();
                break;
            case 3: pegar();
                break;
            case 4: compartir_docs();
                break;
            case 5: reproductor();
                break;
        }
    }
    public void reproductor(){
        System.out.println("\nAuriculares Disponibles: "+getAuricular());
        System.out.println("Utilizar: ");
        System.out.println("1. Auricular");
        System.out.println("2. Autoparlantes");
        System.out.print("Seleccione una opcion: ");
        seleccion=entrada.nextInt();
        if(seleccion==1){
            System.out.println("\nDispositivo conectado en Auriculares");
        }else{
            System.out.println("\nDispositivo conectado en Autoparlantes");
        }
    }
    public void compartir_docs(){
        System.out.print("\nIngrese el nombre del documento: ");
        entrada.nextLine();
        compartir=entrada.nextLine();
        System.out.println("Listado de dispositivos: ");
        lista();
        System.out.println("Nombre de documento: "+compartir);
        System.out.print("Aceptar archivo? 1.si/2.no: ");
        confirmar=entrada.nextInt();
        if(confirmar==1){
            System.out.println("Archivo enviado!");
        }else{
            System.out.println("archivo no enviado!");
        }
    }
    public void pegar(){
        System.out.println("Dispositivos Disponibles: ");
        
        System.out.println("\nDispositivos disponibles: 2 y 4");
        System.out.println("\nDispositivos disponibles: 1 y 4");
        System.out.println("\ndispositivos disponibles: 1 y 2");
        System.out.println("\nTexto copiado: "+texto);
        System.out.print("Seleccione una opcion: ");
        seleccion=entrada.nextInt();
        System.out.println("texto copiado al dispositivo ");
    }
    public void copiar(){
        System.out.print("Ingrese el texto a copiar: ");
        entrada.nextLine();
        texto=entrada.nextLine();
    }
    public void fotografia(){
        System.out.println("Solicitando a SmartPhone fotografia");
        System.out.println("1. Camara frontal");
        System.out.println("2. Camara Posterior");
        System.out.print("Seleccione una opcion: ");
        seleccion=entrada.nextInt();
        if(seleccion==1){
            System.out.println("Foto tomada con camara frontal");
        }else{
            System.out.println("Foto tomada con camara Posteior");
        }
    }
}

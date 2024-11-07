import java.util.HashMap;
import java.util.Scanner;
public class Agenda {
    public static void main(String[] args) {
        HashMap<String, Long> agenda = new HashMap<>();
        while (true){
            System.out.println();
            System.out.println("----- MENU INICIAL -----");
            System.out.println();
            System.out.println("1- Cargar Datos en la Agenda\n" +
                    "2- Buscar Teléfono por Nombre\n" +
                    "3- Listar Agenda\n"+
                    "4- Salir");
            String menuInicial = new Scanner(System.in).nextLine();
            if(menuInicial.equals("1")){
                cargaDatos(agenda);
            } else if (menuInicial.equals("2")) {
                buscarTel(agenda);
            } else if (menuInicial.equals("3")) {
                listarAgenda(agenda);
            } else if (menuInicial.equals("4")) {
                break;
            }else {
                System.out.println("Opción inválida. Intente de nuevo...");
            }
        }
    }

    public static void cargaDatos(HashMap<String, Long> agenda){
        while(true){
            System.out.println();
            System.out.println("----- CARGA DE CONTACTO -----");
            System.out.println();
            System.out.println("1- Cargar contacto\n"+"2- Salir");
            String opcion = new Scanner(System.in).nextLine();
            if (opcion.equals("1")) {
                System.out.println("Ingrese el nombre completo:");
                String nombreCompleto = new Scanner(System.in).nextLine().toUpperCase();
                if (agenda.containsKey(nombreCompleto)) {
                    System.out.println("El contacto ya existe en la agenda.");
                }else {
                    System.out.println("Ingrese el número de teléfono:");
                    Long numeroTel = new Scanner(System.in).nextLong();
                    agenda.put(nombreCompleto, numeroTel);
                }
            } else if (opcion.equals("2")) {
                break;
            }else {
                System.out.println("Opción inválida. Intente de nuevo...");
            }
        }
    }

    public static void buscarTel(HashMap<String, Long> agenda){
        System.out.println();
        System.out.println("----- BUSCAR TELÉFONO -----");
        System.out.println();
        System.out.print("Ingrese el nombre del contacto: ");
        String nombreBuscado = new Scanner(System.in).nextLine().toUpperCase();
        if(agenda.containsKey(nombreBuscado)){
            System.out.println(nombreBuscado+": "+agenda.get(nombreBuscado));
        }else {
            System.out.println("La persona buscada no se encuentra en la agenda.");
        }
    }

    public static void listarAgenda(HashMap<String, Long> agenda){
        System.out.println();
        System.out.println("----- LISTA DE CONTACTOS -----");
        System.out.println();
        for (String i: agenda.keySet()){
            System.out.println("Nombre: "+i+ " - Teléfono: "+agenda.get(i));
        }
    }
}

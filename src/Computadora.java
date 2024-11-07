import java.util.HashSet;
import java.util.Scanner;

public class Computadora {
    private String marca;
    private String modelo;
    private HashSet<ComponenteCPU> componentesCPU = new HashSet<>();

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public HashSet<ComponenteCPU> getComponenteCPU() {
        return componentesCPU;
    }

    public void setComponenteCPU(HashSet<ComponenteCPU> componenteCPU) {
        this.componentesCPU = componenteCPU;
    }

    public static Computadora crearComputadora() {
        Scanner sc = new Scanner(System.in);
        Computadora nuevaComputadora = new Computadora();
        System.out.println();
        System.out.println("----- CARGA DE COMPUTADORA -----");
        System.out.println();
        System.out.println("Ingrese la marca de la computadora: ");
        nuevaComputadora.setMarca(sc.nextLine());
        System.out.println("Ingrese el modelo de la computadora: ");
        nuevaComputadora.setModelo(sc.nextLine());

        while (true) {
            System.out.println("Desea ingresar componentes?\n 1) SI\n 2) NO");
            String opcion = sc.nextLine();
            if(opcion.equals("1")) {
                nuevaComputadora.getComponenteCPU().add(ComponenteCPU.cargarComponente());
            } else if (opcion.equals("2")) {
                break;
            }else {
                System.out.println("Opción no válida. Intente de nuevo...");
            }
        }
        return nuevaComputadora;
    }
}


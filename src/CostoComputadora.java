import java.util.Scanner;
public class CostoComputadora {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        while(true) {
            System.out.println("1- Cotizar Computadora\n"+"2- Salir");
            String opcion = sc.nextLine();
            if(opcion.equals("1")){
                calcularPracioTotalPC(mostrarComputadora(Computadora.crearComputadora()));
            } else if (opcion.equals("2")) {
                break;
            }else {
                System.out.println("Opción incorrecta. Intente de nuevo...");
            }
        }
    }

    public static double mostrarComputadora(Computadora computadoraACotizar){
        double precioTotalComponentes = 0;
        System.out.println();
        System.out.println("----- COMPUTADORA -----");
        System.out.println();
        System.out.println("MARCA: "+computadoraACotizar.getMarca());
        System.out.println("MODELO: "+computadoraACotizar.getModelo());
        System.out.println("COMPONENTES:");

        for(ComponenteCPU comp: computadoraACotizar.getComponenteCPU()){
            System.out.println("Componente: "+comp.getComponente());
            System.out.println("Marca: "+comp.getMarca());
            System.out.println("Cantidad: "+comp.getCantidad());
            System.out.println("Precio x unidad: "+comp.getPrecio());
            double subTotalComp = comp.getPrecio() * comp.getCantidad();
            System.out.println("Subtotal: "+subTotalComp);
            precioTotalComponentes+=subTotalComp;
        }
        System.out.println();
        System.out.println("Costo total: "+precioTotalComponentes);
        return precioTotalComponentes;
    }

    public static void calcularPracioTotalPC(double precioComponentes){
        double total = 0;
        if(precioComponentes<50000){
            total = precioComponentes + (0.4*precioComponentes);
        } else if (precioComponentes>=50000) {
            total= precioComponentes + (0.3*precioComponentes);
        }
        System.out.println("El precio sugerido de venta es: "+total);
    }
}

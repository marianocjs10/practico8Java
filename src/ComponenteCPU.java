import java.util.*;

public class ComponenteCPU {
    private String componente;
    private String marca;
    private int cantidad;
    private double precio;

    public String getComponente() {
        return componente;
    }

    public void setComponente(String componente) {
        this.componente = componente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public static ComponenteCPU cargarComponente(){
        Scanner sc = new Scanner(System.in);
        ComponenteCPU nuevoComponente = new ComponenteCPU();
        System.out.println();
        System.out.println("----- CARGA DE COMPONENTES -----");
        System.out.println();
        System.out.println("Ingrese nombre del componente: ");
        nuevoComponente.setComponente(sc.nextLine());
        System.out.println("Ingrese marca del componente: ");
        nuevoComponente.setMarca(sc.nextLine());
        System.out.println("Ingrese cuantos componentes tiene: ");
        nuevoComponente.setCantidad(sc.nextInt());
        System.out.println("Ingrese precio del componente: ");
        nuevoComponente.setPrecio(sc.nextDouble());
        return nuevoComponente;
    }
}

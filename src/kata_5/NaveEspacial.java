package src.kata_5;

public class NaveEspacial {
    private String nombre;
    private int combustible;

    // Constructor
    public NaveEspacial(String nombre, int combustibleInicial) {
        this.nombre = nombre;
        this.combustible = combustibleInicial;
    }

    // Método despegar
    public void despegar() {
        if (combustible >= 10) {
            combustible -= 10;
            System.out.println(nombre + " ha despegado exitosamente.");
        } else {
            System.out.println(nombre + " no tiene suficiente combustible para despegar.");
        }
    }

    // Método avanzar
    public void avanzar(int distancia) {
        if (combustible >= distancia) {
            combustible -= distancia;
            System.out.println(nombre + " avanzó " + distancia + " unidades.");
        } else {
            System.out.println(nombre + " no tiene suficiente combustible para avanzar " + distancia + " unidades.");
        }
    }

    // Método recargar
    public void recargarCombustible(int cantidad) {
        if (combustible + cantidad > 100) {
            combustible = 100;
            System.out.println("Combustible recargado al máximo (100 unidades).");
        } else {
            combustible += cantidad;
            System.out.println("Se recargaron " + cantidad + " unidades de combustible.");
        }
    }

    // Método para mostrar estado
    public void mostrarEstado() {
        System.out.println("🚀 Nave: " + nombre);
        System.out.println("⛽ Combustible actual: " + combustible + " unidades.");
        System.out.println("----------------------------------");
    }
}


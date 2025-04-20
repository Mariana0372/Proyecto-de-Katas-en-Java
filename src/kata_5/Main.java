package src.kata_5;

public class Main {
    public static void main(String[] args) {
        // Crear la nave con 50 unidades de combustible
        NaveEspacial nave = new NaveEspacial("Explorer-1", 50);

        // Intentar avanzar 60 unidades sin recargar (debe fallar)
        nave.avanzar(60);

        // Recargar 40 unidades
        nave.recargarCombustible(40);

        // Intentar avanzar 60 unidades nuevamente (ahora sí debe avanzar)
        nave.avanzar(60);

        // Mostrar estado actual
        nave.mostrarEstado();
    }
}

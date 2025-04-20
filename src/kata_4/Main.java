package src.kata_4;

public class Main {
    public static void main(String[] args) {
        // Crear dos gallinas diferentes
        Gallina gallina1 = new Gallina("G001", 2);
        Gallina gallina2 = new Gallina("G002", 3);

        // Cada gallina pone al menos un huevo
        gallina1.ponerHuevo();
        gallina2.ponerHuevo();
        gallina2.ponerHuevo(); // opcional: gallina2 pone dos

        // Envejecer cada gallina un año
        gallina1.envejecer();
        gallina2.envejecer();

        // Mostrar estado actual de cada gallina
        System.out.println("🐔 Estado de las gallinas:");
        gallina1.mostrarEstado();
        gallina2.mostrarEstado();
    }
}


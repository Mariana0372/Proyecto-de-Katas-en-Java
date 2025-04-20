package src.kata_2;

public class Main {
    public static void main(String[] args) {
        Mascota mascota = new Mascota("Luna", "Perro", 3);

        System.out.println("Información inicial:");
        mascota.mostrarInfo();

        mascota.cumplirAnios();

        System.out.println("\nInformación después de cumplir años:");
        mascota.mostrarInfo();
    }
}

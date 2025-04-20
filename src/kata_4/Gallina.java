package src.kata_4;

public class Gallina {
    private String idGallina;
    private int edad;
    private int huevosPuestos;

    // Constructor
    public Gallina(String idGallina, int edadInicial) {
        this.idGallina = idGallina;
        this.edad = edadInicial;
        this.huevosPuestos = 0;
    }

    // Método para poner un huevo
    public void ponerHuevo() {
        huevosPuestos++;
    }

    // Método para envejecer
    public void envejecer() {
        edad++;
    }

    // Método para mostrar el estado de la gallina
    public void mostrarEstado() {
        System.out.println("Gallina ID: " + idGallina);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Huevos puestos: " + huevosPuestos);
        System.out.println("-----------------------------");
    }
}

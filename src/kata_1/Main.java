package src.kata_1;

public class Main {
    public static void main(String[] args) {
        // Crear un objeto de la clase Estudiantes
        Estudiantes estudiante = new Estudiantes("Juan", "Pérez", "Matemáticas", 7.5);

        // Mostrar la información del estudiante
        estudiante.mostrarInfo();

        // Subir y bajar la calificación
        estudiante.subirCalificacion(2);
        estudiante.bajarCalificacion(1);

        // Mostrar la información después de modificar la calificación
        estudiante.mostrarInfo();
    }
}

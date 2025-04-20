package src.kata_3;

public class Main {
    public static void main(String[] args) {
        // Crear el objeto
        Libro libro = new Libro("1984", "George Orwell", 1949);

        // Intentar modificar con año inválido
        libro.setAñoPublicacion(1800);  // Mensaje de error

        // Intentar modificar con año válido
        libro.setAñoPublicacion(2000);

        // Mostrar la información
        System.out.println("\n📚 Información del libro:");
        System.out.println("Título: " + libro.getTitulo());
        System.out.println("Autor: " + libro.getAutor());
        System.out.println("Año de Publicación: " + libro.getAñoPublicacion());
    }
}


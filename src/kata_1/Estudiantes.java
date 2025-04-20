package src.kata_1;

public class Estudiantes {
    // Atributos privados
    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;

    // Constructor para inicializar los atributos
    public Estudiantes(String nombre, String apellido, String curso, double calificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.calificacion = calificacion;
    }

    // Método para mostrar la información del estudiante
    public void mostrarInfo() {
        System.out.println("Apellido: " + apellido);
        System.out.println("Nombre: " + nombre);
        System.out.println("Curso: " + curso);
        System.out.println("Calificación: " + calificacion);
    }

    // Método para aumentar la calificación
    public void subirCalificacion(double puntos) {
        if (puntos <= 10) {
            calificacion += puntos;
            if (calificacion > 10) {
                calificacion = 10; // No permitir calificación superior a 10
            }
        } else {
            System.out.println("No se pueden añadir más de 10 puntos.");
        }
    }

    // Método para disminuir la calificación
    public void bajarCalificacion(double puntos) {
        if (calificacion - puntos < 0) {
            calificacion = 0; // No permitir calificación menor a 0
        } else {
            calificacion -= puntos;
        }
    }

    // Métodos getters y setters (opcional, dependiendo de las necesidades)
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCurso() {
        return curso;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }
}
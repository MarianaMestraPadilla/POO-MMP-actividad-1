package Ejercicio3;

public class Estudiante {
    String nombre;
    int edad;
    String curso;

    public Estudiante() {
        this.nombre = "Sin nombre";
        this.edad = 0;
        this.curso = "Sin curso";
    }

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.curso = "No asignado";
    }

    public Estudiante(String nombre, int edad, String curso) {
        this(nombre, edad); // Llama al constructor de 2 parámetros
        this.curso = curso;
    }

    public void mostrarDetalles() {
        System.out.println("Estudiante: " + nombre + " | Edad: " + edad + " | Curso: " + curso);
    }
}

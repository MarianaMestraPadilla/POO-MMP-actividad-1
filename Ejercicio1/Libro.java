package Ejercicio1;

public class Libro {
    private String titulo;
    private String autor;
    private int numeroPaginas;

    // 1. Constructor por defecto
    public Libro() {
        this.titulo = "Sin título";
        this.autor = "Autor desconocido";
        this.numeroPaginas = 0;
    }

    // 2. Constructor parametrizado
    public Libro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    // 3. Método para mostrar detalles
    public void mostrarDetalles() {
        System.out.println("Título: " + titulo + " | Autor: " + autor + " | Páginas: " + numeroPaginas);
    }
}

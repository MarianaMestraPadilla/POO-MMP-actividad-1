package Ejemplos;

public class Coche {
    String marca;
    String modelo;

    public Coche() {
        this.marca = "Desconocida";
        this.modelo = "Sin modelo";
    }

    public Coche(String marca) {
        this.marca = marca;
        this.modelo = "Desconocido";
    }

    public Coche(String marca, String modelo) {
        this(marca);
        this.modelo = modelo;
    }

    public void mostrarDetalles() {
        System.out.println("Marca: " + marca + " | Modelo: " + modelo);
    }
}

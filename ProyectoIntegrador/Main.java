package ProyectoIntegrador;

import Ejercicio1.Libro;
import Ejercicio2.CuentaBancaria;
import Ejercicio3.Estudiante;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== PROYECTO INTEGRADOR: TALLER DE CONSTRUCTORES ===");
        System.out.println("\n--- 1. Datos de Libro ---");
        System.out.print("Ingrese el título del libro: ");
        String titulo = scanner.nextLine();
        System.out.print("Ingrese el autor: ");
        String autor = scanner.nextLine();
        System.out.print("Ingrese el número de páginas: ");
        int paginas = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        Libro libroUser = new Libro(titulo, autor, paginas);

        System.out.println("\n--- 2. Datos de Cuenta Bancaria ---");
        System.out.print("Ingrese número de cuenta: ");
        String numCuenta = scanner.nextLine();
        System.out.print("Ingrese tipo de cuenta: ");
        String tipoCuenta = scanner.nextLine();
        System.out.print("Ingrese saldo inicial: ");
        double saldo = scanner.nextDouble();
        scanner.nextLine(); // Limpiar el buffer

        CuentaBancaria cuentaUser = new CuentaBancaria(numCuenta, saldo, tipoCuenta);

        System.out.println("\n--- 3. Datos de Estudiante ---");
        System.out.print("Ingrese nombre del estudiante: ");
        String nombreEst = scanner.nextLine();
        System.out.print("Ingrese edad: ");
        int edadEst = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer
        System.out.print("Ingrese curso: ");
        String cursoEst = scanner.nextLine();

        Estudiante estudianteUser = new Estudiante(nombreEst, edadEst, cursoEst);

        // Resumen de Objetos Creados
        System.out.println("\n=================================");
        System.out.println("   OBJETOS CREADOS CON ÉXITO");
        System.out.println("=================================");
        libroUser.mostrarDetalles();
        cuentaUser.mostrarDetalles();
        estudianteUser.mostrarDetalles();

        scanner.close();
    }
}
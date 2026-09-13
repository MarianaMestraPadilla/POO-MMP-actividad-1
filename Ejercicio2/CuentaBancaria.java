package Ejercicio2;

public class CuentaBancaria {
    private String numeroCuenta;
    private double saldo;
    private String tipoCuenta;

    // 1. Constructor por defecto
    public CuentaBancaria() {
        this.numeroCuenta = "0000000000";
        this.saldo = 0.0;
        this.tipoCuenta = "Ahorros";
    }

    // 2. Constructor parametrizado con 2 parámetros
    public CuentaBancaria(String numeroCuenta, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = 0.0; // Saldo por defecto
        this.tipoCuenta = tipoCuenta;
    }

    // 3. Constructor sobrecargado con 3 parámetros
    public CuentaBancaria(String numeroCuenta, double saldo, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }

    // Método para mostrar detalles de la cuenta
    public void mostrarDetalles() {
        System.out.println("Cuenta: " + numeroCuenta + " | Tipo: " + tipoCuenta + " | Saldo: $" + saldo);
    }
}

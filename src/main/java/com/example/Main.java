package com.example;

public class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro("Cien años de soledad",
                "Gabriel García Márquez",
                471);

        // Mostrar detalles del libro
        libro1.mostrarDetalles();
        CuentaBancaria cuenta = new CuentaBancaria("Maria", 500);
        cuenta.depositar(200);
        System.out.println(cuenta.getSaldo()); // Debería ser 700
        cuenta.retirar(1000); // Debería mostrar error de fondos insuficientes

    }
}
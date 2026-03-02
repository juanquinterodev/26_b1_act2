package com.example;

public class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro("Cien años de soledad",
                "Gabriel García Márquez",
                471);

        // Mostrar detalles del libro
        libro1.mostrarDetalles();

        Libro l1 = new Libro(); 
        l1.mostrarDetalles(); // Salida esperada con valores por defecto

        Libro l2 = new Libro("Harry Potter", "J.K. Rowling");
        l2.mostrarDetalles();

        CuentaBancaria cuenta = new CuentaBancaria("Maria", 500);
        cuenta.depositar(200);
        System.out.println(cuenta.getSaldo()); // Debería ser 700
        cuenta.retirar(1000); // Debería mostrar error de fondos insuficientes

        Estudiante e = new Estudiante("Pedro", 21, 2.5);
e.      mostrarInfo(); // Debería indicar REPROBADO
    }
}
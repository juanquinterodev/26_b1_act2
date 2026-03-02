package com.example;

public class Estudiante {
    private String nombre;
    private int edad;
    private double promedio;
    public Estudiante() {
        this.nombre = "";
        this.edad = 1;
        this.promedio = 0.0;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public int getEdad() {
        return edad;
    }
    
    public double getPromedio() {
        return promedio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        if (edad > 0) {
            this.edad = edad;
        } else {
            System.out.println("La edad debe ser mayor a 0.");
        }
    }
    
    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
    public Estudiante(String nombre, int edad, double promedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.promedio = promedio;
    }
    public boolean haAprobado() {
    return this.promedio >= 3.0;
    }
    public void mostrarInfo() {
        System.out.println("Estudiante: " + nombre +
                " | Edad: " + edad +
                " | Promedio: " + promedio +
                " |Estado: " + (haAprobado() ? "Aprobó" : "No aprobó"));
    }


}
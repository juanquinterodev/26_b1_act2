package com.example;

public class Estudiante {
    private String nombre;
    private int edad;
    private double promedio;
    public Estudiante() {
        this.nombre = "desconocido";
        this.edad = 0;
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
        if (edad < 0){
            edad = 0;
        }
        this.edad = edad;
    }
    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
    public Estudiante(String nombre, int edad, double promedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.promedio = promedio;
    }
    public boolean haAprobado(double promedio) {
    return promedio >= 3.0;
    }
    public void mostrarInfo() {
        System.out.println("Estudiante: " + nombre +
                " | Edad: " + edad +
                " | Promedio: " + promedio +
                "Estado: " + (haAprobado() ? "Aprobó" : "No aprobó"));
    }


}
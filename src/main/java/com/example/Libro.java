package com.example;

public class Libro {


    private String titulo;
    private String autor;
    private int paginas;

    public Libro(String titulo, String autor, int paginas) {
        this.titulo = "desconocido";
        this.autor = "anonimo";
        this.paginas = 0;
    }

    public Libro(String titulo, String autor) {

        this.paginas = 0;
    }

    public void mostrarDetalles() {
        System.out.println("Libro: " + titulo +
                " | Autor: " + autor +
                " | Páginas: " + paginas);
    }

}

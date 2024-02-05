package com.example.recicledview;

public class Encapsulador {
    private int imagen;
    private boolean boton;
    private String titulo;
    private String subtitulo;

    public Encapsulador(int imagen, boolean boton, String titulo, String subtitulo ) {
        this.imagen = imagen;
        this.boton = boton;
        this.titulo = titulo;
        this.subtitulo = subtitulo;
    }

    public Encapsulador() {
    }

    public int getImagen() {
        return imagen;
    }

    public boolean isBoton() {
        return boton;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getSubtitulo() {
        return subtitulo;
    }
}

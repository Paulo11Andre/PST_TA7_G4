package com.pst2021.amst4;

public class Book {
    private String titulo;
    private Categoria categoria;
    private int anio;
    private String autor;
    private String descripcion;
    private String editorial;
    private String imagen;

    public Book(String titulo,String descripcion, String autor, String editorial, int anio,String imagen, Categoria categoria){
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.autor = autor;
        this.editorial= editorial;
        this.anio = anio;
        this.imagen = imagen;
        this.categoria= categoria;

    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}

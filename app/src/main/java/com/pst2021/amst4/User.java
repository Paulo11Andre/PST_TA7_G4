package com.pst2021.amst4;
import com.pst2021.amst4.Categoria;

public class User {
    private String nombre;
    private String apellido;
    private Categoria categoriaFav;
    private String correo;
    private double telefono;
    private String Username;
    private String password;
    private String imagenPerfil;

    public User(String nombre, String apellido, Categoria categoriaFav, String correo, double telefonfo, String username, String password) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.categoriaFav = categoriaFav;
        this.correo = correo;
        this.telefono = telefono;
        Username = username;
        this.password = password;
        this.imagenPerfil = "default";

    }

    public User(String nombre, String apellido, Categoria categoriaFav, String correo, double telefono, String username, String password, String imagenPerfil) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.categoriaFav = categoriaFav;
        this.correo = correo;
        this.telefono = telefono;
        Username = username;
        this.password = password;
        this.imagenPerfil = imagenPerfil;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Categoria getCategoriaFav() {
        return categoriaFav;
    }

    public void setCategoriaFav(Categoria categoriaFav) {
        this.categoriaFav = categoriaFav;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public double getTelefono() {
        return telefono;
    }

    public void setTelefono(double telefono) {
        this.telefono = telefono;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getImagenPerfil() {
        return imagenPerfil;
    }

    public void setImagenPerfil(String imagenPerfil) {
        this.imagenPerfil = imagenPerfil;
    }
}

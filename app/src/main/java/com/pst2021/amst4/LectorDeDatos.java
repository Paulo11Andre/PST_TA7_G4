package com.pst2021.amst4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LectorDeDatos {
    public static ArrayList<User> usuarios;
    public static  ArrayList<Book> libros;

    public Categoria validarCategoria(String categoria){
        switch (categoria.toUpperCase()){
            case "CIENCIA FICCION":
                return Categoria.CIENCIA_FICCION;
            case "COMEDIA":
                return Categoria.COMEDIA;
            case "FANTASIA":
                return Categoria.FANTASIA;
            case "ROMANTICA":
                return Categoria.ROMANTICA;
            case "TERROR":
                return Categoria.TERROR;
            default:
               return null;
        }
    }

    public void listaDeUsuarios() {
        BufferedReader bufferLectura = null;
        try {
            bufferLectura = new BufferedReader(new FileReader("Users info.csv"));
            String linea = bufferLectura.readLine();
            linea = bufferLectura.readLine();
            while (linea != null) {

                String[] datos = linea.split(";");
                Categoria cat = validarCategoria(datos[2]);
                User user = new User(datos[0], datos[1], cat ,datos[3],Double.parseDouble(datos[4]),datos[5],datos[6],datos[7]);
                usuarios.add(user);
                linea = bufferLectura.readLine();
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if (bufferLectura != null) {
                try {
                    bufferLectura.close();
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void listaDeLibros() {
        BufferedReader bufferLectura = null;
        try {
            bufferLectura = new BufferedReader(new FileReader("Books info.csv"));
            String linea = bufferLectura.readLine();
            linea = bufferLectura.readLine();
            while (linea != null) {

                String[] datos = linea.split(";");
                Categoria cat = validarCategoria(datos[6]);
                Book libro = new Book(datos[0], datos[1], datos[2] ,datos[3],Integer.parseInt(datos[4]),datos[5],cat);
                libros.add(libro);
                linea = bufferLectura.readLine();
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if (bufferLectura != null) {
                try {
                    bufferLectura.close();
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

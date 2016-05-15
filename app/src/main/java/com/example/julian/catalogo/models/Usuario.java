package com.example.julian.catalogo.models;

/**
 * Created by JULIAN on 14/05/2016.
 */
public class Usuario {

    private String idUsuario;
    private String login;
    private String password;
    private int  nivelUsuario;
    private String name;
    private int telefono;
    private String correo;
    private String genero;

    public Usuario(String idUsuario, String login, String password, int nivelUsuario, String name, int telefono, String correo, String genero) {
        this.idUsuario = idUsuario;
        this.login = login;
        this.password = password;
        this.nivelUsuario = nivelUsuario;
        this.name = name;
        this.telefono = telefono;
        this.correo = correo;
        this.genero = genero;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getNivelUsuario() {
        return nivelUsuario;
    }

    public void setNivelUsuario(int nivelUsuario) {
        this.nivelUsuario = nivelUsuario;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}


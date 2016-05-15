package com.example.julian.catalogo.models;

/**
 * Created by JULIAN on 14/05/2016.
 */
public class Usuario {

    private String idUsuario;
    private String login;
    private String password;
    private int  nivelUsuario;

    public Usuario(String idUsuario, String login, String password, int nivelUsuario) {
        this.idUsuario = idUsuario;
        this.login = login;
        this.password = password;
        this.nivelUsuario = nivelUsuario;
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
}


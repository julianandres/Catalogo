package com.example.julian.catalogo.models;

import java.util.Date;

/**
 * Created by JULIAN on 14/05/2016.
 */
public class Deseos {

    private String idDeseos;
    private Date fechaGusto;
    private Usuario usuario;
    private Articulo articulo;

    public Deseos(String idDeseos, Date fechaGusto, Usuario usuario, Articulo articulo) {
        this.idDeseos = idDeseos;
        this.fechaGusto = fechaGusto;
        this.usuario = usuario;
        this.articulo = articulo;
    }

    public String getIdDeseos() {
        return idDeseos;
    }

    public void setIdDeseos(String idDeseos) {
        this.idDeseos = idDeseos;
    }

    public Date getFechaGusto() {
        return fechaGusto;
    }

    public void setFechaGusto(Date fechaGusto) {
        this.fechaGusto = fechaGusto;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }
}

package com.example.julian.catalogo.models;

import java.util.Date;

/**
 * Created by JULIAN on 14/05/2016.
 */
public class Compra {
    private String idCompra;
    private Date fechaCompra;
    private int valorCompra;
    private Usuario usuario;

    public Compra(String idCompra, Date fechaCompra, int valorCompra, Usuario usuario) {
        this.idCompra = idCompra;
        this.fechaCompra = fechaCompra;
        this.valorCompra = valorCompra;
        this.usuario = usuario;
    }

    public String getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(String idCompra) {
        this.idCompra = idCompra;
    }

    public Date getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public int getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(int valorCompra) {
        this.valorCompra = valorCompra;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}


package com.example.julian.catalogo.models;

import java.util.Date;

/**
 * Created by JULIAN on 14/05/2016.
 */
public class RegistroDeProduccion {

    private String idRegistroDeProduccion;
    private Date fecha;
    private String referencia;
    private int cantidad;
    private String cantidadColor;

    public RegistroDeProduccion(String idRegistroDeProduccion, Date fecha, String referencia, int cantidad, String cantidadColor) {
        this.idRegistroDeProduccion = idRegistroDeProduccion;
        this.fecha = fecha;
        this.referencia = referencia;
        this.cantidad = cantidad;
        this.cantidadColor = cantidadColor;
    }

    public String getIdRegistroDeProduccion() {
        return idRegistroDeProduccion;
    }

    public void setIdRegistroDeProduccion(String idRegistroDeProduccion) {
        this.idRegistroDeProduccion = idRegistroDeProduccion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getCantidadColor() {
        return cantidadColor;
    }

    public void setCantidadColor(String cantidadColor) {
        this.cantidadColor = cantidadColor;
    }
}

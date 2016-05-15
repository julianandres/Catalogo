package com.example.julian.catalogo.models;

/**
 * Created by JULIAN on 14/05/2016.
 */
public class Articulo {

     private String idArticulo;
     private String referencia;
     private String tipo;
     private String coleccion;
     private int precioDetal;
     private int precioMayor;
     private String medidas;
     private String color;
     private boolean enExistencia;
     private Compra compra;
    private RegistroDeProduccion registroDeProduccion;

    //contructor que inicializa mis atributos, tiene el mismo nombre de la clase y no tiene tipo de daato


    public Articulo(String idArticulo, String referencia, String tipo, String coleccion, int precioDetal, int precioMayor, String medidas, String color, boolean enExistencia, Compra compra, RegistroDeProduccion registroDeProduccion) {
        this.idArticulo = idArticulo;
        this.referencia = referencia;
        this.tipo = tipo;
        this.coleccion = coleccion;
        this.precioDetal = precioDetal;
        this.precioMayor = precioMayor;
        this.medidas = medidas;
        this.color = color;
        this.enExistencia = enExistencia;
        this.compra = compra;
        this.registroDeProduccion = registroDeProduccion;
    }

    public String getIdArticulo() {
        return idArticulo;
    }

    public void setIdArticulo(String idArticulo) {
        this.idArticulo = idArticulo;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColeccion() {
        return coleccion;
    }

    public void setColeccion(String coleccion) {
        this.coleccion = coleccion;
    }

    public int getPrecioDetal() {
        return precioDetal;
    }

    public void setPrecioDetal(int precioDetal) {
        this.precioDetal = precioDetal;
    }

    public int getPrecioMayor() {
        return precioMayor;
    }

    public void setPrecioMayor(int precioMayor) {
        this.precioMayor = precioMayor;
    }

    public String getMedidas() {
        return medidas;
    }

    public void setMedidas(String medidas) {
        this.medidas = medidas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isEnExistencia() {
        return enExistencia;
    }

    public void setEnExistencia(boolean enExistencia) {
        this.enExistencia = enExistencia;
    }

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    public RegistroDeProduccion getRegistroDeProduccion() {
        return registroDeProduccion;
    }

    public void setRegistroDeProduccion(RegistroDeProduccion registroDeProduccion) {
        this.registroDeProduccion = registroDeProduccion;
    }
}

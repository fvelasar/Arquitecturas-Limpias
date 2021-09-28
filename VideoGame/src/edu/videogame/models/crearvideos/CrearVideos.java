package edu.videogame.models.crearvideos;


public class CrearVideos {
    private String nombre;
    private String descripcion;
    private String referencia;
    private String marca;
    private String precio;
    private String tipo;

    public CrearVideos() {

    }

    public CrearVideos(String nombre, String descripcion, String referencia, String marca,String precio,String tipo) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.descripcion = referencia;
        this.precio = precio;
        this.descripcion = marca;
        this.descripcion = tipo;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Productos{" + "nombre=" + nombre +  ", descripcion=" + descripcion + ", referencia=" + referencia +  ", precio=" + precio + ", marca=" + marca + ", tipo=" + tipo +'}';
    }



}

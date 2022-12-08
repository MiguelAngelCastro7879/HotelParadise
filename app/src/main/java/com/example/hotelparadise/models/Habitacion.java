package com.example.hotelparadise.models;

public class Habitacion {
    private String nombre;
    private String descripcion;
    private String hotel;
    private String ciudad;
    private String horarios;
    private String contacto;
    private Integer rating;
    private Double precio;

    public Habitacion() {
    }
    public Habitacion(String nombre, String descripcion, String hotel, String ciudad, String horarios, String contacto, Integer rating, Double precio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.hotel = hotel;
        this.ciudad = ciudad;
        this.horarios = horarios;
        this.contacto = contacto;
        this.rating = rating;
        this.precio = precio;
    }

    public Habitacion(String nombre) {
        this.nombre = nombre;
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

    public String getHotel() {
        return hotel;
    }

    public void setHotel(String hotel) {
        this.hotel = hotel;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getHorarios() {
        return horarios;
    }

    public void setHorarios(String horarios) {
        this.horarios = horarios;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
}

package com.example.hotelparadise.models;

public class User {
	String correo;
	String telefono;
	String nombre;
	String ciudad;
	String imagen;

	public User(String correo, String telefono, String nombre, String ciudad, String imagen) {
		this.correo = correo;
		this.telefono = telefono;
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.imagen = imagen;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

}

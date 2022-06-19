package com.devpredator.projectwebservice.entity;

import java.time.LocalDateTime;

public class Empleado {

	private long id;
	private String Nombre;
	private String Apellidos;
	private long Edad;
	private LocalDateTime fechaCreacion;
	
	//
	
	public LocalDateTime getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(LocalDateTime fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellidos() {
		return Apellidos;
	}
	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}
	public long getEdad() {
		return Edad;
	}
	public void setEdad(long edad) {
		Edad = edad;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	
}

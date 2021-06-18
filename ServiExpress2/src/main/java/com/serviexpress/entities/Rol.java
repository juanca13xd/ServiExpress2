package com.serviexpress.entities;


import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "rol")
public class Rol implements Serializable{

	private int id_rol;
	private String nombre;
	
	public Rol() {
		
	}
	
	public Rol(int id_rol, String nombre) {
		super();
		this.id_rol = id_rol;
		this.nombre = nombre;
	}
	public int getId_rol() {
		return id_rol;
	}
	public void setId_rol(int id_rol) {
		this.id_rol = id_rol;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	private static final long serialVersionUID = 1L;
}




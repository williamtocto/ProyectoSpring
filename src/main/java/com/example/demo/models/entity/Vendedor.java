package com.example.demo.models.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="vendedor")

public class Vendedor implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id_vendedor;

    private String nombre;
    private String apellidos;
    private String direccion;
    private String  telefono;
    private String  email;
    
	public Long getId_vendedor() {
		return id_vendedor;
	}
	public void setId_vendedor(Long id_vendedor) {
		this.id_vendedor = id_vendedor;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

    
    
    
}

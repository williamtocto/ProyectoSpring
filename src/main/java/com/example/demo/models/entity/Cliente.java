package com.example.demo.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;


@Entity
@Table (name = "clientes")

public class Cliente implements Serializable {
	
    /**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    
	private Long id;
    private String nombre;
    private String apellido;
    private String email;

    @Column(name="create_at")
    @Temporal(TemporalType.DATE)
    private Date create_at;
    
    
   
	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCreate_at() {
        return create_at;
    }

    public void setCreate_at(Date create_at) {
        this.create_at = create_at;
    }
}
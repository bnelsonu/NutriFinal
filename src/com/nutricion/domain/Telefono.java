package com.nutricion.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="TELEFONO")
public class Telefono {
	@Id 
	@Column(name="CODIGO_TELEFONO")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer codigoTelefono;
	@Column(name="NUMERO_TELEFONICO",columnDefinition="VARCHAR(8)")
	String numeroTelefonico;
	
	@ManyToMany(mappedBy = "telefonos")
	private Set<Cliente> clientes = new HashSet<Cliente>();
	
	public Integer getCodigoTelefono() {
		return codigoTelefono;
	}
	public void setCodigoTelefono(Integer codigoTelefono) {
		this.codigoTelefono = codigoTelefono;
	}
	public String getNumeroTelefonico() {
		return numeroTelefonico;
	}
	public void setNumeroTelefonico(String numeroTelefonico) {
		this.numeroTelefonico = numeroTelefonico;
	}
	public Set<Cliente> getClientes() {
		return clientes;
	}
	public void setClientes(Set<Cliente> clientes) {
		this.clientes = clientes;
	}
}
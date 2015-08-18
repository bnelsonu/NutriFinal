package com.nutricion.domain;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Telefono {
	@Id 
	@Column(name="CODIGO_TELEFONO")
	@GeneratedValue
	Integer codigoTelefono;
	@Column(name="OTROS",columnDefinition="VARCHAR(7)")
	String numeroTelefonico;
	
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
	
}

package com.nutricion.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="VALORACION_DIETETICA")
public class ValoracionDietetica {
	@Id 
	@Column(name="CODIGO_VALORACION_DIETETICA")
	@GeneratedValue
	Integer codigoValoracionDietetica;
	
	@Column(name="PREPARADOR_ALIMENTOS",columnDefinition="VARCHAR(50)",nullable=false)
	String preparadorDeAlimentos;
	@Column(name="ALIMENTOS_PREFERIDOS",columnDefinition="VARCHAR(250)",nullable=false)
	String alimentosPreferidos;
	@Column(name="ALIMENTOS_QUE_CONSUME",columnDefinition="VARCHAR(250)",nullable=false)
	String alimentosQueNoConsume;
	
	//relacion con cliente
		@OneToOne(cascade=CascadeType.ALL)  
	    @JoinColumn(name="CODIGO_CLIENTE")  
		Cliente cliente;
	
	public Integer getCodigoValoracionDietetica() {
		return codigoValoracionDietetica;
	}
	public void setCodigoValoracionDietetica(Integer codigoValoracionDietetica) {
		this.codigoValoracionDietetica = codigoValoracionDietetica;
	}
	public String getPreparadorDeAlimentos() {
		return preparadorDeAlimentos;
	}
	public void setPreparadorDeAlimentos(String preparadorDeAlimentos) {
		this.preparadorDeAlimentos = preparadorDeAlimentos;
	}
	public String getAlimentosPreferidos() {
		return alimentosPreferidos;
	}
	public void setAlimentosPreferidos(String alimentosPreferidos) {
		this.alimentosPreferidos = alimentosPreferidos;
	}
	public String getAlimentosQueNoConsume() {
		return alimentosQueNoConsume;
	}
	public void setAlimentosQueNoConsume(String alimentosQueNoConsume) {
		this.alimentosQueNoConsume = alimentosQueNoConsume;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}
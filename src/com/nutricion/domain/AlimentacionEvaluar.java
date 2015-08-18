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
@Table(name="ALIMENTACION_EVALUAR")
public class AlimentacionEvaluar {
	@Id 
	@Column(name="CODIGO_ALIMENTACION_EVALUAR")
	@GeneratedValue
	Integer codigoAlimentacionEvaluar;
	@Column(name="DESAYUNO",columnDefinition="VARCHAR(250)",nullable=false)
	String desayuno;
	@Column(name="MERIENDA_MANANA",columnDefinition="VARCHAR(250)",nullable=false)
	String meriendaManana;
	@Column(name="ALMUERZO",columnDefinition="VARCHAR(250)",nullable=false)
	String almuerzo;
	@Column(name="MERIENDA_TARDE",columnDefinition="VARCHAR(250)",nullable=false)
	String meriendaTarde;
	@Column(name="CENA",columnDefinition="VARCHAR(250)",nullable=false)
	String cena;
	@Column(name="COALICION_NOCTURNA",columnDefinition="VARCHAR(250)",nullable=false)
	String coalicionNocturna;
	@Column(name="COMIDAS_RAPIDAS",columnDefinition="VARCHAR(250)")
    String comidasRapidas;
	@Column(name="HIDRATACION",columnDefinition="VARCHAR(250)",nullable=false)
    String hidratacion;
    
	//relacion con cliente
	@OneToOne(cascade=CascadeType.ALL)  
    @JoinColumn(name="CODIGO_CLIENTE")  
	Cliente cliente;
	
	public String getDesayuno() {
		return desayuno;
	}
	public void setDesayuno(String desayuno) {
		this.desayuno = desayuno;
	}
	public String getMeriendaManana() {
		return meriendaManana;
	}
	public void setMeriendaManana(String meriendaManana) {
		this.meriendaManana = meriendaManana;
	}
	public String getAlmuerzo() {
		return almuerzo;
	}
	public void setAlmuerzo(String almuerzo) {
		this.almuerzo = almuerzo;
	}
	public String getMeriendaTarde() {
		return meriendaTarde;
	}
	public void setMeriendaTarde(String meriendaTarde) {
		this.meriendaTarde = meriendaTarde;
	}
	public String getCena() {
		return cena;
	}
	public void setCena(String cena) {
		this.cena = cena;
	}
	public String getCoalicionNocturna() {
		return coalicionNocturna;
	}
	public void setCoalicionNocturna(String coalicionNocturna) {
		this.coalicionNocturna = coalicionNocturna;
	}
	public String getComidasRapidas() {
		return comidasRapidas;
	}
	public void setComidasRapidas(String comidasRapidas) {
		this.comidasRapidas = comidasRapidas;
	}
	public String getHidratacion() {
		return hidratacion;
	}
	public void setHidratacion(String hidratacion) {
		this.hidratacion = hidratacion;
	}
	public Integer getCodigoAlimentacionEvaluar() {
		return codigoAlimentacionEvaluar;
	}
	public void setCodigoAlimentacionEvaluar(Integer codigoAlimentacionEvaluar) {
		this.codigoAlimentacionEvaluar = codigoAlimentacionEvaluar;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}
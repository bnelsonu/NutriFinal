package com.nutricion.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="HISTORIA_CLINICA_FAMILIAR")
public class HistoriaClinicaFamiliar {

	@Id 
	@Column(name="CODIGO_HISTORIA_CLINICA_FAMILIAR")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer codigoHistoriaClinicaFamiliar;
	@Column(name="PROBLEMAS_CARDIOVASCULRES",nullable=false)
	Boolean problemasCardiovasculares; 
	@Column(name="HTA",nullable=false)
	Boolean hta;
	@Column(name="DM",nullable=false)
	Boolean dm;
	@Column(name="DISLIPIDEMIA",nullable=false)
	Boolean dislipidemia;
	@Column(name="EPILEPSIA",nullable=false)
	Boolean epilepsia; 
	@Column(name="OBESIDAD",nullable=false)
	Boolean obesidad; 
	@Column(name="OSTEOPOROSIS",nullable=false)
	Boolean osteoporosis;
	@Column(name="TIROIDES",nullable=false)
	Boolean tiroides; 
	@Column(name="CA",nullable=false)
	Boolean ca;
	@Column(name="OTROS",columnDefinition="VARCHAR(250)")
	String otros;
	
	//relacion con cliente
	@OneToOne(cascade=CascadeType.ALL)  
    @JoinColumn(name="CODIGO_CLIENTE")  
	Cliente cliente;
	
	public Integer getCodigoHistoriaClinicaFamiliar() {
		return codigoHistoriaClinicaFamiliar;
	}
	public void setCodigoHistoriaClinicaFamiliar(
			Integer codigoHistoriaClinicaFamiliar) {
		this.codigoHistoriaClinicaFamiliar = codigoHistoriaClinicaFamiliar;
	}
	public Boolean getProblemasCardiovasculares() {
		return problemasCardiovasculares;
	}
	public void setProblemasCardiovasculares(Boolean problemasCardiovasculares) {
		this.problemasCardiovasculares = problemasCardiovasculares;
	}
	public Boolean getHta() {
		return hta;
	}
	public void setHta(Boolean hta) {
		this.hta = hta;
	}
	public Boolean getDm() {
		return dm;
	}
	public void setDm(Boolean dm) {
		this.dm = dm;
	}
	public Boolean getDislipidemia() {
		return dislipidemia;
	}
	public void setDislipidemia(Boolean dislipidemia) {
		this.dislipidemia = dislipidemia;
	}
	public Boolean getEpilepsia() {
		return epilepsia;
	}
	public void setEpilepsia(Boolean epilepsia) {
		this.epilepsia = epilepsia;
	}
	public Boolean getObesidad() {
		return obesidad;
	}
	public void setObesidad(Boolean obesidad) {
		this.obesidad = obesidad;
	}
	public Boolean getOsteoporosis() {
		return osteoporosis;
	}
	public void setOsteoporosis(Boolean osteoporosis) {
		this.osteoporosis = osteoporosis;
	}
	public Boolean getTiroides() {
		return tiroides;
	}
	public void setTiroides(Boolean tiroides) {
		this.tiroides = tiroides;
	}
	public Boolean getCa() {
		return ca;
	}
	public void setCa(Boolean ca) {
		this.ca = ca;
	}
	public String getOtros() {
		return otros;
	}
	public void setOtros(String otros) {
		this.otros = otros;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}
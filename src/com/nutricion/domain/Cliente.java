package com.nutricion.domain;

/**
 * @author brian.nelson.ulloa
 * Clase de persistencia cliente
 * ORM de la clase Cliente
 */
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.nutricion.util.NutricionUtil;

@Entity
@Table(name="CLIENTE")
public class Cliente {
/**Variables Globales Cliente*/
	@Id 
	@Column(name="CODIGO_CLIENTE")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codigoCliente;
	@Column(name="NOMBRE",columnDefinition="VARCHAR(50)",nullable=false)
	private String nombre;
	@Column(name="APELLIDO1",columnDefinition="VARCHAR(50)",nullable=false)
	private String apellido1;
	@Column(name="APELLIDO2",columnDefinition="VARCHAR(50)",nullable=false)
	private String apellido2;
	@Column(name="EDAD",nullable=false)
	private Integer edad;
	@Column(name="NACIONALIDAD",columnDefinition="VARCHAR(50)",nullable=false)
	private String nacionalidad;
	@Column(name="OCUPACION",columnDefinition="VARCHAR(50)")
	private String ocupacion;
	@Column(name="LUGAR_TRABAJO",columnDefinition="VARCHAR(200)")
	private String lugarTrabajo;
	@Column(name="MED_SUP_ANTICONCEPTIVOS",columnDefinition="VARCHAR(250)")
	private String medSupAnticonceptivos;
	@Column(name="CORREO",columnDefinition="VARCHAR(50)")
	private String correo;
	@Column(name="FUMADO",nullable=false)
	private Boolean fumado;
	@Column(name="BEBIDAS_ALCOHOLICAS",nullable=false)
	private Boolean bebidasAlcoholicas;
	@Column(name="DEPORTES_AFICIONES",columnDefinition="VARCHAR(250)")
	private String deportesAficiones;
	@Column(name="FRECUENCIA_EJERCICIO",columnDefinition="VARCHAR(250)")
	private String frecuenciaEjercicio;
	@Column(name="ESTILO_VIDA",nullable=false)
	private String estiloVida;
	@Column(name="DIETAS_PREVIAS",columnDefinition="VARCHAR(250)",nullable=false)
	private String dietasPrevias;
	@Column(name="METAS_GIMNASIO",columnDefinition="VARCHAR(250)",nullable=false)
	private String metasGimnasio;
	
	//relaciones con otras entidades
	@OneToOne(cascade=CascadeType.ALL, mappedBy="cliente")  
	AlimentacionEvaluar alimentacionEvaluar;
	
	@OneToOne(cascade=CascadeType.ALL, mappedBy="cliente")  
	ConductasRelSalud  conductasRelSalud;
	
	@OneToOne(cascade=CascadeType.ALL, mappedBy="cliente")  
	HistoriaClinicaFamiliar  historiaClinicaFamiliar;
	
	@OneToOne(cascade=CascadeType.ALL, mappedBy="cliente")  
	HistoriaClinicaPersonal  historiaClinicaPersonal;
	
	@OneToOne(cascade=CascadeType.ALL, mappedBy="cliente")  
	ValoracionDietetica  valoracionDietetica;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "CLIENTE_TELEFONO", 
	joinColumns = { @JoinColumn(name = "CODIGO_CLIENTE") }, 
			inverseJoinColumns = { @JoinColumn(name = "CODIGO_TELEFONO") })
	
	private Set<Telefono> telefonos = new HashSet<Telefono>(0);
	
	
	public Integer getCodigoCliente() {
		return codigoCliente;
	}
	public void setCodigoCliente(Integer codigoCliente) {
		this.codigoCliente = codigoCliente;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido1() {
		return apellido1;
	}
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	public String getApellido2() {
		return apellido2;
	}
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	public String getOcupacion() {
		return ocupacion;
	}
	public void setOcupacion(String ocupacion) {
		this.ocupacion = ocupacion;
	}
	public String getLugarTrabajo() {
		return lugarTrabajo;
	}
	public void setLugarTrabajo(String lugarTrabajo) {
		this.lugarTrabajo = lugarTrabajo;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public Boolean isFumado() {
		return fumado;
	}
	public void setFumado(Boolean fumado) {
		this.fumado = fumado;
	}
	public Boolean isBebidasAlcoholicas() {
		return bebidasAlcoholicas;
	}
	public void setBebidasAlcoholicas(Boolean bebidasAlcoholicas) {
		this.bebidasAlcoholicas = bebidasAlcoholicas;
	}
	public String getFrecuenciaEjercicio() {
		return frecuenciaEjercicio;
	}
	public void setFrecuenciaEjercicio(String frecuenciaEjercicio) {
		this.frecuenciaEjercicio = frecuenciaEjercicio;
	}
	public String getEstiloVida() {
		return estiloVida;
	}
	public void setEstiloVida(String estiloVida) throws Exception {
		if (estiloVida.equalsIgnoreCase(NutricionUtil.EstiloVida.SEDENTARIO.getEstiloVida()) ||
				estiloVida.equalsIgnoreCase(NutricionUtil.EstiloVida.ACTIVO.getEstiloVida())) {
			this.estiloVida = estiloVida;
		}
		else throw new Exception ();
		
	}
	public String getMedSupAnticonceptivos() {
		return medSupAnticonceptivos;
	}
	public void setMedSupAnticonceptivos(String medSupAnticonceptivos) {
		this.medSupAnticonceptivos = medSupAnticonceptivos;
	}
	public String isDeportesAficiones() {
		return deportesAficiones;
	}
	public void setDeportesAficiones(String deportesAficiones) {
		this.deportesAficiones = deportesAficiones;
	}
	public String getMetasGimnasio() {
		return metasGimnasio;
	}
	public void setMetasGimnasio(String metasGimnasio) {
		this.metasGimnasio = metasGimnasio;
	}
	public String getDietasPrevias() {
		return dietasPrevias;
	}
	public void setDietasPrevias(String dietasPrevias) {
		this.dietasPrevias = dietasPrevias;
	}
	public Boolean getFumado() {
		return fumado;
	}
	public Boolean getBebidasAlcoholicas() {
		return bebidasAlcoholicas;
	}
	public String getDeportesAficiones() {
		return deportesAficiones;
	}
	public AlimentacionEvaluar getAlimentacionEvaluar() {
		return alimentacionEvaluar;
	}
	public void setAlimentacionEvaluar(AlimentacionEvaluar alimentacionEvaluar) {
		this.alimentacionEvaluar = alimentacionEvaluar;
	}
	public ConductasRelSalud getConductasRelSalud() {
		return conductasRelSalud;
	}
	public void setConductasRelSalud(ConductasRelSalud conductasRelSalud) {
		this.conductasRelSalud = conductasRelSalud;
	}
	public HistoriaClinicaFamiliar getHistoriaClinicaFamiliar() {
		return historiaClinicaFamiliar;
	}
	public void setHistoriaClinicaFamiliar(
			HistoriaClinicaFamiliar historiaClinicaFamiliar) {
		this.historiaClinicaFamiliar = historiaClinicaFamiliar;
	}
	public HistoriaClinicaPersonal getHistoriaClinicaPersonal() {
		return historiaClinicaPersonal;
	}
	public void setHistoriaClinicaPersonal(
			HistoriaClinicaPersonal historiaClinicaPersonal) {
		this.historiaClinicaPersonal = historiaClinicaPersonal;
	}
	public ValoracionDietetica getValoracionDietetica() {
		return valoracionDietetica;
	}
	public void setValoracionDietetica(ValoracionDietetica valoracionDietetica) {
		this.valoracionDietetica = valoracionDietetica;
	}
	public Set<Telefono> getTelefonos() {
		return telefonos;
	}
	public void setTelefonos(Set<Telefono> telefonos) {
		this.telefonos = telefonos;
	}
}
package com.nutricion.domain;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class ConductasRelSalud {

	@Id 
	@Column(name="CODIGO_CONDUCTAS_REL_SALUD")
	@GeneratedValue
	String codigoConductasRelSalud;
	@Column(name="DOLOR_TORAX",columnDefinition="VARCHAR(150)")
	String dolorTorax;
	@Column(name="DESMAYOS",columnDefinition="VARCHAR(150)")
	String desmayos;
	@Column(name="FALTA_AIRE_REPOSO",columnDefinition="VARCHAR(150)")
	String faltaDeAireReposo;
	@Column(name="DOLOR_CABEZA_FRECUENTE",columnDefinition="VARCHAR(150)")
	String dolorCabezaFrecuente;
	@Column(name="PRBL_ARTI_ESP_HUE",columnDefinition="VARCHAR(150)")
	String prblmArtiEspHue;
	@Column(name="PRBL_HUE_ARTI_ESP_ROD_CAD",columnDefinition="VARCHAR(150)")
	String problemasHuesosArtEspRodillaCadera;
	@Column(name="SITUACION_FISICA_A_SABER",columnDefinition="VARCHAR(150)")
	String situacionFisicaASaber;
	
	public String getCodigoConductasRelSalud() {
		return codigoConductasRelSalud;
	}
	public void setCodigoConductasRelSalud(String codigoConductasRelSalud) {
		this.codigoConductasRelSalud = codigoConductasRelSalud;
	}
	public String getDolorTorax() {
		return dolorTorax;
	}
	public void setDolorTorax(String dolorTorax) {
		this.dolorTorax = dolorTorax;
	}
	public String getDesmayos() {
		return desmayos;
	}
	public void setDesmayos(String desmayos) {
		this.desmayos = desmayos;
	}
	public String getFaltaDeAireReposo() {
		return faltaDeAireReposo;
	}
	public void setFaltaDeAireReposo(String faltaDeAireReposo) {
		this.faltaDeAireReposo = faltaDeAireReposo;
	}
	public String getDolorCabezaFrecuente() {
		return dolorCabezaFrecuente;
	}
	public void setDolorCabezaFrecuente(String dolorCabezaFrecuente) {
		this.dolorCabezaFrecuente = dolorCabezaFrecuente;
	}
	public String getPrblmArtiEspHue() {
		return prblmArtiEspHue;
	}
	public void setPrblmArtiEspHue(String prblmArtiEspHue) {
		this.prblmArtiEspHue = prblmArtiEspHue;
	}
	public String getProblemasHuesosArtEspRodillaCadera() {
		return problemasHuesosArtEspRodillaCadera;
	}
	public void setProblemasHuesosArtEspRodillaCadera(
			String problemasHuesosArtEspRodillaCadera) {
		this.problemasHuesosArtEspRodillaCadera = problemasHuesosArtEspRodillaCadera;
	}
	public String getSituacionFisicaASaber() {
		return situacionFisicaASaber;
	}
	public void setSituacionFisicaASaber(String situacionFisicaASaber) {
		this.situacionFisicaASaber = situacionFisicaASaber;
	}
}
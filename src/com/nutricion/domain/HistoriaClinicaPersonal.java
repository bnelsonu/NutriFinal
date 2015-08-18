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
@Table(name="HISTORIA_CLINICA_PERSONAL")
public class HistoriaClinicaPersonal {

	@Id 
	@Column(name="CODIGO_HISTORIA_CLINICA_PERSONAL")
	@GeneratedValue
	Integer codigoHistoriaClinicaPersonal;
	@Column(name="HERNIA_HITAL",nullable=false)
	Boolean herniaHiatal;
	@Column(name="CICLOS_MESTRUALES",nullable=false)
	Boolean ciclosMenstruales;
	@Column(name="ALERGIAS_INTOLERANCIA",nullable=false)
	Boolean alergiasIntolerancias;
	@Column(name="OB",nullable=false)
    Boolean ob;
	@Column(name="CX",nullable=false)
	Boolean cx;
	@Column(name="DM",nullable=false)
	Boolean dm;
	@Column(name="METCHO",nullable=false)
	Boolean metCHO;
	@Column(name="DISLIPIDEMIA",nullable=false)
	Boolean dislipidemia;
	@Column(name="HDL",nullable=false)
	Boolean hdl;
	@Column(name="ACIDO_URICO",nullable=false)
	Boolean acidoUrico;
	@Column(name="HTA",nullable=false)
	Boolean hta;
	@Column(name="RETIENE_LIQUIDOS",nullable=false)
	Boolean retieneLiquidos;
	@Column(name="SCV",nullable=false)
	Boolean scv;
	@Column(name="CEFALEAS",nullable=false)
	Boolean cefaleas;
	@Column(name="TGI",nullable=false)
	Boolean tgi;
	@Column(name="ESTRENIMIENTO",nullable=false)
	Boolean estrenimiento;
	@Column(name="DIARREAS",nullable=false)
	Boolean diarreas;
	@Column(name="HEMORROIDES",nullable=false)
	Boolean hemorroides;
	@Column(name="COLITIS",nullable=false)
	Boolean colitis;
	@Column(name="GASTRITIS",nullable=false)
	Boolean gastritis;
	@Column(name="TIROIDES",nullable=false)
	Boolean tiroides;
	@Column(name="RINONES",nullable=false)
	Boolean rinones;
	@Column(name="OSEOS",nullable=false)
	Boolean oseos;
	@Column(name="ANSIEDAD",nullable=false)
	Boolean ansiedad;
	@Column(name="ESTRES",nullable=false)
	Boolean estres;
	@Column(name="CANSANCIO",nullable=false)
	Boolean cansancio;
	@Column(name="CUTANEOS",nullable=false)
	Boolean cutaneos;
	@Column(name="INSOMNIO",nullable=false)
	Boolean insomnio;
	@Column(name="ALERGIAS",nullable=false)
	Boolean alergias;
	@Column(name="HIGADO",nullable=false)
	Boolean higado;
	@Column(name="AUDICION",nullable=false)
	Boolean audicion;
	@Column(name="OLFATO",nullable=false)
	Boolean olfato;
	@Column(name="VISION",nullable=false)
	Boolean vision;
	@Column(name="APNEA",nullable=false)
	Boolean apnea;
	@Column(name="RONCA",nullable=false)
	Boolean ronca;
	@Column(name="VARICES",nullable=false)
	Boolean varices;
	@Column(name="CIRCULATORIOS",nullable=false)
	Boolean circulatorios;
	@Column(name="CA",nullable=false)
	Boolean ca;
	@Column(name="DERRAMES",nullable=false)
	Boolean derrames;
	@Column(name="MIALGIAS",nullable=false)
	Boolean mialgias;
	@Column(name="FIBROMIALGIAS",nullable=false)
	Boolean fibromialgias;
	@Column(name="OTROS",columnDefinition="VARCHAR(250)")
	String otros;
	
	//relacion con cliente
	@OneToOne(cascade=CascadeType.ALL)  
    @JoinColumn(name="CODIGO_CLIENTE")  
	Cliente cliente;
	
	public Integer getCodigoHistoriaClinicaPersonal() {
		return codigoHistoriaClinicaPersonal;
	}

	public void setCodigoHistoriaClinicaPersonal(
			Integer codigoHistoriaClinicaPersonal) {
		this.codigoHistoriaClinicaPersonal = codigoHistoriaClinicaPersonal;
	}
	
	public Boolean getHerniaHiatal() {
		return herniaHiatal;
	}

	public void setHerniaHiatal(Boolean herniaHiatal) {
		this.herniaHiatal = herniaHiatal;
	}

	public Boolean getCiclosMenstruales() {
		return ciclosMenstruales;
	}

	public void setCiclosMenstruales(Boolean ciclosMenstruales) {
		this.ciclosMenstruales = ciclosMenstruales;
	}

	public Boolean getAlergiasIntolerancias() {
		return alergiasIntolerancias;
	}

	public void setAlergiasIntolerancias(Boolean alergiasIntolerancias) {
		this.alergiasIntolerancias = alergiasIntolerancias;
	}

	public Boolean getOb() {
		return ob;
	}

	public void setOb(Boolean ob) {
		this.ob = ob;
	}

	public Boolean getCx() {
		return cx;
	}

	public void setCx(Boolean cx) {
		this.cx = cx;
	}

	public Boolean getDm() {
		return dm;
	}

	public void setDm(Boolean dm) {
		this.dm = dm;
	}

	public Boolean getMetCHO() {
		return metCHO;
	}

	public void setMetCHO(Boolean metCHO) {
		this.metCHO = metCHO;
	}

	public Boolean getDislipidemia() {
		return dislipidemia;
	}

	public void setDislipidemia(Boolean dislipidemia) {
		this.dislipidemia = dislipidemia;
	}

	public Boolean getHdl() {
		return hdl;
	}

	public void setHdl(Boolean hdl) {
		this.hdl = hdl;
	}

	public Boolean getAcidoUrico() {
		return acidoUrico;
	}

	public void setAcidoUrico(Boolean acidoUrico) {
		this.acidoUrico = acidoUrico;
	}

	public Boolean getHta() {
		return hta;
	}

	public void setHta(Boolean hta) {
		this.hta = hta;
	}

	public Boolean getRetieneLiquidos() {
		return retieneLiquidos;
	}

	public void setRetieneLiquidos(Boolean retieneLiquidos) {
		this.retieneLiquidos = retieneLiquidos;
	}

	public Boolean getScv() {
		return scv;
	}

	public void setScv(Boolean scv) {
		this.scv = scv;
	}

	public Boolean getCefaleas() {
		return cefaleas;
	}

	public void setCefaleas(Boolean cefaleas) {
		this.cefaleas = cefaleas;
	}

	public Boolean getTgi() {
		return tgi;
	}

	public void setTgi(Boolean tgi) {
		this.tgi = tgi;
	}

	public Boolean getEstrenimiento() {
		return estrenimiento;
	}

	public void setEstrenimiento(Boolean estrenimiento) {
		this.estrenimiento = estrenimiento;
	}

	public Boolean getDiarreas() {
		return diarreas;
	}

	public void setDiarreas(Boolean diarreas) {
		this.diarreas = diarreas;
	}

	public Boolean getHemorroides() {
		return hemorroides;
	}

	public void setHemorroides(Boolean hemorroides) {
		this.hemorroides = hemorroides;
	}

	public Boolean getColitis() {
		return colitis;
	}

	public void setColitis(Boolean colitis) {
		this.colitis = colitis;
	}

	public Boolean getGastritis() {
		return gastritis;
	}

	public void setGastritis(Boolean gastritis) {
		this.gastritis = gastritis;
	}

	public Boolean getTiroides() {
		return tiroides;
	}

	public void setTiroides(Boolean tiroides) {
		this.tiroides = tiroides;
	}

	public Boolean getRinones() {
		return rinones;
	}

	public void setRinones(Boolean rinones) {
		this.rinones = rinones;
	}

	public Boolean getOseos() {
		return oseos;
	}

	public void setOseos(Boolean oseos) {
		this.oseos = oseos;
	}

	public Boolean getAnsiedad() {
		return ansiedad;
	}

	public void setAnsiedad(Boolean ansiedad) {
		this.ansiedad = ansiedad;
	}

	public Boolean getEstres() {
		return estres;
	}

	public void setEstres(Boolean estres) {
		this.estres = estres;
	}

	public Boolean getCansancio() {
		return cansancio;
	}

	public void setCansancio(Boolean cansancio) {
		this.cansancio = cansancio;
	}

	public Boolean getCutaneos() {
		return cutaneos;
	}

	public void setCutaneos(Boolean cutaneos) {
		this.cutaneos = cutaneos;
	}

	public Boolean getInsomnio() {
		return insomnio;
	}

	public void setInsomnio(Boolean insomnio) {
		this.insomnio = insomnio;
	}

	public Boolean getAlergias() {
		return alergias;
	}

	public void setAlergias(Boolean alergias) {
		this.alergias = alergias;
	}

	public Boolean getHigado() {
		return higado;
	}

	public void setHigado(Boolean higado) {
		this.higado = higado;
	}

	public Boolean getAudicion() {
		return audicion;
	}

	public void setAudicion(Boolean audicion) {
		this.audicion = audicion;
	}

	public Boolean getOlfato() {
		return olfato;
	}

	public void setOlfato(Boolean olfato) {
		this.olfato = olfato;
	}

	public Boolean getVision() {
		return vision;
	}

	public void setVision(Boolean vision) {
		this.vision = vision;
	}

	public Boolean getApnea() {
		return apnea;
	}

	public void setApnea(Boolean apnea) {
		this.apnea = apnea;
	}

	public Boolean getRonca() {
		return ronca;
	}

	public void setRonca(Boolean ronca) {
		this.ronca = ronca;
	}

	public Boolean getVarices() {
		return varices;
	}

	public void setVarices(Boolean varices) {
		this.varices = varices;
	}

	public Boolean getCirculatorios() {
		return circulatorios;
	}

	public void setCirculatorios(Boolean circulatorios) {
		this.circulatorios = circulatorios;
	}

	public Boolean getCa() {
		return ca;
	}

	public void setCa(Boolean ca) {
		this.ca = ca;
	}

	public Boolean getDerrames() {
		return derrames;
	}

	public void setDerrames(Boolean derrames) {
		this.derrames = derrames;
	}

	public Boolean getMialgias() {
		return mialgias;
	}

	public void setMialgias(Boolean mialgias) {
		this.mialgias = mialgias;
	}

	public Boolean getFibromialgias() {
		return fibromialgias;
	}

	public void setFibromialgias(Boolean fibromialgias) {
		this.fibromialgias = fibromialgias;
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

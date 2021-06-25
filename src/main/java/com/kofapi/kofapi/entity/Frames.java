package com.kofapi.kofapi.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "frames")
public class Frames {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String startUp;
	private String onGuard;
	private String onHit;
	private String recovery;
	private String ativos;;

	@ManyToOne
	@JoinColumn(name = "normaisperto")
	@JsonIgnore
	private NormaisPerto normaisPerto;

	@ManyToOne
	@JoinColumn(name = "normaislonge")
	@JsonIgnore
	private NormaisLonge normaisLonge;

	@ManyToOne
	@JoinColumn(name = "normaisabaixados")
	@JsonIgnore
	private NormaisAbaixados normaisAbaixados;

	@ManyToOne
	@JoinColumn(name = "normaisaereos")
	@JsonIgnore
	private NormaisAereos normaisAereos;

	@ManyToOne
	@JoinColumn(name = "skills")
	@JsonIgnore
	private Skills skills;
	
	// Depois criar um construtor pra cada tipo de Normal e Skill

	public Frames(Long id, String startUp, String onGuard, String onHit, String recovery, String ativos,
			NormaisPerto normaisPerto, NormaisLonge normaisLonge, NormaisAbaixados normaisAbaixados,
			NormaisAereos normaisAereos, Skills skills) {
		super();
		this.id = id;
		this.startUp = startUp;
		this.onGuard = onGuard;
		this.onHit = onHit;
		this.recovery = recovery;
		this.ativos = ativos;
		this.normaisPerto = normaisPerto;
		this.normaisLonge = normaisLonge;
		this.normaisAbaixados = normaisAbaixados;
		this.normaisAereos = normaisAereos;
		this.skills = skills;
	}

	public Long getId() {
		return id;
	}

	public String getStartUp() {
		return startUp;
	}

	public String getOnGuard() {
		return onGuard;
	}

	public String getOnHit() {
		return onHit;
	}

	public String getRecovery() {
		return recovery;
	}

	public String getAtivos() {
		return ativos;
	}

	public NormaisPerto getNormaisPerto() {
		return normaisPerto;
	}

	public NormaisLonge getNormaisLonge() {
		return normaisLonge;
	}

	public NormaisAbaixados getNormaisAbaixados() {
		return normaisAbaixados;
	}

	public NormaisAereos getNormaisAereos() {
		return normaisAereos;
	}

	public Skills getSkills() {
		return skills;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setStartUp(String startUp) {
		this.startUp = startUp;
	}

	public void setOnGuard(String onGuard) {
		this.onGuard = onGuard;
	}

	public void setOnHit(String onHit) {
		this.onHit = onHit;
	}

	public void setRecovery(String recovery) {
		this.recovery = recovery;
	}

	public void setAtivos(String ativos) {
		this.ativos = ativos;
	}

	public void setNormaisPerto(NormaisPerto normaisPerto) {
		this.normaisPerto = normaisPerto;
	}

	public void setNormaisLonge(NormaisLonge normaisLonge) {
		this.normaisLonge = normaisLonge;
	}

	public void setNormaisAbaixados(NormaisAbaixados normaisAbaixados) {
		this.normaisAbaixados = normaisAbaixados;
	}

	public void setNormaisAereos(NormaisAereos normaisAereos) {
		this.normaisAereos = normaisAereos;
	}

	public void setSkills(Skills skills) {
		this.skills = skills;
	}

}

package com.kofapi.kofapi.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "normaisperto")
public class NormaisPerto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String aPerto;
	private String bPerto;
	private String cPerto;
	private String dPerto;
	
	@ManyToOne
	@JoinColumn(name = "personagem")
	@JsonIgnore
	private Personagem personagem;
	
	@OneToMany(mappedBy = "frames")
	private List<Frames> frames;

	public Long getId() {
		return id;
	}

	public String getaPerto() {
		return aPerto;
	}

	public String getbPerto() {
		return bPerto;
	}

	public String getcPerto() {
		return cPerto;
	}

	public String getdPerto() {
		return dPerto;
	}

	public Personagem getPersonagem() {
		return personagem;
	}

	public List<Frames> getFrames() {
		return frames;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setaPerto(String aPerto) {
		this.aPerto = aPerto;
	}

	public void setbPerto(String bPerto) {
		this.bPerto = bPerto;
	}

	public void setcPerto(String cPerto) {
		this.cPerto = cPerto;
	}

	public void setdPerto(String dPerto) {
		this.dPerto = dPerto;
	}

	public void setPersonagem(Personagem personagem) {
		this.personagem = personagem;
	}

	public void setFrames(List<Frames> frames) {
		this.frames = frames;
	}

}

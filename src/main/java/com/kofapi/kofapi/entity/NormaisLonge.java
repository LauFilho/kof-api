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
@Table(name = "normaislonge")
public class NormaisLonge {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String aLonge;
	private String bLonge;
	private String cLonge;
	private String dLonge;
	private String CD;

	@ManyToOne
	@JoinColumn(name = "personagem")
	@JsonIgnore
	private Personagem personagem;
	
	@OneToMany(mappedBy = "frames")
	private List<Frames> frames;

	public Long getId() {
		return id;
	}

	public String getaLonge() {
		return aLonge;
	}

	public String getbLonge() {
		return bLonge;
	}

	public String getcLonge() {
		return cLonge;
	}

	public String getdLonge() {
		return dLonge;
	}

	public String getCD() {
		return CD;
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

	public void setaLonge(String aLonge) {
		this.aLonge = aLonge;
	}

	public void setbLonge(String bLonge) {
		this.bLonge = bLonge;
	}

	public void setcLonge(String cLonge) {
		this.cLonge = cLonge;
	}

	public void setdLonge(String dLonge) {
		this.dLonge = dLonge;
	}

	public void setCD(String cD) {
		CD = cD;
	}

	public void setPersonagem(Personagem personagem) {
		this.personagem = personagem;
	}

	public void setFrames(List<Frames> frames) {
		this.frames = frames;
	}
	
	
		
}

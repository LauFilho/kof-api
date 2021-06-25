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
@Table(name = "normaisaereos")
public class NormaisAereos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	// Botão A
	private String aLongo;
	private String aBaixo;
	private String aNeutro;

	// Botão B
	private String bLongo;
	private String bBaixo;
	private String bNeutro;

	// Botão C
	private String cLongo;
	private String cBaixo;
	private String cNeutro;
	
	// Botão D
	private String dLongo;
	private String dBaixo;
	private String dNeutro;
	
	// CD
	private String cdLongo;
	private String cdBaixo;
	private String cdNeutro;
	
	@ManyToOne
	@JoinColumn(name = "personagem")
	@JsonIgnore
	private Personagem personagem;
	
	@OneToMany(mappedBy = "frames")
	private List<Frames> frames;
	
	
	public NormaisAereos(Long id, String aLongo, String aBaixo, String aNeutro, String bLongo, String bBaixo,
			String bNeutro, String cLongo, String cBaixo, String cNeutro, String dLongo, String dBaixo, String dNeutro,
			String cdLongo, String cdBaixo, String cdNeutro, Personagem personagem, List<Frames> frames) {
		
		this.id = id;
		this.aLongo = aLongo;
		this.aBaixo = aBaixo;
		this.aNeutro = aNeutro;
		this.bLongo = bLongo;
		this.bBaixo = bBaixo;
		this.bNeutro = bNeutro;
		this.cLongo = cLongo;
		this.cBaixo = cBaixo;
		this.cNeutro = cNeutro;
		this.dLongo = dLongo;
		this.dBaixo = dBaixo;
		this.dNeutro = dNeutro;
		this.cdLongo = cdLongo;
		this.cdBaixo = cdBaixo;
		this.cdNeutro = cdNeutro;
		this.personagem = personagem;
		this.frames = frames;
	}



	public Long getId() {
		return id;
	}



	public String getaLongo() {
		return aLongo;
	}



	public String getaBaixo() {
		return aBaixo;
	}



	public String getaNeutro() {
		return aNeutro;
	}



	public String getbLongo() {
		return bLongo;
	}



	public String getbBaixo() {
		return bBaixo;
	}



	public String getbNeutro() {
		return bNeutro;
	}



	public String getcLongo() {
		return cLongo;
	}



	public String getcBaixo() {
		return cBaixo;
	}



	public String getcNeutro() {
		return cNeutro;
	}



	public String getdLongo() {
		return dLongo;
	}



	public String getdBaixo() {
		return dBaixo;
	}



	public String getdNeutro() {
		return dNeutro;
	}



	public String getCdLongo() {
		return cdLongo;
	}



	public String getCdBaixo() {
		return cdBaixo;
	}



	public String getCdNeutro() {
		return cdNeutro;
	}



	public Personagem getPersonagem() {
		return personagem;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public void setaLongo(String aLongo) {
		this.aLongo = aLongo;
	}



	public void setaBaixo(String aBaixo) {
		this.aBaixo = aBaixo;
	}



	public void setaNeutro(String aNeutro) {
		this.aNeutro = aNeutro;
	}



	public void setbLongo(String bLongo) {
		this.bLongo = bLongo;
	}



	public void setbBaixo(String bBaixo) {
		this.bBaixo = bBaixo;
	}



	public void setbNeutro(String bNeutro) {
		this.bNeutro = bNeutro;
	}



	public void setcLongo(String cLongo) {
		this.cLongo = cLongo;
	}



	public void setcBaixo(String cBaixo) {
		this.cBaixo = cBaixo;
	}



	public void setcNeutro(String cNeutro) {
		this.cNeutro = cNeutro;
	}



	public void setdLongo(String dLongo) {
		this.dLongo = dLongo;
	}



	public void setdBaixo(String dBaixo) {
		this.dBaixo = dBaixo;
	}



	public void setdNeutro(String dNeutro) {
		this.dNeutro = dNeutro;
	}



	public void setCdLongo(String cdLongo) {
		this.cdLongo = cdLongo;
	}



	public void setCdBaixo(String cdBaixo) {
		this.cdBaixo = cdBaixo;
	}



	public void setCdNeutro(String cdNeutro) {
		this.cdNeutro = cdNeutro;
	}



	public void setPersonagem(Personagem personagem) {
		this.personagem = personagem;
	}



	public List<Frames> getFrames() {
		return frames;
	}



	public void setFrames(List<Frames> frames) {
		this.frames = frames;
	}

	
}

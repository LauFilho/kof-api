package com.kofapi.kofapi.entity;

import java.util.ArrayList;
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
@Table(name = "skills")
public class Skills {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String descricao;
	private String observacao;

	
	@ManyToOne
	@JoinColumn(name = "personagem")
	@JsonIgnore
	private Personagem personagem;
	
	@OneToMany(mappedBy = "skills")
	private List<Frames> frames = new ArrayList<>();
	
	

	public Skills(Long id, String descricao, String observacao, Personagem personagem, List<Frames> frames) {
		this.id = id;
		this.descricao = descricao;
		this.observacao = observacao;
		this.personagem = personagem;
		this.frames = frames;
	}

	public Long getId() {
		return id;
	}

	public String getDescricao() {
		return descricao;
	}

	public String getObservacao() {
		return observacao;
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

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public void setPersonagem(Personagem personagem) {
		this.personagem = personagem;
	}

	public void setFrames(List<Frames> frames) {
		this.frames = frames;
	}
	
	
}

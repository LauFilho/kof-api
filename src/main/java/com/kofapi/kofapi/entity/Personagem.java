package com.kofapi.kofapi.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table (name = "personagem")
public class Personagem {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_personagem;
	private String nome;
	
	@OneToMany(mappedBy = "personagem")
	private List<Movimentacao> movimentacao = new ArrayList<>();
	
	@OneToMany(mappedBy = "personagem")
	private List<NormaisPerto> normaisPerto = new ArrayList<>();
	
	@OneToMany(mappedBy = "personagem")
	private List<NormaisLonge> normaisLonge = new ArrayList<>();
	
	@OneToMany(mappedBy = "personagem")
	private List<NormaisAbaixados> normaisAbaixados = new ArrayList<>();
	
	@OneToMany(mappedBy = "personagem")
	private List<NormaisAereos> normaisAereos = new ArrayList<>();
	
	@OneToMany(mappedBy = "personagem")
	private List<Skills> skills = new ArrayList<>();
	
	

	public Personagem(Long id_personagem, String nome, List<Movimentacao> movimentacao, List<NormaisPerto> normaisPerto,
			List<NormaisLonge> normaisLonge, List<NormaisAbaixados> normaisAbaixados, List<NormaisAereos> normaisAereos,
			List<Skills> skills) {
	
		this.id_personagem = id_personagem;
		this.nome = nome;
		this.movimentacao = movimentacao;
		this.normaisPerto = normaisPerto;
		this.normaisLonge = normaisLonge;
		this.normaisAbaixados = normaisAbaixados;
		this.normaisAereos = normaisAereos;
		this.skills = skills;
	}

	public Long getId_personagem() {
		return id_personagem;
	}

	public String getNome() {
		return nome;
	}

	public List<Movimentacao> getMovimentacao() {
		return movimentacao;
	}

	public List<NormaisPerto> getNormaisPerto() {
		return normaisPerto;
	}

	public List<NormaisLonge> getNormaisLonge() {
		return normaisLonge;
	}

	public List<NormaisAbaixados> getNormaisAbaixados() {
		return normaisAbaixados;
	}

	public List<NormaisAereos> getNormaisAereos() {
		return normaisAereos;
	}

	public List<Skills> getSkills() {
		return skills;
	}

	public void setId_personagem(Long id_personagem) {
		this.id_personagem = id_personagem;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setMovimentacao(List<Movimentacao> movimentacao) {
		this.movimentacao = movimentacao;
	}

	public void setNormaisPerto(List<NormaisPerto> normaisPerto) {
		this.normaisPerto = normaisPerto;
	}

	public void setNormaisLonge(List<NormaisLonge> normaisLonge) {
		this.normaisLonge = normaisLonge;
	}

	public void setNormaisAbaixados(List<NormaisAbaixados> normaisAbaixados) {
		this.normaisAbaixados = normaisAbaixados;
	}

	public void setNormaisAereos(List<NormaisAereos> normaisAereos) {
		this.normaisAereos = normaisAereos;
	}

	public void setSkills(List<Skills> skills) {
		this.skills = skills;
	}

	
}

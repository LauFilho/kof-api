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
@Table(name = "movimentacao")
public class Movimentacao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String alturaAbaixado;
	private String framesPulo;
	private String framesHop;
	private String framesCorrida;
	private String framesBackdash;
	private String wakeup;
	private String cairEsquiva;
	private String rankMovimento;
	
	@ManyToOne
	@JoinColumn(name = "personagem")
	@JsonIgnore
	private Personagem personagem;
	
		public Movimentacao(Long id, String alturaAbaixado, String framesPulo, String framesHop, String framesCorrida,
			String framesBackdash, String wakeup, String cairEsquiva, String rankMovimento, Personagem personagem) {
	
		this.id = id;
		this.alturaAbaixado = alturaAbaixado;
		this.framesPulo = framesPulo;
		this.framesHop = framesHop;
		this.framesCorrida = framesCorrida;
		this.framesBackdash = framesBackdash;
		this.wakeup = wakeup;
		this.cairEsquiva = cairEsquiva;
		this.rankMovimento = rankMovimento;
		this.personagem = personagem;
	}
	public Long getId() {
		return id;
	}
	public String getAlturaAbaixado() {
		return alturaAbaixado;
	}
	public String getFramesPulo() {
		return framesPulo;
	}
	public String getFramesHop() {
		return framesHop;
	}
	public String getFramesCorrida() {
		return framesCorrida;
	}
	public String getFramesBackdash() {
		return framesBackdash;
	}
	public String getWakeup() {
		return wakeup;
	}
	public String getCairEsquiva() {
		return cairEsquiva;
	}
	public String getRankMovimento() {
		return rankMovimento;
	}
	public Personagem getPersonagem() {
		return personagem;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setAlturaAbaixado(String alturaAbaixado) {
		this.alturaAbaixado = alturaAbaixado;
	}
	public void setFramesPulo(String framesPulo) {
		this.framesPulo = framesPulo;
	}
	public void setFramesHop(String framesHop) {
		this.framesHop = framesHop;
	}
	public void setFramesCorrida(String framesCorrida) {
		this.framesCorrida = framesCorrida;
	}
	public void setFramesBackdash(String framesBackdash) {
		this.framesBackdash = framesBackdash;
	}
	public void setWakeup(String wakeup) {
		this.wakeup = wakeup;
	}
	public void setCairEsquiva(String cairEsquiva) {
		this.cairEsquiva = cairEsquiva;
	}
	public void setRankMovimento(String rankMovimento) {
		this.rankMovimento = rankMovimento;
	}
	public void setPersonagem(Personagem personagem) {
		this.personagem = personagem;
	}

	
	
}

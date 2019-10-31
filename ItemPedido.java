package com.trabalhoPoo.projetoRevendas.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ItemPedido {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int sequencial;
	private int quantidade;
	private String descricao;
	private float valor;
	
	public ItemPedido() {}
	
	public ItemPedido(int sequencial, int quantidade, String descricao, float valor) {
		super();
		this.sequencial = sequencial;
		this.quantidade = quantidade;
		this.descricao = descricao;
		this.valor = valor;
	}

	public int getSequencial() {
		return sequencial;
	}

	public void setSequencial(int sequencial) {
		this.sequencial = sequencial;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}
	
}

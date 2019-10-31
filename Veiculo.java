package com.trabalhoPoo.projetoRevendas.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Veiculo {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int codigo;
	private String descricao;
	private float valor;
	
	public Veiculo() {}
	
	public Veiculo(int codigo, String descricao, float valor) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		this.valor = valor;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
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

package com.trabalhoPoo.projetoRevendas.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vendedor {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int codigo;
	private String nome;
	private float comissao;
	
	public Vendedor() {}
	
	public Vendedor(int codigo, String nome, float comissao) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.comissao = comissao;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getComissao() {
		return comissao;
	}

	public void setComissao(float comissao) {
		this.comissao = comissao;
	}
	
	
}

package com.trabalhoPoo.projetoRevendas.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Cliente {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int codigo;
	private String nome;
	private int tipoCliente;
	
	public Cliente() {}
	
	public Cliente(int codigo, String nome, int tipoCliente) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.tipoCliente = tipoCliente;
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

	public int getTipoCliente() {
		return tipoCliente;
	}

	public void setTipoCliente(int tipoCliente) {
		this.tipoCliente = tipoCliente;
	}
	
		
}


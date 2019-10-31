/*package com.trabalhoPoo.projetoRevendas.domain;

import java.util.ArrayList;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PedidoVenda {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int codigo;
	private Date data;
	private float valorPedido;
	private ArrayList<ItemPedido> item;
	private Cliente cliente;
	private Vendedor vendedor;
	private Veiculo veiculo;
	
	//public float calcularPedido(ItemPedido item) {
		
		//float total = 0;
		
		//return total;
	//}
	
	public PedidoVenda() {}

	public PedidoVenda(int codigo, Date data, float valorPedido, ArrayList<ItemPedido> item, 
			Cliente cliente, Vendedor vendedor, Veiculo veiculo) {
		super();
		this.codigo = codigo;
		this.data = data;
		this.valorPedido = valorPedido;
		this.item = new ArrayList<>();
		this.cliente = cliente;
		this.vendedor = vendedor;
		this.veiculo = veiculo;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public float getValorPedido() {
		return valorPedido;
	}

	public void setValorPedido(float valorPedido) {
		this.valorPedido = valorPedido;
	}

	public ArrayList<ItemPedido> getItem() {
		return item;
	}

	public void setItem(ArrayList<ItemPedido> item) {
		this.item = item;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

}*/

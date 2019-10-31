package com.trabalhoPoo.projetoRevendas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import com.trabalhoPoo.projetoRevendas.domain.Cliente;
import com.trabalhoPoo.projetoRevendas.domain.ClienteRepositorio;
import com.trabalhoPoo.projetoRevendas.domain.ItemPedido;
import com.trabalhoPoo.projetoRevendas.domain.ItemPedidoRepositorio;
import com.trabalhoPoo.projetoRevendas.domain.Veiculo;
import com.trabalhoPoo.projetoRevendas.domain.VeiculoRepositorio;
import com.trabalhoPoo.projetoRevendas.domain.Vendedor;
import com.trabalhoPoo.projetoRevendas.domain.VendedorRepositorio;

@SpringBootApplication
public class ProjetoRevendasApplication {
		
	@Autowired
		private ClienteRepositorio repositorio;
	@Autowired
		private VendedorRepositorio repositorio2;
	@Autowired
		private VeiculoRepositorio repositorio3;
	@Autowired
		private ItemPedidoRepositorio repositorio4;
	
		public static void main(String[] args) {
			SpringApplication.run(ProjetoRevendasApplication.class, args);
	}
	@Bean
	
	CommandLineRunner runner(){
		return args -> {
			repositorio.save(new Cliente(001,"Francisco",01));
			repositorio.save(new Cliente(002,"Ana",02));
			repositorio.save(new Cliente(003,"Igor",03));
			
			repositorio2.save(new Vendedor(001,"Jake",4500f));
			repositorio2.save(new Vendedor(002,"Tiago",1500f));
			repositorio2.save(new Vendedor(003,"Helena",3000f));

			repositorio3.save(new Veiculo(001,"Fiat",5000f));
			repositorio3.save(new Veiculo(002,"Ford",7000f));
			repositorio3.save(new Veiculo(003,"Toyota",9000f));
			
			repositorio4.save(new ItemPedido(001,2,"Caneta",4.0f));
			repositorio4.save(new ItemPedido(002,1,"Borracha",2.0f));
			repositorio4.save(new ItemPedido(003,3,"Lapis",3.0f));
			
		};
	}
}

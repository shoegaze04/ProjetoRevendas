package com.trabalhoPoo.projetoRevendas.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.trabalhoPoo.projetoRevendas.domain.ItemPedido;
import com.trabalhoPoo.projetoRevendas.domain.ItemPedidoRepositorio;

@RestController
@RequestMapping("/itens")
public class ItemPedidoController {
	@Autowired
	private ItemPedidoRepositorio repositorio5;

	@GetMapping("/itens")
	public Iterable<ItemPedido> getItens() {
		return repositorio5.findAll();
	}

	@PutMapping(value="/{id}")
	public ResponseEntity update(@PathVariable("id") long id, @RequestBody ItemPedido item) {
		
		return repositorio5.findById(id).map(record-> {
					   record.setSequencial(item.getSequencial());
		               record.setQuantidade(item.getQuantidade());
		               record.setDescricao(item.getDescricao());
		               record.setValor(item.getValor());
		               ItemPedido updated = repositorio5.save(record);
		               return ResponseEntity.ok().body(updated);
		           }).orElse(ResponseEntity.notFound().build());					
	}

	@PostMapping("/itens")
	public ItemPedido create(@RequestBody ItemPedido item) {
		return repositorio5.save(item);
	}

	@DeleteMapping(path= {"/{id}"})
	public ResponseEntity<?> delete(@PathVariable long id) {
		   return repositorio5.findById(id)
		           .map(record -> {
		               repositorio5.deleteById(id);
		               return ResponseEntity.ok().build();
		           }).orElse(ResponseEntity.notFound().build());
	}
}

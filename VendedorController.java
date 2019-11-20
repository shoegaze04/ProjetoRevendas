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

import com.trabalhoPoo.projetoRevendas.domain.Vendedor;
import com.trabalhoPoo.projetoRevendas.domain.VendedorRepositorio;

@RestController
@RequestMapping("/vendedores")
public class VendedorController {
	@Autowired
	private VendedorRepositorio repositorio2;

	@GetMapping("/vendedores")
	public Iterable<Vendedor> getVendedores() {
		return repositorio2.findAll();
	}

	@PutMapping(value="/{id}")
	public ResponseEntity update(@PathVariable("id") long id, @RequestBody Vendedor vendedor) {
		
		return repositorio2.findById(id).map(record-> {
					   record.setCodigo(vendedor.getCodigo());
		               record.setNome(vendedor.getNome());
		               record.setComissao(vendedor.getComissao());
		               Vendedor updated = repositorio2.save(record);
		               return ResponseEntity.ok().body(updated);
		           }).orElse(ResponseEntity.notFound().build());					
	}

	@PostMapping("/clientes")
	public Vendedor create(@RequestBody Vendedor vendedor) {
		return repositorio2.save(vendedor);
	}

	@DeleteMapping(path= {"/{id}"})
	public ResponseEntity<?> delete(@PathVariable long id) {
		   return repositorio2.findById(id)
		           .map(record -> {
		               repositorio2.deleteById(id);
		               return ResponseEntity.ok().build();
		           }).orElse(ResponseEntity.notFound().build());
	}
}

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

import com.trabalhoPoo.projetoRevendas.domain.Cliente;
import com.trabalhoPoo.projetoRevendas.domain.ClienteRepositorio;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
	@Autowired
	private ClienteRepositorio repositorio;

	@GetMapping("/clientes")
	public Iterable<Cliente> getClientes() {
		return repositorio.findAll();
	}

	@PutMapping(value="/{id}")
	public ResponseEntity update(@PathVariable("id") long id, @RequestBody Cliente cliente) {
		
		return repositorio.findById(id).map(record-> {
					   record.setCodigo(cliente.getCodigo());
		               record.setNome(cliente.getNome());
		               record.setTipoCliente(cliente.getTipoCliente());
		               Cliente updated = repositorio.save(record);
		               return ResponseEntity.ok().body(updated);
		           }).orElse(ResponseEntity.notFound().build());					
	}

	@PostMapping("/clientes")
	public Cliente create(@RequestBody Cliente cliente) {
		return repositorio.save(cliente);
	}

	@DeleteMapping(path= {"/{id}"})
	public ResponseEntity<?> delete(@PathVariable long id) {
		   return repositorio.findById(id)
		           .map(record -> {
		               repositorio.deleteById(id);
		               return ResponseEntity.ok().build();
		           }).orElse(ResponseEntity.notFound().build());
	}
}

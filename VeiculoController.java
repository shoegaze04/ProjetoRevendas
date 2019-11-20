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

import com.trabalhoPoo.projetoRevendas.domain.Veiculo;
import com.trabalhoPoo.projetoRevendas.domain.VeiculoRepositorio;

@RestController
@RequestMapping("/veiculos")
public class VeiculoController {
	@Autowired
	private VeiculoRepositorio repositorio3;
	
	@GetMapping("/veiculos")
	public Iterable<Veiculo> getVeiculos() {
		return repositorio3.findAll();
	}

	@PutMapping(value="/{id}")
	public ResponseEntity update(@PathVariable("id") long id, @RequestBody Veiculo veiculo) {
		
		return repositorio3.findById(id).map(record-> {
					   record.setCodigo(veiculo.getCodigo());
		               record.setDescricao(veiculo.getDescricao());
		               record.setValor(veiculo.getValor());
		               Veiculo updated = repositorio3.save(record);
		               return ResponseEntity.ok().body(updated);
		           }).orElse(ResponseEntity.notFound().build());					
	}

	@PostMapping("/veiculos")
	public Veiculo create(@RequestBody Veiculo veiculo) {
		return repositorio3.save(veiculo);
	}

	@DeleteMapping(path= {"/{id}"})
	public ResponseEntity<?> delete(@PathVariable long id) {
		   return repositorio3.findById(id)
		           .map(record -> {
		               repositorio3.deleteById(id);
		               return ResponseEntity.ok().build();
		           }).orElse(ResponseEntity.notFound().build());
	}
}

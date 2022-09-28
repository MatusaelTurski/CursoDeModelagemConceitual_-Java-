package leasutam.resources;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import leasutam.domain.Categoria;
import leasutam.services.CategoriaService;


@RestController 
@RequestMapping(value="/categorias") 
public class CategoriaResource {

	@Autowired
	private CategoriaService service;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {

	    // para esse service.buscar funcionar tive que acrescentar código
		// o código foi acrescentado em: CategoriaService.java
		// O CÓDIGO CITADO ESTÁ NA ABA CITADA MARCADO COMO:
		//DELETAR?? //////////////////////////////////////////////////////////////////////////////////////////////////////////////
		Categoria obj = service.buscar(id);
		
		return ResponseEntity.ok().body(obj);
		
	}
}

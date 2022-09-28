package leasutam.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import leasutam.Repositories.CategoriaRepository;
import leasutam.domain.Categoria;


@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;

	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElse(null);
	}

	//DELETAR?? //////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//public Categoria buscar(Integer id) {
		 //TODO Auto-generated method stub
		//return null;
	//}
	

}

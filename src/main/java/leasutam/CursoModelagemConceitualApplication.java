package leasutam;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import leasutam.Repositories.CategoriaRepository;
import leasutam.domain.Categoria;

@SpringBootApplication
public class CursoModelagemConceitualApplication implements CommandLineRunner {

	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	
	public static void main(String[] args) {
		SpringApplication.run(CursoModelagemConceitualApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Categoria cat1 = new Categoria(null, "Informática");
		Categoria cat2 = new Categoria(null, "Escritório");
	
		categoriaRepository.saveAll(Arrays.asList(cat1, cat2));
		
	}

}

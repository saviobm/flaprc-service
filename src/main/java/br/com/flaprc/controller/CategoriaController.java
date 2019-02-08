package br.com.flaprc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.flaprc.entidades.Categoria;
import br.com.flaprc.exceptions.FlapRCException;
import br.com.flaprc.repository.FlapRCRepository;

@Controller
@EnableAutoConfiguration
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(value = "/categoria-controller")
public class CategoriaController {
	
	@Autowired
	private FlapRCRepository<Categoria> repository;
	
	@RequestMapping(method = RequestMethod.POST, consumes= "application/json", path = "/salvar")
	public Categoria salvar(@RequestBody Categoria categoria) throws FlapRCException {
		Categoria categoriaSalva = null;
		if (categoria != null) {
			categoriaSalva = this.repository.save(categoria);
		} 
		return categoriaSalva;
	}

}

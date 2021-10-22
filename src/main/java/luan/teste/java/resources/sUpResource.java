package luan.teste.java.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import java.util.List;
import luan.teste.java.models.sUp;
import luan.teste.java.repository.sUprepository;

@RestController
@RequestMapping(value="/api")
@Api(value="API Rest Security Update")
@CrossOrigin(origins="*")
public class sUpResource {
	@Autowired
	sUprepository sUpRepository;

	@GetMapping("/sUp")
	@ApiOperation(value="Retorna uma lista de Updates")
	public List<sUp> listasUp() {
		return sUpRepository.findAll();
	}

	@GetMapping("/sUp/{id}")
	@ApiOperation(value="Retorna uma unica Update")
	public sUp listasUpUnico(@PathVariable(value = "id") long id) {
		return sUpRepository.findById(id);
	}

	@PostMapping("/sUp")
	@ApiOperation(value="Salva uma Update")
	public sUp salvasUp(@RequestBody sUp sUp) {
		return sUpRepository.save(sUp);
	}

	@DeleteMapping("/sUp")
	@ApiOperation(value="Deleta uma Update")
	public void deletasUp(@RequestBody sUp sUp) {
		sUpRepository.delete(sUp);
	}

	@PutMapping("/sUp")
	@ApiOperation(value="Atualiza uma Updates")
	public sUp atualizasUp(@RequestBody sUp sUp) {
		return sUpRepository.save(sUp);
	}

}
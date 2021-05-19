package br.com.fiap.apilocation.entrypoint;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.apilocation.entity.State;
import br.com.fiap.apilocation.usecase.LocationUseCase;


@RestController
@RequestMapping("locations")
public class LocationController {

	private final LocationUseCase useCase;
	
	public LocationController(LocationUseCase useCase) {
		this.useCase = useCase;
	}
	
	@GetMapping("/states")
	public List<State> findAllStates() {		
		return 	useCase.findAllStates();
	}
}

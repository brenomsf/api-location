package br.com.fiap.apilocation.usecase;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.fiap.apilocation.dataprovider.LocationRepository;
import br.com.fiap.apilocation.entity.State;

@Service
public class LocationUseCaseImpl implements LocationUseCase {

	private final LocationRepository repository;
	
	public LocationUseCaseImpl(LocationRepository repository) {
		this.repository = repository;
	}
	
	
	@Override
	public List<State> findAllStates() {
		return repository.findAllStates();
	}

}

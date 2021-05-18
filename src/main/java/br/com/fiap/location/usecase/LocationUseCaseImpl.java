package br.com.fiap.location.usecase;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import br.com.fiap.location.dataprovider.LocationRepository;
import br.com.fiap.location.entity.State;

@ApplicationScoped
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

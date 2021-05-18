package br.com.fiap.location.dataprovider;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.fiap.location.entity.State;

@ApplicationScoped
public class LocationRepositoryImpl implements LocationRepository{

	@Override
	public List<State> findAllStates() {
		try {
			return new ObjectMapper().readValue(getClass().getResource("/States.json"), List.class);
		}catch(Exception ex) {
			return new ArrayList<State>();
		}
	}

}

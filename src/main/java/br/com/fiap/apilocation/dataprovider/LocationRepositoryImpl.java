package br.com.fiap.apilocation.dataprovider;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.fiap.apilocation.entity.State;

@Repository
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

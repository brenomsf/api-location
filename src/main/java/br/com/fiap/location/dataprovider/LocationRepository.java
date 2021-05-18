package br.com.fiap.location.dataprovider;

import java.util.List;

import br.com.fiap.location.entity.State;

public interface LocationRepository {

	List<State> findAllStates();
}

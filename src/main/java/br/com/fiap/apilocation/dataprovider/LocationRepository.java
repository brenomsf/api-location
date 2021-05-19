package br.com.fiap.apilocation.dataprovider;

import java.util.List;

import br.com.fiap.apilocation.entity.State;

public interface LocationRepository {

	List<State> findAllStates();
}

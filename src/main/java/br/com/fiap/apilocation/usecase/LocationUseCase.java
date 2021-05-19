package br.com.fiap.apilocation.usecase;

import java.util.List;


import br.com.fiap.apilocation.entity.State;

public interface LocationUseCase {

	List<State> findAllStates();
}

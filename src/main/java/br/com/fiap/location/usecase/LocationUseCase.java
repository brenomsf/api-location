package br.com.fiap.location.usecase;

import java.util.List;

import br.com.fiap.location.entity.State;

public interface LocationUseCase {

	List<State> findAllStates();
}

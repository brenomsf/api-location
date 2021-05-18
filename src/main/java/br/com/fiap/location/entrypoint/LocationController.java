package br.com.fiap.location.entrypoint;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.fiap.location.usecase.LocationUseCase;


@Path("/locations")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@ApplicationScoped
public class LocationController {

	private final LocationUseCase useCase;
	
	public LocationController(LocationUseCase useCase) {
		this.useCase = useCase;
	}
	
	@GET
	@Path("/states")
	public Response findAllStates() {		
		return Response.ok().entity(
				useCase.findAllStates()
		).build();
	}
}

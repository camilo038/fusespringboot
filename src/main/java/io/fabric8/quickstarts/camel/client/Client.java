package io.fabric8.quickstarts.camel.client;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.camel.Body;

import io.fabric8.quickstarts.camel.model.RequestConsulatarCliente;

public class Client {

	
	@POST
	@Path("/consultarCliente")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public void consultarCliente(@Body RequestConsulatarCliente body) {
	}

}

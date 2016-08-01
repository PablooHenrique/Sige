package br.com.owl.resources;

import java.net.URI;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import com.google.gson.Gson;

import br.com.owl.controller.SobreviventeController;
import br.com.owl.models.Sobrevivente;

@Path("/sobrevivente")
public class SobreviventeResource {
	
	private SobreviventeController sobreviventeController = new SobreviventeController();
	
	@Path("/buscar")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response buscar(){
		//return Response.ok().header("Access-Control-Allow-Origin", "*").entity(sobreviventeController.buscarTodosSobreviventes()).build();
		return Response.ok().entity(sobreviventeController.buscarTodosSobreviventes()).build(); 
	}
	
	@Path("/buscar/{id}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response buscarSobreviventePorId(@PathParam("id") long id){
		return Response.ok().entity(sobreviventeController.buscarSobreviventePorId(id)).build();
	}
	
	@Path("/salvar")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response adicionar(String conteudo){
		System.out.println("Entrou no metodo");
		
		Sobrevivente sobrevivente = new Gson().fromJson(conteudo, Sobrevivente.class);
		sobreviventeController.salvar(sobrevivente);
		URI uri = URI.create("/sobrevivente/salvar"+sobrevivente.getId());
		return Response.created(uri).build();		
	}
	
	@Path("/marcarComoInfectado/{id}")
	@PUT
	public Response marcarComoInfectado(@PathParam("id") long id ){
		new SobreviventeController().marcarComoInfectado(id);
		return Response.ok().build();
	}
	
	@Path("/alterarLatitude/{id}/{latitude}")
	@PUT
	public Response alterarLatitude(@PathParam("id") long id, @PathParam("latitude") String latitude){
		System.out.println("Entrou no metodo alterar latitude");
		new SobreviventeController().alterarlatitude(latitude, id);
		System.out.println("saiu metodo alterar latitude");
		return Response.ok().build();
	}
	
	@Path("/alterarLongitude/{id}/{longitude}")
	@PUT
	public Response alterarLongitude(@PathParam("id") long id, @PathParam("longitude") String longitude){
		System.out.println("Entrou no metodo alterar longitude");
		new SobreviventeController().alterarLongitude(longitude, id);
		System.out.println("saiu do metodo alterar longitude");
		return Response.ok().build();
	}
	
	@Path("/alterarLatitudeLongitude/{id}/{latitude}/{longitude}")
	@PUT
	public Response alterarLatitudeLongitude(@PathParam("id") long id, @PathParam("latitude") String latitude, @PathParam("longitude") String longitude){
		System.out.println("Entrou no metodo alterar latitude");
		new SobreviventeController().alterarLatitudeLongitude(longitude, latitude, id);
		System.out.println("saiu metodo alterar latitude");
		return Response.ok().build();
	}	
}























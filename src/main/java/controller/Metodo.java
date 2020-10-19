package controller;

import java.awt.PageAttributes.MediaType;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.jackson.JacksonFeature;

import webApi.WebApi.Album;
import webApi.WebApi.Foto;
import webApi.WebApi.Usuario;

public class Metodo {

	public static List<Usuario> getAllUser() {

		// Buscar los usuarios
		Client client = ClientBuilder.newClient();
		// client=ClientBuilder.newClient().register(JacksonFeature.class);
		WebTarget target = client.target("https://jsonplaceholder.typicode.com").path("users");
		Invocation.Builder invocationBuilder = target.request(javax.ws.rs.core.MediaType.APPLICATION_JSON);
		Response respuestaPublicaciones = invocationBuilder.get();
		List<Usuario> listaUsuarios = respuestaPublicaciones.readEntity(new GenericType<List<Usuario>>() {
		});
		listaUsuarios.forEach(pub -> System.out.println(pub.getName() + " - " + pub.getAddress()));
		// System.out.println(listaUsuarios);
		return listaUsuarios;
	}

	// buscar todos los album

	public static List<Album> getAlbum() {

		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("https://jsonplaceholder.typicode.com").path("albums");
		Invocation.Builder invocationBuilder = target.request(javax.ws.rs.core.MediaType.APPLICATION_JSON);
		Response respuestaPublicaciones = invocationBuilder.get();
		List<Album> listaAlbum = respuestaPublicaciones.readEntity(new GenericType<List<Album>>() {});
		listaAlbum.forEach(alb -> System.out.println(alb.getId() + "-" + alb.getUserId() + "-" + alb.getTitle()));
		return listaAlbum;

	}

	// buscar album especifico

	public static void getUnicAlbum(String id) {
		
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("https://jsonplaceholder.typicode.com").path("albums").path(id);
		Invocation.Builder invocationBuilder = target.request(javax.ws.rs.core.MediaType.APPLICATION_JSON);
		Response respuestaPublicaciones = invocationBuilder.get();
		Album album =respuestaPublicaciones.readEntity(new GenericType<Album>(){});
		System.out.println(album.getId()+"\n"+album.getUserId()+"\n"+album.getTitle());
		
	}
	
	//obtener todas las fotos
	public static void  nombreFoto(){
		Client client=ClientBuilder.newClient();
		WebTarget target = client.target("https://jsonplaceholder.typicode.com").path("photos");
		Invocation.Builder invocationBuilder = target.request(javax.ws.rs.core.MediaType.APPLICATION_JSON);
		Response respuestaPublicaciones = invocationBuilder.get();
		List<Foto> listaFotos = respuestaPublicaciones.readEntity(new GenericType<List<Foto>>() {});
		listaFotos.stream().filter(p -> p.getTitle().contains("ipsam do")).sorted(Comparator.comparing(Foto::getTitle)).forEach(p -> System.out.println(p.getTitle()));
		
		
	
	}


}
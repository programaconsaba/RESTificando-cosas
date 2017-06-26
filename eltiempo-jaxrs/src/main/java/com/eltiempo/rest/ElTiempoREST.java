package com.eltiempo.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("api")
public class ElTiempoREST {
	
	@GET
	@Path("/tiempo")
	public Response obtenerTiempo(){
		Tiempo tiempo = new Tiempo();
		
		tiempo.setCiudad("Madrid jax");
		tiempo.setTemperatura(99);
		
		return Response.ok().header("Access-Controll-Allow-Origin", "*").entity(tiempo).build();
	}
}

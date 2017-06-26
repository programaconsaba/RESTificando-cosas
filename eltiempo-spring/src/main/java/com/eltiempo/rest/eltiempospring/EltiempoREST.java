package com.eltiempo.rest.eltiempospring;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EltiempoREST {

	@RequestMapping("/api/tiempo")
	@CrossOrigin("*")
	public TiempoBean obtenerTiempo() {
		TiempoBean tiempo = new TiempoBean();

		tiempo.setCiudad("Madrid (spring)");
		tiempo.setTemperatura(26);

		return tiempo;
	}

}

package com.eltiempo.rest;

import static spark.Spark.*;

public class SparkJavaApp {
	public static void main(String[] args) {
		port(8082);

		before((request, response) -> {
			response.header("Access-Control-Allow-Origin", "*");

			response.type("application/json");
		});

		get("/api/tiempo", (request, response) -> {
			return "{\"ciudad\":\"Madrid (spark)\", \"temperatura\":8}";
		});
	}
}

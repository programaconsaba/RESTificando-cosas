package com.eltiempo.rest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import fish.payara.micro.BootstrapException;
import fish.payara.micro.PayaraMicro;

public class ElTiempoJAXRSApp {
	public static void main(String[] args) throws FileNotFoundException, BootstrapException {
		PayaraMicro.getInstance().setHttpPort(8089).bootStrap().deploy("eltiempo-jaxrs.war", "", new FileInputStream("target/eltiempo-jaxrs.war"));
	}
}

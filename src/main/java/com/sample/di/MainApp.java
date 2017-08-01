package com.sample.di;

import java.io.IOException;
import java.net.URI;

import javax.ws.rs.core.UriBuilder;

import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

public class MainApp {

	private final static URI ADDRESS = UriBuilder.fromPath("http://0.0.0.0:8080").build();

	public static HttpServer getLookupServer() {
		ResourceConfig resourceConfig = new ResourceConfig();
		resourceConfig.packages("com.sample.di");
		HttpServer server = GrizzlyHttpServerFactory.createHttpServer(ADDRESS, resourceConfig);
		return server;
	}

	public static void main(String[] args) throws IOException {
		getLookupServer().start();
	}
}

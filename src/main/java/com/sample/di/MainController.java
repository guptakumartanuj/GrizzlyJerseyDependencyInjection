package com.sample.di;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/main")
public class MainController {

  @Inject
  public MainService mainService;

  @GET
  public String get(@QueryParam("name") String name) {
    return mainService.testService(name);
  }

  @GET
  @Path("/test")
  @Produces(MediaType.APPLICATION_JSON)
  public String ping() {
    return "OK";
  }
}
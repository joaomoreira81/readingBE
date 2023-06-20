package org.gs.controller;


import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.gs.model.ValidAnswer;
import org.gs.repository.ValidAnswerRepository;

@Path("/validanswers")
public class ValidAnswerController {

    @Inject
    ValidAnswerRepository repository;

    @GET
    public Response get() {
        return Response.ok(repository.findOrdered()).build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response create(ValidAnswer answer) {
        repository.create(answer);
        return Response.ok().build();
    }
}

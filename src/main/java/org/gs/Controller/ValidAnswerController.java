package org.gs.Controller;

import java.net.URISyntaxException;

import javax.inject.Inject;
import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.gs.Model.ValidAnswer;
import org.gs.Repository.ValidAnswerRepository;

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
    public Response create(@Valid ValidAnswer answer) {
        repository.create(answer);
        return Response.ok().build();
    }
}

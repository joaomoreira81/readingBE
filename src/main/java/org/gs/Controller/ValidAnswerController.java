package org.gs.Controller;

import java.net.URISyntaxException;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
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
    public Response create(ValidAnswer answer) throws URISyntaxException {
        repository.create(answer);
        return Response.ok().build();
    }
}

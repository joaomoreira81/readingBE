package org.gs.Controller;

import org.gs.Model.Result;
import org.gs.Repository.ResultsRepository;
import org.gs.Service.CalculateResults;

import javax.inject.Inject;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/result")
public class ResultsController {

    @Inject
    ResultsRepository repository;

    @Inject
    CalculateResults calculateResults;

    @POST
    @Path("/{studentId}")
    public Response create(@PathParam("studentId") String studentId) {
        repository.create(new Result(studentId, calculateResults.calculateResults(studentId)));
        return Response.ok().build();
    }
}

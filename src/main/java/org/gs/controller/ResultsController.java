package org.gs.controller;

import org.gs.model.Result;
import org.gs.repository.ResultsRepository;
import org.gs.service.CalculateResults;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/result")
public class ResultsController {

    @Inject
    ResultsRepository repository;

    @Inject
    CalculateResults calculateResults;

    @GET
    @Path("/{studentId}")
    public Response create(@PathParam("studentId") String studentId) {
        repository.create(new Result(studentId, calculateResults.calculateResults(studentId)));
        return Response.ok().build();
    }
}

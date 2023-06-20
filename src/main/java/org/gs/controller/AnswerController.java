package org.gs.controller;

import org.gs.model.SerieAnswer;
import org.gs.repository.AnswerRepository;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/answer")
public class AnswerController {

    @Inject
    AnswerRepository repository;

    @GET
    @Path("/student/{studentId}")
    public Response getAllFromStudent(@PathParam("studentId") String studentId) {
        return Response.ok(repository.findByStudent(studentId)).build();
    }

    @GET
    @Path("/serie/{serie}")
    public Response getAllFromSerie(@PathParam("serie") String serie) {
        return Response.ok(repository.findBySeries(serie)).build();
    }

    @POST
    public Response create(SerieAnswer answer) {
        SerieAnswer valid = new SerieAnswer(answer.getStudentId(), answer.getSerie(), answer.getAnswer());
        repository.create(valid);
        return Response.ok().build();
    }
}

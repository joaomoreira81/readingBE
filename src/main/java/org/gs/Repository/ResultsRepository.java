package org.gs.Repository;

import io.quarkus.mongodb.panache.PanacheMongoRepository;
import org.gs.Model.Result;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;

@ApplicationScoped
public class ResultsRepository implements PanacheMongoRepository<Result> {

    public List<Result> getAll() {
        return listAll().stream().toList();
    }
    public List<Result> getByStudent(String studentId) {
        return find("studentId", studentId).stream().toList();
    }
    public void create(Result result) {
        persist(result);
    }
    
}

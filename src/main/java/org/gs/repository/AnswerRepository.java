package org.gs.repository;

import io.quarkus.mongodb.panache.PanacheMongoRepository;
import org.gs.model.SerieAnswer;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;

@ApplicationScoped
public class AnswerRepository implements PanacheMongoRepository<SerieAnswer> {

    public List<SerieAnswer> findBySeries(String serie) {
        return list("serie",  serie).stream().toList();
    }

    public List<SerieAnswer> findByStudent(String student) {
        return list("studentId",  student).stream().toList();
    }

    public void create(SerieAnswer answer) {
        persist(answer);
    }
    
}

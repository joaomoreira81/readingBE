package org.gs.Repository;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import io.quarkus.mongodb.panache.PanacheMongoRepository;
import io.quarkus.panache.common.Sort;
import org.gs.Model.ValidAnswer;

@ApplicationScoped
public class ValidAnswerRepository implements PanacheMongoRepository<ValidAnswer> {

    public List<ValidAnswer> findOrdered() {
        return listAll(Sort.by("serie"));
    }

    public void create(ValidAnswer answer) {
        persist(answer);
    }
    
}

package org.gs.repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.enterprise.context.ApplicationScoped;

import io.quarkus.mongodb.panache.PanacheMongoRepository;
import io.quarkus.panache.common.Sort;
import org.gs.model.ValidAnswer;

@ApplicationScoped
public class ValidAnswerRepository implements PanacheMongoRepository<ValidAnswer> {

    public List<ValidAnswer> findOrdered() {
        return listAll(Sort.by("serie"));
    }
    public Map<String, List<Integer>> findOrderedToMap() {
        Map<String, List<Integer>> validAnswers = new HashMap<>();

        listAll(Sort.by("serie")).forEach(a ->
            validAnswers.put(a.getSeries(), a.getCorrectAnswer())
        );
        return validAnswers;
    }

    public void create(ValidAnswer answer) {
        persist(answer);
    }
    
}

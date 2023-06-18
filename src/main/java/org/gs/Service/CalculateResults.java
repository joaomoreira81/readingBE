package org.gs.Service;

import org.gs.Model.AnswerStatus;
import org.gs.Model.SerieAnswer;
import org.gs.Model.ValidAnswer;
import org.gs.Repository.AnswerRepository;
import org.gs.Repository.ValidAnswerRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ApplicationScoped
public class CalculateResults {

    @Inject
    AnswerRepository answerRepository;
    @Inject
    ValidAnswerRepository validAnswerRepository;

    public Map<String, AnswerStatus> calculateResults(String studentId) {
        List<SerieAnswer> answers = answerRepository.findByStudent(studentId);
        Map<String, AnswerStatus> results = new HashMap<>();
        answers.forEach(a -> {
            if(validAnswerRepository.findOrderedToMap().get(a.getSerie()) == a.getAnswer()) {
                results.put(a.getSerie(),AnswerStatus.OK);
            } else {
                results.put(a.getSerie(),AnswerStatus.NOK);
            }
        });
        return results;
    }


}

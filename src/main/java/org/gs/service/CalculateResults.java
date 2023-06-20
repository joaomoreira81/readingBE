package org.gs.service;

import org.gs.model.AnswerStatus;
import org.gs.model.SerieAnswer;
import org.gs.repository.AnswerRepository;
import org.gs.repository.ValidAnswerRepository;

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
            if(calculateSerie(a,validAnswerRepository.findOrderedToMap().get(a.getSerie()) )) {
                results.put(a.getSerie(),AnswerStatus.OK);
            } else {
                results.put(a.getSerie(),AnswerStatus.NOK);
            }
        });
        return results;
    }

    public boolean calculateSerie(SerieAnswer answer, List<Integer> correcAnswer) {
        return answer.getAnswer().stream().filter(a ->
                a.isSelected() && correcAnswer.contains(a.getPosition())).count() == 2;
    }


}

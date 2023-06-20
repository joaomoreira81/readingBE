package org.gs.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.quarkus.mongodb.panache.PanacheMongoEntity;
import java.util.List;

public class ValidAnswer extends PanacheMongoEntity {

    @JsonProperty("series")
    private String series;
    @JsonProperty("correctAnswer")
    private List<Integer> correctAnswer;

    public void setSeries(String series) {
        this.series = series;
    }

    public void setCorrectAnswer(List<Integer> correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public String getSeries() {
        return series;
    }

    public List<Integer> getCorrectAnswer() {
        return correctAnswer;
    }

    public ValidAnswer(String series, List<Integer> correctAnswer) {
        this.series = series;
        this.correctAnswer = correctAnswer;
    }

    public ValidAnswer() {}
}

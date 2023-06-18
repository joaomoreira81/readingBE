package org.gs.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.quarkus.mongodb.panache.PanacheMongoEntity;

public class ValidAnswer extends PanacheMongoEntity {

    @JsonProperty("series")
    private String series;
    @JsonProperty("correctAnswer")
    private int correctAnswer;

    public void setSeries(String series) {
        this.series = series;
    }

    public void setCorrectAnswer(int correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public String getSeries() {
        return series;
    }

    public int getCorrectAnswer() {
        return correctAnswer;
    }

    public ValidAnswer(String series, int correctAnswer) {
        this.series = series;
        this.correctAnswer = correctAnswer;
    }

    public ValidAnswer() {}
}

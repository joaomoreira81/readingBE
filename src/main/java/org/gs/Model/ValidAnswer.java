package org.gs.Model;

import io.quarkus.mongodb.panache.PanacheMongoEntity;
import org.bson.types.ObjectId;

public class ValidAnswer extends PanacheMongoEntity {

    public ObjectId id;
    public String series;
    public int correctAnswer;

    public ValidAnswer() {
    }

    public ValidAnswer(String series, int correctAnswer) {
        this.series = series;
        this.correctAnswer = correctAnswer;
    }
}

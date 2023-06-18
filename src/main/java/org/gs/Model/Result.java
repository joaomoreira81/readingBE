package org.gs.Model;

import io.quarkus.mongodb.panache.PanacheMongoEntity;
import org.bson.types.ObjectId;

import java.util.Date;
import java.util.Map;

public class Result extends PanacheMongoEntity {

    private ObjectId id;
    private String studentId;
    private Map<String, AnswerStatus> results;
    private Date date;

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setResults(Map<String, AnswerStatus> results) {
        this.results = results;
    }

    public String getStudentId() {
        return studentId;
    }

    public Map<String, AnswerStatus> getResults() {
        return results;
    }

    public Result(String studentId, Map<String, AnswerStatus> results) {
        this.studentId = studentId;
        this.results = results;
        this.date = new Date();
    }
}


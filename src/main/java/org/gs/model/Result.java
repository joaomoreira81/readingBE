package org.gs.model;

import io.quarkus.mongodb.panache.PanacheMongoEntity;

import java.util.Date;
import java.util.Map;

public class Result extends PanacheMongoEntity {

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

    public Date getDate() {
        return date;
    }

    public Result(String studentId, Map<String, AnswerStatus> results) {
        this.studentId = studentId;
        this.results = results;
        this.date = new Date();
    }
}


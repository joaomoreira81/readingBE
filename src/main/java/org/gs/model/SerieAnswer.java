package org.gs.model;

import io.quarkus.mongodb.panache.PanacheMongoEntity;

import java.util.Date;
import java.util.List;

public class SerieAnswer extends PanacheMongoEntity {

    private String studentId;
    private String serie;
    private List<Answer> answer;
    private Date date;

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public void setAnswer(List<Answer> answer) {
        this.answer = answer;
    }

    public SerieAnswer() {
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return this.date;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getSerie() {
        return serie;
    }

    public List<Answer> getAnswer() {
        return answer;
    }

    public SerieAnswer(String studentId, String serie, List<Answer> answer) {
        this.studentId = studentId;
        this.serie = serie;
        this.answer = answer;
        this.date = new Date();
    }


}

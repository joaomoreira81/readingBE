package org.gs.Model;

import io.quarkus.mongodb.panache.PanacheMongoEntity;
import org.bson.types.ObjectId;

import java.util.Date;

public class SerieAnswer extends PanacheMongoEntity {

    private ObjectId id;
    private String studentId;
    private String serie;
    private int answer;
    private Date date;

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }

    public SerieAnswer() {
    }

    public String getStudentId() {
        return studentId;
    }

    public String getSerie() {
        return serie;
    }

    public int getAnswer() {
        return answer;
    }

    public SerieAnswer(String studentId, String serie, int answer) {
        this.studentId = studentId;
        this.serie = serie;
        this.answer = answer;
        this.date = new Date();
    }


}

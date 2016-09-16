package com.mbti.domain;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
/**
 * Created by Ari on 9/6/16.
 */
@Entity
public class Mbti implements Serializable {


    public enum Subject { Direction, Observation, Orientation, Assertion};
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String question;
    private Subject subject;
    private Integer answer;
    public Mbti(){
        super();
    }

    public Mbti(Subject s, String q){
        super();
        setSubject(s);
        setQuestion(q);
    }

    public Mbti(Subject s, String q, Integer a){
        super();
        setSubject(s);
        setQuestion(q);
        setAnswer(a);
    }

    public Integer getAnswer() {
        return answer;
    }

    public void setAnswer(Integer a) {
        this.answer = a;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject s) {
        this.subject = s;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getQuestion() {
        return question;
    }
    public void setQuestion(String question) {
        this.question = question;
    }

}
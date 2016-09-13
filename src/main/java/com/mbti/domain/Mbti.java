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
    public static enum direction { EXTROVERSION, INTROVERSION };
    public static enum observation { SENSING, INTUITION };
    public static enum orientation { THINKING, FEELING };
    public static enum assertion { PERCEIVING, JUDGING };

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String question;

    // standard getters and setters

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
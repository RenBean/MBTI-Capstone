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
    public static enum Direction { EXTROVERSION, INTROVERSION };
    public static enum Observation { SENSING, INTUITION };
    public static enum Orientation { THINKING, FEELING };
    public static enum Assertion { PERCEIVING, JUDGING };

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String question;

    private Direction direction;
    private Observation observation;
    private Orientation orientation;
    private Assertion assertion;

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

    public Direction getDirection() {
        return direction;
    }
    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public Observation getObservation() {
        return observation;
    }
    public void setObservation(Observation observation) {
        this.observation = observation;
    }

    public Orientation getOrientation() {
        return orientation;
    }
    public void setOrientation(Orientation orientation) {
        this.orientation = orientation;
    }

    public Assertion getAssertion() {
        return assertion;
    }
    public void setAssertion(Assertion assertion) {
        this.assertion = assertion;
    }




}
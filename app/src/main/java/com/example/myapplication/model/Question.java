package com.example.myapplication.model;

import java.util.List;

public class Question {
    private String mQuestion;
    private List<Object> mChoiceList;
    private int mAnswerIndex;

    public Question(String question, List<Object> choiceList, int answerIndex) {
        mQuestion = question;
        mChoiceList = choiceList;
        mAnswerIndex = answerIndex;
    }

    public String getQuestion() {
        return mQuestion;
    }

    public List<Object> getChoiceList() {
        return mChoiceList;
    }

    public int getAnswerIndex() {
        return mAnswerIndex;
    }
}

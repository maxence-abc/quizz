package com.example.myapplication.model;

import java.util.List;

public class QuestionBank {

    private List<Question> mQuestionList;
    private int mNextQuestionIndex;

    public QuestionBank(list<Question> questionlist){

    }

    public Question getNextQuestion(){

    }

    public Question getCurrentQuestion() {
        return mCurrentQuestion;
    }

    public void setCurrentQuestion(Question currentQuestion) {
        mCurrentQuestion = currentQuestion;
    }
}

package com.example.zad1;

public class Question {
    private int questionID;
    private boolean trueAnwser;
    public Question(int questionID, boolean trueAnwser){
        this.questionID = questionID;
        this.trueAnwser = trueAnwser;
    }

    public boolean isTrueAnswer() {
        if(this.trueAnwser == true){
            return true;
        }
        else{
            return false;
        }
    }

    public int getQuestionId() {
        return questionID;
    }
}

package com.moodanalyser;

public class MoodAnalyserException extends Exception{
     ExceptionType type;
    enum ExceptionType
    {
        ENTURED_NULL,ENTURED_EMPTY;
    }
    public MoodAnalyserException(ExceptionType type,String message) {
        super(message);
        this.type=type;
    }
}

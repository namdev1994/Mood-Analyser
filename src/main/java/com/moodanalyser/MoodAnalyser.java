package com.moodanalyser;

public class MoodAnalyser {
    public String moodAnalyser(String message) throws MoodAnalyserException {
        try {
            if (message=="") {
                throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.ENTURED_EMPTY, "Enter Proper mood");
            }
            if(message.contains("Sad"))
            {
                return "SAD";
            } else {
                return "HAPPY";
            }
        } catch (NullPointerException e) {
            throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.ENTURED_NULL,"Enter proper mood");

        }
    }
}

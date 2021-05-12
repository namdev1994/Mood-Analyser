package com.moodanalyser;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {
    @Test
    public void given_Message_When_Sad_Should_Return_Sad() {
        MoodAnalyser moodAnalyser= new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("This is a Sad Message");
        Assertions.assertEquals("SAD", mood);
    }

    @Test
    public void given_Message_When_Null_Should_Return_Happy() {
        MoodAnalyser moodAnalyser= new MoodAnalyser();
        String mood = moodAnalyser.moodAnalyseMoodContainsNull(null);
        Assertions.assertEquals("HAPPY", mood);
    }

    @Test
    public void given_Message_When_Null_ReturnCustomException(){
        try {
            MoodAnalyser moodAnalyser = new MoodAnalyser();
            String mood = moodAnalyser.moodAnalyzerException(null);
            Assertions.assertEquals("HAPPY", mood);
        }catch (MoodAnalyserException e){
            // Assertions.assertEquals("Enter Valid Mood",e.getMessage());
            e.printStackTrace();
        }
    }
}

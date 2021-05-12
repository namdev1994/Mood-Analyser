package com.moodanalyser;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {
    @Test
    public void given_Message_When_Sad_Should_Return_Sad() {
        MoodAnalyser moodAnalyser= new MoodAnalyser();
        String mood = null;
        try {
            mood = moodAnalyser.moodAnalyser("This is a Sad Message");
        } catch (MoodAnalyserException e) {
            e.printStackTrace();
        }
        Assertions.assertEquals("SAD", mood);
    }

    @Test
    public void given_Message_When_Null_Should_Return_Happy() {
        MoodAnalyser moodAnalyser= new MoodAnalyser();
        String mood = null;
        try {
            mood = moodAnalyser.moodAnalyser(null);
            Assertions.assertEquals("HAPPY", mood);
        } catch (MoodAnalyserException e) {
            Assertions.assertEquals(MoodAnalyserException.ExceptionType.ENTURED_NULL,e.type);
            Assertions.assertEquals("Enter proper mood",e.getMessage());
        }
    }

    @Test
    public void given_Message_When_Null_ReturnCustomException(){
        try {
            MoodAnalyser moodAnalyser = new MoodAnalyser();
            String mood = moodAnalyser.moodAnalyser("");
            Assertions.assertEquals("HAPPY", mood);
        }catch (MoodAnalyserException e){
            Assertions.assertEquals(MoodAnalyserException.ExceptionType.ENTURED_EMPTY,e.type);
            e.printStackTrace();
        }
    }
}

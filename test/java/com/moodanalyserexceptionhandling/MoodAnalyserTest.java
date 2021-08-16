package com.moodanalyserexceptionhandling;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest<ExpectedException> {
    @Test
    public void givenNullMood_ShouldReturnException() throws MoodAnalyserException {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        try{
            moodAnalyser.analyseMood(null);
        } catch (MoodAnalyserException e) {
            Assertions.assertEquals("PLease Enter a Proper Message!" , e.getMessage());
        }
    }
}
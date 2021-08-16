package com.moodanalyserexceptionhandling;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest<ExpectedException> {
    @Test
    public void givenNullMoodShouldReturnException() throws MoodAnalyserException {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        try{
            moodAnalyser.analyseMood(" ");
        } catch (MoodAnalyserException e) {
            Assertions.assertEquals(MoodAnalyserException.ExceptionType.ENTERED_EMPTY, e.getMessage());
        }
    }
}
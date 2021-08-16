package com.moodanalyserexceptionhandling;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {
    @Test
    public void givenNullMoodShouldReturnHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        String mood = moodAnalyser.analyseMood("This is a Happy message!:-)");
        Assertions.assertEquals("HAPPY", mood);
    }
}

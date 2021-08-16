package com.moodanalyserexceptionhandling;

public class MoodAnalyser {
    private String message;

    public MoodAnalyser(String message) {
        this.message = message;
    }

    public String analyseMood(String message) throws MoodAnalyserException {
        this.message = message;
        return analyseMood();
    }

    public String analyseMood() throws MoodAnalyserException {

        try {

            if (message.contains("Sad")) {
                return "SAD";
            } else {
                return "HAPPY";
            }
        }catch(NullPointerException e){
            throw new MoodAnalyserException ("PLease Enter a Proper Message!");
        }
    }
}

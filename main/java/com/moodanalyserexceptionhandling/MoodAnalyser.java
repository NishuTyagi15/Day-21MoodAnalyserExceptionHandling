package com.moodanalyserexceptionhandling;

public class MoodAnalyser {
    private String msg;

    public MoodAnalyser(String msg) {
        this.msg = msg;
    }

    public String analyseMood(String msg) {
        this.msg = msg;
        return analyseMood();
    }

    public String analyseMood() {
        try {
            if (msg.contains("Sad")) {
                return "SAD";
            } else {
                return "HAPPY";
            }
        } catch(NullPointerException e){
            return "HAPPY";
        }
    }
}

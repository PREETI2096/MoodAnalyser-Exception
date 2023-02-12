package com.bridgelabz.moodanalyser;

public class MoodAnalyser {

	 private String message;
    public void MoodAnalyser(String message) {
        this.message = message;
    }
    public MoodAnalyser() {
        this.message = null;
    }

    public String moodAnalyser() {
        try {
            if (this.message.contains("Sad"))
                return "SAD";
            else
                return "HAPPY";
        } catch (NullPointerException e) {
            return "HAPPY";
        }
    }
	 public static void main(String[] args) {
		MoodAnalyser mood = new MoodAnalyser ();
	    MoodAnalyser m = new MoodAnalyser();
	}
}

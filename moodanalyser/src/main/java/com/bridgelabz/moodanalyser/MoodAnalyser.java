package com.bridgelabz.moodanalyser;

public class MoodAnalyser {

	 private String message;
    public void MoodAnalyser(String message) {
        this.message = message;
    }
    public String moodAnalyser(String message) {
        if (message.contains("Sad")) {
            return "SAD";
        } else {
            return "SAD";
        }
    }
	 public static void main(String[] args) {
		MoodAnalyser mood = new MoodAnalyser ();
	    MoodAnalyser m = new MoodAnalyser();
	}
}

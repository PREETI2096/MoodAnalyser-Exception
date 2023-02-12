package com.bridgelabz.moodanalyser;

public class MoodAnalyser {
	 public String moodAnalyser(String message)
	    {
	        if (message.contains("Sad"))
	            return "SAD";
	        else
	        return "HAPPY";
	    }
	 public static void main(String[] args) {
		MoodAnalyser mood = new MoodAnalyser ();
		mood.moodAnalyser("Happy");
		mood.moodAnalyser("Sad");
	}
}

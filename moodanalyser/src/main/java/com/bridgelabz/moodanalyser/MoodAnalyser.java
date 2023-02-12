package com.bridgelabz.moodanalyser;

public class MoodAnalyser {
	private String message;
	
	 public MoodAnalyser(String message) {
		this.message = message;
	}
	public String moodAnalyser(String message)
	    {
	        if (message.contains("Sad"))
	            return "SAD";
	        else
	        return "HAPPY";
	    }
	 public static void main(String[] args) {
		MoodAnalyser mood = new MoodAnalyser ("Happy");
	    MoodAnalyser m = new MoodAnalyser("Sad");
	}
}

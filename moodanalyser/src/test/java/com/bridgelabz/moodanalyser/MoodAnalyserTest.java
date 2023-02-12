package com.bridgelabz.moodanalyser;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {
	@BeforeAll
	static void show_msg_before_all_test_case() {
		System.out.println("Welcome to Mood Analyzer Program");
	}

	@AfterAll
	public static void show_Msg_After_All_Test_Case() {
		System.out.println("All Test Case Completed");
	}

	@AfterEach
	void after_Each_Test_Case_Print_Msg() {
		System.out.println("Pass");
	}

	MoodAnalyser object;

	@BeforeEach
	public void setUp() {
		object = new MoodAnalyser();
	}

	@Test
	public void moodAnalyser() {
		String ans = object.moodAnalyser("I am in Sad Mood");
		Assertions.assertEquals("SAD", ans);
		System.out.println(ans);
	}
	  @Test
	    public void moodAnalyser1() {
	        String ans1 = object.moodAnalyser("I am in Happy Mood");
	        Assertions.assertEquals("SAD", ans1);
	        System.out.println(ans1);
	    }
}
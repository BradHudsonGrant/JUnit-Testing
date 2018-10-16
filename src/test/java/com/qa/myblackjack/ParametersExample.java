package com.qa.myblackjack;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ParametersExample {
	BlackJack b = new BlackJack();
	@Parameters
	public static Collection<Object[]> data(){
		return Arrays.asList( new Object[][] {{0,-10,-10},{0,10,-10},{0, -10, 30}, {0,-10,50}});
	}
	
	private int exPected;
	private int inPut1;
	private int inPut2;
	
	public ParametersExample(int expected, int input1, int input2) {
		exPected = expected;
		inPut1 = input1;
		inPut2 = input2;
		
	}
	
	@Test
	public void test() {
		assertEquals(exPected, b.play(inPut1, inPut2));
	}
	
	
	
}

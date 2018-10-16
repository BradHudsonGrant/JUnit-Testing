package com.qa.myblackjack;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ValidTest {
	BlackJack b = new BlackJack();
	@Test
	public void test16() {
		assertEquals("Dealer Wins", 11, b.play(10, 11));
	}
	@Test
	public void test17() {
		assertEquals("Player Wins", 11, b.play(11, 10));
	}	
}

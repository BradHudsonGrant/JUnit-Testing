package com.qa.myblackjack;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BustTest {
	BlackJack b = new BlackJack();
	@Test
	public void test6() {
		assertEquals("Dealer Bust", 10, b.play(10, 30));
	}
	@Test
	public void test9() {
		assertEquals("Player Bust", 10, b.play(30, 10));
	}
	@Test
	public void test10() {
		assertEquals("Both Bust", 0, b.play(30, 30));
	}
}

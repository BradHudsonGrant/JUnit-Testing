package com.qa.myblackjack;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class InvalidTest {
	BlackJack b = new BlackJack();
	
	@Test
	public void test() {
		assertEquals("2 low invalid entries" ,0, b.play(-10,-10));
	}
	@Test
	public void test2() {
		assertEquals("1 low invalid entries", 0, b.play(10, -10));
	}
	public void test3() {
		assertEquals("1 low invalid entries", 0, b.play(-10, 30));
	}
	@Test
	public void test4() {
		assertEquals("1 low invalid 1 high invalid entries", 0, b.play(-10, 50));
	}
	
	@Test
	public void test5() {
		assertEquals("1 low invalid entries", 0, b.play(-10, 10));
	}
	@Test
	public void test7() {
		assertEquals("Dealer Invalid", 0, b.play(50,  10));
	}
	@Test
	public void test8() {
		assertEquals("Player Bust", 0, b.play(30,-10));
	}
	@Test
	public void test11() {
		assertEquals("1 Bust 1 high invalid", 0, b.play(30, 50));
	}
	@Test
	public void test12() {
		assertEquals("1 low invalid 1 high invalid entries", 0, b.play(50,-10));
	}
	public void test13() {
		assertEquals("1 Bust 1 high invalid", 0, b.play(50, 10));
	}
	@Test
	public void test14() {
		assertEquals("1 Bust 1 high invalid", 0, b.play(50, 30));
	}
	@Test
	public void test15() {
		assertEquals("2 high invalid entries", 0, b.play(50, 50));
	}
}

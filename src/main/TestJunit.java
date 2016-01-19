package main;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestJunit {

	
	@Test
	public void testAdd(){
		String str = "Junit is working fine";
		assertEquals("Junit is working fine",str);
	}
	
	@Test
	public void test2(){
		int i = 0;
		assertEquals(2,i);
	}
}

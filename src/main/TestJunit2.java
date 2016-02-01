package main;

import static org.junit.Assert.assertEquals;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

public class TestJunit2 {
	Logger log = LogManager.getLogger(TestJunit2.class);
	
	@Test
	public void testAdd(){
		String str = "Junit is working fine";
		assertEquals("Junit is working fine",str);
		log.trace("TestJunit2 - Test 1");
	}
	
	@Test
	public void test2(){
		int i = 2;
		assertEquals(2,i);
		log.trace("TestJunit2 - Test 1");
		}
}

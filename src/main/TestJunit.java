package main;

import static org.junit.Assert.assertEquals;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

public class TestJunit {
	Logger log = LogManager.getLogger(TestJunit.class);
	
	@Test
	public void testAdd(){
		String str = "Junit is working fine";
		assertEquals("Junit is working fine",str);
		log.trace("Test1");
	}
	
	@Test
	public void test2(){
		int i = 2;
		assertEquals(2,i);
		log.trace("Test2");
	}
}

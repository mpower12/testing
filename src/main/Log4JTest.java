package main;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4JTest {

	public static final Logger log = LogManager.getLogger(Log4JTest.class);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		log.trace("trace");
		log.debug("debug");
		log.error("error");
		log.info("info");
		log.warn("warn");
	}

}

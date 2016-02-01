package main;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
	private final static Logger log = LogManager.getLogger(TestRunner.class);
	
	public static void main(String[] args){
		Result result = JUnitCore.runClasses(JunitTestSuite.class);
		for(Failure failure: result.getFailures()){
			log.trace(failure.toString());
		}
		log.trace(result.wasSuccessful());
	}
}

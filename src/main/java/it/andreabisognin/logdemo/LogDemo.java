package it.andreabisognin.logdemo;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Level;

public class LogDemo {
	private static final Logger logger =  LoggerFactory.getLogger(LogDemo.class);
	private static ch.qos.logback.classic.Logger peakyLogger = (ch.qos.logback.classic.Logger) LoggerFactory.getLogger("peaky"); 
	private static final Logger someLogger = LoggerFactory.getLogger("someLogger");
	
	public static void main(String[] args) {
		peakyLogger.setLevel(Level.INFO);
		logger.debug("Some random debug info");
        logger.info("Example log from {}", LogDemo.class.getSimpleName());
        peakyLogger.debug("some debug info");
        peakyLogger.info("some actual info");
        someLogger.debug("hi frome me");
        logger.error("Some error occured");
    }

}

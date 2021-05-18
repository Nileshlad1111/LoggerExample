package com.office.loggerpratices;

import org.apache.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
	static Logger logger = Logger.getLogger(App.class);

public static void main(String[] args) {

	
	logger.debug("debug message");
	logger.info("info message");
	logger.warn("info message");
	logger.error("erro message");
	logger.fatal("fatal message"); 
}
}

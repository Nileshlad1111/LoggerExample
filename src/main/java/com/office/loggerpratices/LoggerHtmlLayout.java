package com.office.loggerpratices;

import java.io.IOException;

import org.apache.log4j.Logger;

public class LoggerHtmlLayout {
	static Logger logger = Logger.getLogger(LoggerHtmlLayout.class.getName());
	 public static void main(String[] args)throws IOException{
		 logger.debug("debug message");
			logger.info("info message");
			logger.warn("info message");
			logger.error("erro message");
			logger.fatal("fatal message"); 
	   }
}




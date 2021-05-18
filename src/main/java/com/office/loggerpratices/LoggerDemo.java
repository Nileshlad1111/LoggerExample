package com.office.loggerpratices;

import java.io.IOException;

import org.apache.log4j.Appender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;



public class LoggerDemo {
	static Logger logger = Logger.getLogger(LoggerDemo.class);
	public static void main(String[] args) throws IOException {
		
	//	Layout layout = new SimpleLayout();
		//Layout layout = new HTMLLayout();
		Layout layout = new PatternLayout("%d %c %M %m %n");
		//Appender appender = new ConsoleAppender(layout);
		try {
		Appender appender = new FileAppender(layout,"log1j.log");
		logger.addAppender(appender);
		logger.debug("debug message");
		logger.info("info message");
		logger.warn("info message");
		logger.error("erro message");
		logger.fatal("fatal message"); 
		demo1();
		demo2();
		demo3();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void  demo1() {
		logger.debug("debug message");
		logger.info("info message");
		
	}

	public static void  demo2() {
		logger.debug("debug message");
		logger.info("info message");
		
	}
	
	public static void  demo3() {
		logger.debug("debug message");
		logger.info("info message");
		
	}
}




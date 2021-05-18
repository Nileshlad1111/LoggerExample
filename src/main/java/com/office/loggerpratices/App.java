package com.office.loggerpratices;

import org.apache.log4j.Appender;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;

/**
 * Hello world!
 *
 */
public class App 
{
	static Logger logger = Logger.getLogger(App.class);
    public static void main( String[] args )
    {
    	Layout layout=new SimpleLayout();
        Appender appender=new ConsoleAppender(layout);
        
    }
}

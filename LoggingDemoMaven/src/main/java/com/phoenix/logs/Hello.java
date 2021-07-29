package com.phoenix.logs;


import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
/*
 * @author md.faisal
 * @version 1.0
 * @creation date 28-jul-2021
 */

public class Hello {

	private static final Logger LOGGER = LogManager.getLogger();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//special methods
		LOGGER.info("This is info message");
		LOGGER.debug("This is debug message");
		LOGGER.warn("This is warning message");
		LOGGER.error("This is error message");
		
		//Generic method
		LOGGER.log(Level.TRACE, "This is trace message");
		
	
	}

}

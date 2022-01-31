package com.logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

public class LoggerClass {
	
	static Logger logger=(Logger) LogManager.getLogger();
	
	public static void printDebug(String msg) {
		logger.debug(msg);
	}
	
	public static void printInfo(String msg) {
		logger.info(msg);
	}
	
	public static void printWarn(String msg) {
		logger.warn(msg);
	}
	
	public static void printError(String msg) {
		logger.error(msg);
	}
	

}

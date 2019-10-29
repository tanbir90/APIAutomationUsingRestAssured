package com.qa.base;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.BeforeClass;


public class APIBase {
	
	protected static RequestSpecification httpRequest;
	protected static Response response;
	public Logger logger;
	
	@BeforeClass
	public void setUp() {
		logger = Logger.getLogger("ResTAPITest");
		PropertyConfigurator.configure("Log4j.properties"); //added logger
		logger.setLevel(Level.DEBUG);
	}

}

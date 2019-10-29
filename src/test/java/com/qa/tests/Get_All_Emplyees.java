package com.qa.tests;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.base.APIBase;

import io.restassured.RestAssured;
import io.restassured.http.Method;

public class Get_All_Emplyees extends APIBase{
	
	@BeforeClass
	void getAllEmployees() {
		logger.info("Get_All_Emplyees Test Started");
		RestAssured.baseURI="http://dummy.restapiexample.com/api/v1";
		httpRequest=RestAssured.given();
		response=httpRequest.request(Method.GET, "/employees");
	}
	
	@Test
	void checkResponseBody() {
		logger.info("starting test checkResponseBody");
		String responseBody = response.getBody().asString();
		logger.info("response body is : " +responseBody);
		Assert.assertTrue(responseBody!=null);
	}
	

}

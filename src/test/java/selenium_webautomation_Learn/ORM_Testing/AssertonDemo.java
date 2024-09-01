package selenium_webautomation_Learn.ORM_Testing;
/*
 *Assertion-validations points
 *
 * we can make test method pass or fail
 * Assert class
 * Methods
 * Assert.equa
 * 1. Hard Assertion
 * 2.Soft Assertion
 * 
 * 
 * 
 * 
 * 
 * 
 */

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertonDemo {
    @Test
	void testTitle() {
    
    	String expected="ho";
    	String Actual="h";
    	Assert.assertEquals(expected	, Actual);
    }
    @Test
    void testSoftassertion() {
        
    	
    	String expected="ho";
    	String Actual="h";
    	SoftAssert assertObj=new SoftAssert();
    	assertObj.assertEquals(expected	, Actual);
    	System.out.println("next statement is ex");
    	assertObj.assertAll();
    }
}

package selenium_webautomation_Learn.ORM_Testing;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGAnnotationExample {
    @BeforeMethod
	void login() {
		System.out.println("login ------------");
	}
	@Test
	void search() {
		System.out.println("search  ------------");
	}
//	Test methods are only actual test methods
	@Test
	void advsearch() {
		System.out.println("advance search------------");
	}
	@AfterMethod
	void logout() {
		System.out.println("log out ------------");
	}

}

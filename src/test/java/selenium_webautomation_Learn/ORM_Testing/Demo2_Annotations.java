package selenium_webautomation_Learn.ORM_Testing;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo2_Annotations {

	 @BeforeClass
		void login() {
			System.out.println("login  class  only once execute the Test method is excuted------------");
		}
	 @AfterClass
		void logout() {
			System.out.println("log out ------------");
		}

		@Test
		void search() {
			System.out.println("search  ------------");
		}
//		Test methods are only actual test methods
		@Test
		void advsearch() {
			System.out.println("advance search------------");
		}
		}

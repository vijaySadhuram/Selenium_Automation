package selenium_webautomation_Learn.ORM_Testing;

import org.testng.annotations.Test;

public class dependencyMethods {
	@Test
	void openApp() {
		
	}
	
	@Test(priority=2,dependsOnMethods= {"openApp"})
	void login() {
		
	}
	@Test(priority=2,dependsOnMethods= {"login"})
	void search() {
		
	}
	@Test(priority=2,dependsOnMethods= {"login","search"})
	void advSearch() {
		
	}
	@Test(priority=2,dependsOnMethods= {"openApp"})
	void logout() {
		
	}

}

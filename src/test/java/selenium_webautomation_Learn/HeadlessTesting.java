package selenium_webautomation_Learn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class HeadlessTesting {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--headless=new");
		//setting for headless mode of executions
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		String act_title=driver.getTitle();
		if(act_title.equals("New Tab")) {
			System.out.println("Test case is passed");
		}
	
		else {
			System.out.println("not passed");
		}
       driver.quit();
	}

}

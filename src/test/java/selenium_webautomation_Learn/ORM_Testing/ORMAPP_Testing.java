package selenium_webautomation_Learn.ORM_Testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
/* 
 Excute the test case using testing xml file
 we can execute the multiple testcase in one time
 generate the report
 *
 *
 *
 *
 *
 *using the xml
 *genertate automatcaly
 *or manually
 */



public class ORMAPP_Testing {
	WebDriver driver;
    @Test(priority=1)
    void appLaunch()
    {
    
    try {
    driver=new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    driver.manage().window().maximize();
    }
    catch(Exception e) {
    	System.out.println("Exception is under the app launch");
    }
    }
    @Test(priority=2)
    void testLogo() {
    	try {
    	boolean imgLogoStatus=driver.findElement(By.xpath(" //img[@alt='company-branding']")).isDisplayed();
    	if(imgLogoStatus) {
    	System.out.println("Logo is Displayed....");	
    	}
    	else {
    		System.out.println("log is not displayed..");
    	}
    	}
    	catch(Exception e) {
    		System.out.println("exception is catch under logo method");
    	}
       
    }
    @Test(priority=3)
    void loginApp() {
    	WebElement username=driver.findElement(By.xpath("//input[@name='username']"));
    	username.sendKeys("Admin");
    	WebElement pwd=driver.findElement(By.xpath("//input[@name='password']"));
    	pwd.sendKeys("admin123");
    	driver.findElement(By.xpath("//button[@type='submit']"));
    	
    }
    @Test(priority=4)
    void logOut() {
    	driver.quit();
    	
    }
}

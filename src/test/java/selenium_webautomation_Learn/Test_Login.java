package selenium_webautomation_Learn;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Login {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver(); 
	            // Navigate to a webpage
	    driver.get("https://www.geeksforgeeks.org/batch/Amazon-Test-Series");
	    driver.manage().window().maximize();
	    
	  //div[@class='footer_footerContainerBranding__utQ2f']
	    
//	    take full screenshot
	    TakesScreenshot  ts=(TakesScreenshot)driver;
	    File sourcfile=ts.getScreenshotAs(OutputType.FILE);
	    File targetfile=new File(System.getProperty("user.dir")+"\\screenshots\\fullpage.png");
//	    copy source file to target location-->it will store
	    sourcfile.renameTo(targetfile);
//	    driver.quit();
	            
// Cast WebDriver to TakesScreenshot
//	specific area of page
//	   2) 
	   WebElement bottompage=driver.findElement(By.xpath("//div[@class='footer_footerContainerBranding__utQ2f']"));
	   File bottomimage=bottompage.getScreenshotAs(OutputType.FILE);
	   File targetfile1=new File(System.getProperty("user.dir")+"\\screenshots\\bottompage.png");
	   bottomimage.renameTo(targetfile1);
	   
	   
//	   3) Capture specific webelement of the page
	 WebElement gfglog=driver.findElement(By.xpath("//div[@class='logo']"));
	 File file_logo=gfglog.getScreenshotAs(OutputType.FILE);
	 File target =new File(System.getProperty("user.dir")+"\\\\screenshots\\\\gfglogo.png");
	 file_logo.renameTo(target);
	   
	   
	 
	 
//	 ChromeOptions
//	 -------
//	 headless testing  we seeing entire action on the webpage 
//	 we only get get results
	 
	 

	         

	}

}

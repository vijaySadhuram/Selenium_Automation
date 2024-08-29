package selenium_webautomation_Learn;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Broken_Links {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		List<WebElement> el=driver.findElements(By.tagName("a"));
		for(WebElement e:el)
		{
			System.out.println(e.getAttribute("href"));
		}
		

	}

}

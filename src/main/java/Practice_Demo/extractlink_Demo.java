package Practice_Demo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class extractlink_Demo {
	
	@Test
	
	public void extractdemo() {
		
		System.setProperty("webdriver.chrome.driver", "\\C:\\Driver\\chromedriver.exe\\");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://github.com/cbeust/testng-eclipse/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		List<WebElement> AllLink =driver.findElements(By.tagName("a"));
		
		
		for (int i =0; i<AllLink.size();i++) {
			
			System.out.println("List   :" +AllLink);
			
			
		}
		
		driver.close();
	}

}

package test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;

@RunWith(SerenityRunner.class)
public class MyFirstTestCase {
	
	@Managed
	WebDriver driver;
	
	@Test
	public void MyGoogleSearch() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\AutomationEDThrash\\Java - SerenityBDD\\JavaSerenityTest\\src\\main\\resources\\drivers\\windows\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("http://www-google.com");
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("q")).sendKeys("automation testing");
		
		driver.close();
	}

}

package TestingPurposes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestingPurpose {
	
	@Test
	public void webServe() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-chrome-driver/4.41.0");
		Thread.sleep(1000);
		driver.quit();
		System.out.println("success===================");

		
	}

}

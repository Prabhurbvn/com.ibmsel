package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyFirstMaven {
	
	WebDriver driver;
	
	@Test
	public void verifyGoogle() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("http://www.google.com");
		Assert.assertEquals(driver.getTitle(), "Google");
		Thread.sleep(3000);
		driver.close();
	}

}

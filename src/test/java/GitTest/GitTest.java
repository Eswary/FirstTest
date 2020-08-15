package GitTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GitTest {

	@Test
	public void login()
	{
		WebDriver wd = new FirefoxDriver();
		wd.get("https://www.google.com");
		wd.getTitle();
		wd.findElement(By.name("q")).sendKeys("Chennai");
		wd.findElement(By.name("q")).submit();
	}
	
	
}

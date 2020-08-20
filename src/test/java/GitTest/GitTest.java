package GitTest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GitTest {

	@Test
	public void login() throws IOException
	{
		WebDriver wd = new FirefoxDriver();
		wd.get("https://www.google.com");
		wd.getTitle();
		wd.findElement(By.name("q")).sendKeys("Chennai");
		wd.findElement(By.name("q")).submit();
		System.out.println(wd.getTitle());
		File src = ((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File ("C:\\Users\\eshra\\workspace\\A14_GitTest_Sample\\screen\\screen.jpg"));
		
	}
	
	
}

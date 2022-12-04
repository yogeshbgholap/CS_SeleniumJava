package git_Practice_Pkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Practice_One {

		@Test(description="Open Chrome Browser",priority=2)
		public void  Chrome() {
			System.setProperty("webdriver.chrome.driver","F:\\java selenium\\driver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.google.co.in/");

		}

		@ Test(description="Open Firefox Browser")
		public void fireFox() {
			System.setProperty("webdriver.gecko.driver","F:\\java selenium\\driver\\geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			driver.get("https://www.google.co.in/");
			driver.getTitle();)

	}

}
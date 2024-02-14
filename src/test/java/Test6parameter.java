import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test6parameter {
	WebDriver driver;

	@Test
	@Parameters("Browser")

	public  void browseron(String Browser) {

		if(Browser.equalsIgnoreCase("Chrome")) {
			System.out.println("chrome");
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();

		}
		else if(Browser.equalsIgnoreCase("Firefox")) {
			System.out.println("firefox");
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();

		}

	}

	@Test(priority=1)
	void logotest(){
	WebElement logo=driver.findElement(By.xpath("//h1[text()='Log in']"));
	Assert.assertTrue(logo.isDisplayed());
	}


	@Test(priority=2)
	public void titletest() {

String title=driver.getTitle();
Assert.assertEquals("Log in  W3Schools", title); //expected and actual title of page given below the failed line in console.
	}




}

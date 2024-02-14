import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test44RealExample2 {
	WebDriver driver;
	@BeforeClass
	@Parameters("browser")

	public  void browseron(String browser){
		if(browser.equalsIgnoreCase("chrome")) {
		System.out.println("chrome");

		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();

		driver.get("https://profile.w3schools.com/log-in?redirect_url=https%3A%2F%2Fmy-learning.w3schools.com");
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			System.out.println("firefox");
			WebDriverManager.firefoxdriver().setup();
			 driver=new FirefoxDriver();

			driver.get("https://profile.w3schools.com/log-in?redirect_url=https%3A%2F%2Fmy-learning.w3schools.com");
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
System.out.println("java");
	}

	@BeforeClass()
	public  void browseroff() {
		System.out.println("browser close");
driver.close();
			}

}

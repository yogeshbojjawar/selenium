import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class Test4RealExample {
	WebDriver driver;
	@BeforeMethod
	public  void browseron() throws IOException, InterruptedException {
		System.out.println("browser open");

		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();

		driver.get("https://profile.w3schools.com/log-in?redirect_url=https%3A%2F%2Fmy-learning.w3schools.com");

		driver.manage().window().maximize();
		Date d=new Date();
		System.out.println(d);
		String k=RandomString.make(3);
		File myfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dstn=new File("C:\\Users\\Yogesh\\eclipse-workspace\\myproject\\shots"+ d+k +".png");
		FileHandler.copy(myfile, dstn);
		System.out.println("ss successfully captured");

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

//Assert.assertTrue(title.contains("Log in  W3Schools"));

    System.out.println("java");
	}

	@AfterMethod()
	public  void browseroff() {
		System.out.println("browser close");
		driver.close();
			}

}

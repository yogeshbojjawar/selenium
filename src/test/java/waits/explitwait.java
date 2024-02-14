package waits;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class explitwait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();

		driver.get("https://www.google.com/");
		driver.manage().window().maximize();


		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("selenium");
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys(Keys.RETURN);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h3[text()='Selenium']")).click();

		//WebDriverWait mywait=new WebDriverWait(driver,10);

	//WebElement element= mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text()='Selenium']")));
   WebElement search=driver.findElement(By.xpath("//input[@type='search']"));
   search.click();
   waitforpresent(driver,10,search,"driver");




	}
	public static  void waitforpresent(WebDriver driver, int time, WebElement element, String value) {
		WebDriverWait mywait=new WebDriverWait(driver,10);
		mywait.until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);
	}

}

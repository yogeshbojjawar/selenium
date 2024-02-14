import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scroll9Amazontestcase {
	WebDriver driver;

	@BeforeMethod
	public void amazonopen() {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	}

@Test
public void searchbox() throws InterruptedException {
driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("tablet");
driver.findElement(By.xpath("//input[@type='submit']")).click();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

JavascriptExecutor jse=(JavascriptExecutor)driver;           //code for scroll down
//jse.executeScript("window.scrollBy(0,5000)", "");
//jse.executeScript("window.scrollBy(0,-5000)", "");

WebElement element=driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[2]"));
element.click();

Set<String> handle=driver.getWindowHandles();
Iterator<String>it=handle.iterator();
String parentwindow=it.next();
String childwindow=it.next();
driver.switchTo().window(childwindow);

WebElement addbtn=driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
jse.executeScript("arguments[0].scrollIntoView();",addbtn);
addbtn.click();
driver.findElement(By.xpath("//input[@class='a-button-input']")).click();

driver.findElement(By.xpath("//span[@class='nav-cart-icon nav-sprite']")).click();
WebElement addedproduct=driver.findElement(By.xpath("//*[@id=\"sc-item-Cf3f9140d-b443-4da2-a493-ddc240f60dda\"]/div[4]/div/div[1]/div/div/div[2]/ul/li[1]/span/a/span[1]/span/span[2]"));
boolean seen=addedproduct.isDisplayed();
if(seen) {
	System.out.println("product is added successful;y");
}
else {
	System.out.println("nothing added in cart");
}
//WebElement quantity=driver.findElement(By.xpath("//p[text()='2+32 GB']"));
//Select sel=new Select(quantity);
//sel.selectByValue("2");





driver.close();


}














}

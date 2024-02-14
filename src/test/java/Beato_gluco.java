import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Beato_gluco {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();

		driver.get("http://dev.backend.beatoapp.com/offers/glucolp_3");
		driver.manage().window().maximize();
		//input[@type="text"]
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("yogesh bojjawar");
		driver.findElement(By.xpath("//input[@type=\"number\"]")).sendKeys("8149593940");
		driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("yogesh.bojjawar@beatoapp.com");

		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();

		driver.findElement(By.xpath("//button[@onclick=\"goToCheckout()\"]")).click();
		Thread.sleep(3000);


		driver.findElement(By.xpath("//input[@name=\"line1\"]")).sendKeys("32,Whitehouse");

		driver.findElement(By.xpath("//input[@name=\"line2\"]")).sendKeys("SBH colony, Indira nagar");
		driver.findElement(By.xpath("//input[@name=\"line3\"]")).sendKeys("Near water tank");
		driver.findElement(By.xpath("//input[@name=\"pincode\"]")).sendKeys("431001");
		Thread.sleep(5000);


		driver.findElement(By.xpath("//button[@onclick=\"paynow()\"]")).click();
		Thread.sleep(3000);






		JavascriptExecutor js=(JavascriptExecutor)driver;
	//	js.executeScript("arguments[0].click()", wallet);
	//	js.executeScript("window.scrollBy(0,250)","");

		WebElement paynow= driver.findElement(By.xpath("//button[text()='PAY NOW']"));
		js.executeScript("arguments[0].scrollIntoView()",paynow);
		paynow.click();


		WebElement frame=driver.findElement(By.xpath("//iframe[@class=\"razorpay-checkout-frame\"]"));
		driver.switchTo().frame(frame);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Pay ₹ 674']")).click();



		//driver.findElement(By.xpath("placeholder=\"Enter your UPI ID\"")).click();
//	WebElement upiid=	driver.findElement(By.xpath("placeholder=\"Enter your UPI ID\""));
//
//
//		js.executeScript("arguments[0].value='success@razorpay'",upiid);

		driver.findElement(By.xpath("//input[@placeholder=\"Enter your UPI ID\"]")).sendKeys("success@razorpay");

		//driver.findElement(By.xpath("//span[text()='Mobikwik']")).click();

		driver.findElement(By.xpath("//span[text()='Pay ₹ 674']")).click();

driver.getTitle();
System.out.println(driver.getTitle());

if(driver.getTitle().equalsIgnoreCase("Claim Free Glucometer")) {
	System.out.println("ORDER SUCCESSFULL");
}

		driver.close();










}
}

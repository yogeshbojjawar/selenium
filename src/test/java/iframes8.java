import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class iframes8 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[2]/div[1]/div/div[3]/div[1]/div/div")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class=\"LandbotProactive__frame__content\"]")));

		driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[2]/div[1]/div/div[2]/a[8]/div/div")).click();

     // and if we need to move from one frame to another, need to go to the main page and then we can proceed for second frame

//driver.switchTo().defaultContent();   // go back to the main page
		
		// and if we need to take action on inner frame then we need to go first outer frame and switch to inner frame
		// driver.switchTo().parentFrame();  //go back to parent frame or outer frame




	}
}

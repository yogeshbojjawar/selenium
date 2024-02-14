import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParalllelTesting {


	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yogesh\\Downloads\\seleniumPractice\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		co.setBinary("C:\\Users\\Yogesh\\Downloads\\chrome-win64\\chrome-win64//chrome.exe");
		//WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver(co);
		driver.get("https://www.spicejet.com/");


	}

	@Test
	public void setup2() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yogesh\\Downloads\\seleniumPractice\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		co.setBinary("C:\\Users\\Yogesh\\Downloads\\chrome-win64\\chrome-win64//chrome.exe");
		//WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver(co);
		driver.get("https://www.amazon.in/");

	}







}

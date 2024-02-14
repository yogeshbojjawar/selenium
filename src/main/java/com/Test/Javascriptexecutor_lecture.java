package com.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Javascriptexecutor_lecture {
	//drawing border
//	public static void drawborder(WebElement element, WebDriver driver) {
//		JavascriptExecutor js=((JavascriptExecutor)driver);
//
//		js.executeScript("arguments[0].style.border='3px solid red'", element);
//
//	}
//	 	public static  String gettitlebyjs(WebDriver driver) {
//		JavascriptExecutor js=((JavascriptExecutor)driver);
//		String title= js.executeScript("return document.title;").toString();
//		return title;
//	}

	public static void main(String[] args) throws InterruptedException {

	WebDriverManager.firefoxdriver().setup();
	WebDriver driver= new FirefoxDriver();

		driver.get("https://profile.w3schools.com/log-in?redirect_url=https%3A%2F%2Fmy-learning.w3schools.com");

driver.manage().window().maximize();
WebElement w3school=driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/a"));

JavascriptExecutor js=((JavascriptExecutor)driver);

//**********//
js.executeScript("arguments[0].style.border='3px solid red'", w3school);   // **********draw the border

//drawborder(w3school, driver); //draw the border

//**************//
//String title1=gettitlebyjs(driver);
//System.out.println(title1);
System.out.println(js.executeScript("return document.title;").toString());   //*******get the title of page

//**********//
String msg="baap ko mat sikha";
System.out.println(js.executeScript("alert('" + msg + "')"));  //*****generate the alert msg
            Alert alert=driver.switchTo().alert();
            alert.accept();

//*********//
Thread.sleep(5000);

WebElement email=driver.findElement(By.id("modalusername"));
js.executeAsyncScript("arguments[0].value='yogesh@gmail.com'", email);  //*******sendkeys the email credentials
//js.executeScript("arguments[0].value=arguments[1]", email,"yogesh@gmail.com");

//**********//


Thread.sleep(5000);
WebElement click=driver.findElement(By.xpath("//button[contains(@class,'_1VfsI _OD95i _3_H0V')]"));
js.executeScript("arguments[0].click()", click);   // **********click on the element

//***********//
js.executeScript("history.go(0)"); //********refresh the page





		driver.close();



	}

}

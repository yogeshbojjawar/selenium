package com.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PracticepagePom {

             WebDriver driver;

	@FindBy (how=How.XPATH,using="//button[text()='Open Window']")private WebElement openwindow;

   public  PracticepagePom(WebDriver driver) {
	    this.driver=driver;
}

public WebElement getOpenwindow() {
	return openwindow;
}

public void setOpenwindow(WebElement openwindow) {
	this.openwindow = openwindow;
}

















}

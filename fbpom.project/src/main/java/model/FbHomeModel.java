package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FbHomeModel extends FbBaseModel {
	public FbHomeModel (WebDriver c) {
		super(c);
	}
	public WebElement  getbutton() {
		WebElement a = Driver.findElement(By.xpath("//a[@ajaxify='/reg/spotlight/']"));
		return  a;
	}
	
}

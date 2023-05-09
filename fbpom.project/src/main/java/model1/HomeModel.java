package model1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HomeModel extends BaseModel {
	
public HomeModel (WebDriver e, WebDriver f,WebDriver l,WebDriver t) {
	super(e,f,l,t);
}
public WebElement  fname() {
	WebElement a = driver.findElement(By.xpath("//input[@name='firstname']"));
	return  a;
}
public WebElement  lname() {
	WebElement g = driver.findElement(By.xpath("//input[@name='lastname']"));
	return  g;
}
public WebElement  mobile() {
	WebElement m = driver.findElement(By.xpath("//input[@name='reg_email__']"));
	return  m;
}
public WebElement  birthmonth() {
WebElement drop = driver.findElement(By.xpath("//select[@name='birthday_month']"));
return drop;
}
}

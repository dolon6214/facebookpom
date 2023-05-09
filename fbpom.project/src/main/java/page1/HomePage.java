package page1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import model1.HomeModel;

public class HomePage extends HomeModel {
	public HomePage (WebDriver h,WebDriver i,WebDriver p,WebDriver q ) {
		super (h,i,p,q);

}
	public void cliconbutton() {
		WebElement j=	fname();
		j.sendKeys("dolon");
		
	
		WebElement k=	lname();
		k.sendKeys("rah");
		
		WebElement n=	mobile();
		n.sendKeys("2014568132");
		
		WebElement u=	birthmonth();
		Select sel = new Select(u);
		sel.selectByVisibleText("Aug");
		}
	
}
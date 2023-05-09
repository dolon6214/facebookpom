package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import model.FbHomeModel;

public class FbHomePage extends FbHomeModel{
	public FbHomePage (WebDriver f ) {
		super (f);
	}
	public void cliconbutton() {
	WebElement h=	getbutton();
	h.click();
	}
}

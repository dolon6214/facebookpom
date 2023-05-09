package model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class FbBaseModel {
	WebDriver Driver;
	public FbBaseModel (WebDriver d) {
		 Driver = d;
	}
}

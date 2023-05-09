package test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;


import page1.HomePage;

public class BaseTest1 {
	static WebDriver driver ;
	static WebDriver pass ;
	static WebDriver moba;
	static WebDriver month;
	static HomePage hp;
@BeforeSuite
public void setup() {
	System.setProperty("webdriver.chrome.driver","practice/chromedriver.exe");
	 driver = new ChromeDriver();
	driver.get("https://www.facebook.com/reg");
}
public  void  gethomepage() {
	hp = new HomePage(driver, pass,moba,month);

}
}


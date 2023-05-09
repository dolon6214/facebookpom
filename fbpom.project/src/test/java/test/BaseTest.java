package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

import page.CreatAccountPage;
import page.FbHomePage;

public class BaseTest {
	static WebDriver driver ;
	static FbHomePage hp;
	static CreatAccountPage ca;
@BeforeSuite
public void setup() {
	System.setProperty("webdriver.chrome.driver","practice/chromedriver.exe");
	 driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
}
public  void  gethomepage() {
	hp = new FbHomePage(driver);
}
public void getaccoutpage() {
	ca = new CreatAccountPage(driver);
	
}
}

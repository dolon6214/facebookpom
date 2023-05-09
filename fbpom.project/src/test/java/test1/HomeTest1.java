package test1;

import org.testng.annotations.Test;

public class HomeTest1 extends BaseTest1 {
	
	@Test
	public void homepagetest() {
		gethomepage();
		hp.cliconbutton();
	}

}

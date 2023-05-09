package test;

import org.testng.annotations.Test;

public class FbPagetest extends BaseTest {
	@Test
	public void homepagetest() {
		gethomepage();
		hp.cliconbutton();
	}

}

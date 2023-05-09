package test;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import lib.ExcelRead;



public class CreatAccountTeast extends BaseTest {
	@Test(dataProvider="find")
	public void creataccounttest(String s, String t, String u, String q, String v) throws InterruptedException  {
		gethomepage();
		hp.cliconbutton();
		getaccoutpage();
		ca.typefirstname(s);
		ca.typelaststname(t);
		ca.typemobilenumber(u);
		ca.typemonth(q);
		ca.selectgender(v);
	}
	@DataProvider(name="find")
	public Object[][] getdata() throws IOException{
	Object[][] t;
	String filename = "data/test.xlsx";
	String sheatname = "Sheet1";
	ExcelRead er  = new ExcelRead(filename, sheatname);
	t = er.excelToArray();
	return t;
	}
}

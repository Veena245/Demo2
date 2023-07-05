package runner_scripts;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generic_scripts.Base_Test;
import generic_scripts.DDT_generic;
import pom_scripts.Pom1;

public class Datap extends Base_Test
{
	@Test(dataProvider="testData")
	public void test1(String fn, String ln) throws InterruptedException
	{
		Pom1 p=new Pom1(driver);
		p.Un(DDT_generic.get_data("Sheet1", 1, 0));
		p.Pwd(DDT_generic.get_data("Sheet1", 2, 0));
		p.btn();
		Assert.fail();
		
		
	}
	//To provide the data through dataproviter
	@DataProvider(name = "testData")
	public Object[][] createData1() {
	 return new Object[][] {
	   { "Veena", "Reddygdtywh" },
	   { "vee@gmail.com", "Dggr4twtrgf"},
	 };
	}
	

}

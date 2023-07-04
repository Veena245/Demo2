package runner_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovi 
{
	@Test(dataProvider="testData1")
	public void test1(String fn, String ln) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys(fn);
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys(ln);
		
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("hfhgf");
		driver.findElement(By.xpath("//input[@id='userNumber']")).sendKeys("54654");
		Thread.sleep(1000);
		driver.close();
		
	}
	
	@DataProvider(name = "testData")
	public Object[][] createData1() {
	 return new Object[][] {
	   { "Veena", "Reddy" },
	   { "vee@gmail.com", "7865438"},
	 };
	}
	
	@DataProvider(name = "testData1")
	public Object[][] createData2() {
	 return new Object[][] {
	   { "Veena", "Reddy" },
	   { "vee@gmail.com", "7865438"},
	 };
	}


}

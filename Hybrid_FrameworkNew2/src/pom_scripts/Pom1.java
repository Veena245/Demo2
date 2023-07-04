package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic_scripts.BasePage;

public class Pom1 extends BasePage
{
	@FindBy(xpath="//input[@type='text']")
	private WebElement un;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement pwd;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement btn;
	
	public Pom1(WebDriver driver)
	{
		super(driver);
	}

	public void Un(String un1)
	{
		un.sendKeys(un1);
	}
	
	public void Pwd(String pwd1) 
	{
		pwd.sendKeys(pwd1);
	}
	
	public void btn()
	{
		btn.click();
	}

}

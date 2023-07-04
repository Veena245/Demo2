package form_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class POM_Form
{
	@FindBy(xpath="//input[@id='firstName']") 
	private WebElement fname;
	
	@FindBy(xpath="//input[@id='lastName']") 
	private WebElement lname;
	
	@FindBy(xpath="//input[@id='userEmail']") 
	private WebElement email;
	
	@FindBy(xpath="//label[.='Female']") //input[@value='Female']
	private WebElement rbtn;
	
	@FindBy(xpath="//input[@id='userNumber']")
	private WebElement mob;
	
	@FindBy(xpath="//input[@id='dateOfBirthInput']")
	private WebElement dob;
	
		
//	@FindBy(xpath="//select[@class='react-datepicker__month-select']")
//	private WebElement month;
//	
//	
//	@FindBy(xpath="//select[@class='react-datepicker__year-select']")
//	private WebElement year;
//	Select s1=new Select(year);
	
	@FindBy(xpath="//div[.='24']")
	private WebElement date;
	
	
	@FindBy(xpath="//div[@id='subjectsContainer']")
	private WebElement sub;
	
	@FindBy(xpath="//label[.='Music']")
	private WebElement hobbies;

	@FindBy(xpath="//input[@id='uploadPicture']")
	private WebElement upic;
	
	@FindBy(xpath="//textarea[@id='currentAddress']")
	private WebElement tarea;
	
	public POM_Form(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void first()
	{
		fname.sendKeys("Veena");
	}
	
	public void last()
	{
		lname.sendKeys("Reddy");
	}
	
	public void eid()
	{
		email.sendKeys("veena@gmail.com");
	}
	
	public void radio()
	{
		rbtn.click();
	}
	
	public void mobile()
	{
		mob.sendKeys("8861195300");
	}
	
	public void dateOfBirth()
	{
		dob.click();
	}
	
//	public void monthDrop()
//	{
//		Select s=new Select(month);
//		s.selectByIndex(0);
//		//s1.selectByVisibleText("1993");
//		//date.click();
//	}
//	
//	public void yearDrop()
//	{
//		
//		s1.selectByVisibleText("1993");
//		//date.click();
//	}
	
	public void dateDrop()
	{
		date.click();
	}
	
	public void subject()
	{
		sub.sendKeys("BE CS");
	}
	
	public void hobbyCh()
	{
		hobbies.click();
	}
	
	public void uploadPic()
	{
		upic.sendKeys("D:\\New folder");
	}
	
	public void address()
	{
		tarea.sendKeys("hgdhgsdht sdhgsdhjg hgdhsgdhhdjsg");
	}
	
	
	
	
		
	

}

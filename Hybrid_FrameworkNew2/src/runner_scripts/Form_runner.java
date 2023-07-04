package runner_scripts;

import org.testng.annotations.Test;

import form_pom.POM_Form;
import generic_scripts.Base_Test;

public class Form_runner extends Base_Test
{
	@Test
	public void formLogin() throws InterruptedException 
	{
		POM_Form p=new POM_Form(driver);
		Thread.sleep(1000);
		p.first();
		Thread.sleep(1000);
		p.last();
		Thread.sleep(1000);
		p.eid();
		Thread.sleep(1000);
		p.radio();
		Thread.sleep(1000);
		p.mobile();
		Thread.sleep(1000);
		p.dateOfBirth();
//		Thread.sleep(1000);
//		p.monthDrop();
//		Thread.sleep(1000);
//		p.yearDrop();
		Thread.sleep(1000);
		p.dateDrop();
		//Thread.sleep(1000);
		//p.subject();
		Thread.sleep(1000);
		p.hobbyCh();
		Thread.sleep(1000);
		p.uploadPic();
		Thread.sleep(1000);
		p.address();
		Thread.sleep(1000);
	}

}

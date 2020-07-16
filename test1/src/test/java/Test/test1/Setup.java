package Test.test1;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.internal.thread.TestNGThread;



public class Setup extends base{
	public WebDriver driver;
	//public Read_data data;

	@BeforeTest
	public void initialize() throws IOException, InvalidFormatException
	{
		driver =initializeDriver();
		

	}
	
@Test
	
	public void basePageNavigation() throws IOException, InterruptedException, InvalidFormatException
	{
	Read_data data=new Read_data();
		//one is inheritance

		// creating object to that class and invoke methods of it
		driver.get(prop.getProperty("url"));
//		System.out.println("start");
		pagelanding l=new pagelanding(driver);
		l.signinclick().click();
		Thread.sleep(4000);
		registeration rl= new registeration(driver);
		rl.okclick().click();
		driver.switchTo().frame(0);
		rl.firstnameclick().sendKeys(data.data("Firstname"));
		rl.lastnameclick().sendKeys(data.data("Lastname"));
		rl.mailidclick().sendKeys(data.data("Email"));
		rl.pswclick().sendKeys(data.data("Password"));
		rl.newpswclick().sendKeys(data.data("Repassword"));
		rl.checkaclick().click();
		rl.checkbclick().click();
		rl.buttonclick().click();
		

		}

	@AfterTest
	public void teardown()
	{
		
		driver.close();
	
		
	}
	
	

	
	
}

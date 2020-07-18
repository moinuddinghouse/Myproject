package Test_test1;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.internal.thread.TestNGThread;

import Test_test1.Read_data;
import Test_test1.base;
import Test_test1.pagelanding;
import Test_test1.registeration;
import org.testng.Assert;
import org.testng.annotations.Listeners;		
import org.testng.annotations.Test;         


@Listeners(Test_test1.Listeners.class)
public class Setup extends base{
	
	public WebDriver driver;
	public Read_data data;
	public String Expectedres= "SAP Conversational AI | Automate Customer Service With AI Chatbots";

	@BeforeTest
	public void initialize() throws IOException, InvalidFormatException
	{
		driver =initializeDriver();
	}
	
@Test
	
	public void basePageNavigation() throws IOException, InterruptedException, InvalidFormatException
	{
	 data=new Read_data();
	 String expected = "SAP Conversational AI | Automate Customer Service With AI Chatbots";
		

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
		System.out.println(driver.getTitle());
		String Actualresult = driver.getTitle();
		Assert.assertEquals(Actualresult, expected);
		}

@Test

public void ZasePage() throws IOException, InterruptedException, InvalidFormatException
{
 data=new Read_data();
 String expected = "SAP Conversational AI | Automate Customer Service With AI Chatbots";
	

	// creating object to that class and invoke methods of it
	driver.get(prop.getProperty("url"));
//	System.out.println("start");
	pagelanding l=new pagelanding(driver);
	l.signinclick().click();
	Thread.sleep(4000);
	registeration rl= new registeration(driver);
	//rl.okclick().click();
	driver.switchTo().frame(0);
	rl.firstnameclick().sendKeys(data.data("Firstname"));
	rl.lastnameclick().sendKeys(data.data("Lastname"));
	rl.mailidclick().sendKeys(data.data("Email"));
	rl.checkaclick().click();
	rl.checkbclick().click();
	rl.buttonclick().click();
	System.out.println(driver.getTitle());
	String Actualresult = driver.getTitle();
	Assert.assertEquals(Actualresult, expected);
	
	

	}

	@AfterTest
	public void teardown()
	{
		
		driver.close();
	
		
	}
	
	

	
	
}

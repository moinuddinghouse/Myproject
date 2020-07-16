package Test.test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class registeration {
	
	public WebDriver driver;
	
	By firstname=By.xpath("//*[@id='firstName']");
	By lastname=By.xpath("//*[@id='lastName']");
	By mailid=By.xpath("//*[@id='mail']");
	By psw=By.xpath("//*[@id='newPasswordInput']");
	By newpsw=By.xpath("//*[@id='retypeNewPasswordInput']");
	By checka=By.xpath("//*[@id='pdAccept']");
	By checkb=By.xpath("//*[@id='touAccept']");  
	By button=By.xpath("//*[@id='sapStoreRegisterFormSubmit']");
	By ok=By.xpath("//div[contains(text(),'OK')]");
	
	
	
	public registeration(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		
	}
	
	
	public WebElement okclick()
	{
		return driver.findElement(ok);
		
		}
	
	public WebElement firstnameclick()
	{
		return driver.findElement(firstname);
		
		}
	
	public WebElement lastnameclick()
	{
		return driver.findElement(lastname);
		
		}
	public WebElement mailidclick()
	{
		return driver.findElement(mailid);
		
		}
	public WebElement pswclick()
	{
		return driver.findElement(psw);
		
		}
	
	public WebElement newpswclick()
	{
		return driver.findElement(newpsw);
		
		}
	
	public WebElement checkaclick()
	{
		return driver.findElement(checka);
		
		}
	
	public WebElement checkbclick()
	{
		return driver.findElement(checkb);
		
		}
	
	public WebElement buttonclick()
	{
		return driver.findElement(button);
		
		}
	
}

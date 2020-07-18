package Test_test1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pagelanding {
	
	public WebDriver driver;
	
	By signin=By.xpath("//div[contains(text(),'Sign up')]");
	
	public pagelanding(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		
	}
	public WebElement signinclick()
	{
		return driver.findElement(signin);
		
		}
	
}

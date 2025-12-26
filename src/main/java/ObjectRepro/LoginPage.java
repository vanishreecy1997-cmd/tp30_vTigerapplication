package ObjectRepro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
   //declaration
	@FindBy(name="user_name")
	private WebElement usernameid;
	
	@FindBy(name="user_password")
	private WebElement passwordid;
	
	@FindBy(id="submitButton")
	private WebElement loginbtn;
	
	//Initialization
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	 //utilization

    public WebElement getUsernameid() 
   {
	 return usernameid;
   }

	public WebElement getPasswordid() 
   {
     return passwordid;
   }

	public WebElement getLoginbtn() 
   {
     return loginbtn;
   }
	
	//business logic
	
	public void loginToApplication(String user,String pass)
	{
		usernameid.sendKeys(user);
		passwordid.sendKeys(pass);
		loginbtn.click();
	}
	
}

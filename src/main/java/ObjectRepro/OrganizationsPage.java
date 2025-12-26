package ObjectRepro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationsPage 
{
    //declaration
	@FindBy(xpath = "//img[@title='Create Organization...']")
	private WebElement creteorglookup;
	
	//initilization
	public OrganizationsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//utilization
	public WebElement getCreteorglookup() 
	{
		return creteorglookup;
	}
	
	//business logic
	public void creteOrganizationslookup()
	{
		creteorglookup.click();
	}
	
	
}

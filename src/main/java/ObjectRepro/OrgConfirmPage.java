package ObjectRepro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrgConfirmPage 
{
    //declaration
	@FindBy(xpath = "//span[@class='dvHeaderText']")
	private WebElement orgconfirm;
	
	//Initialization
	public OrgConfirmPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
    //utilization
	public WebElement getOrgconfirm() 
	{
		return orgconfirm;
	}

}

package ObjectRepro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericUtility.WebDriverutils;

public class HomePage extends WebDriverutils
{
	
   //declaration
	@FindBy(linkText = "Organizations")
	private WebElement orglink;
	
	@FindBy(linkText = "Contacts")
	private WebElement conlink;
	
	@FindBy(linkText = "Products")
	private WebElement prolink;
	
	@FindBy(linkText = "Trouble Tickets")
	private WebElement trotctkslink;
	
	@FindBy(linkText = "More")
	private WebElement morelink;
	
	@FindBy(linkText = "Projects")
	private WebElement projlink;
	
	@FindBy(linkText = "Price Books")
	private WebElement pricelink;
	
	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	private WebElement adminlink;
	
	@FindBy(xpath = "//a[@href='index.php?module=Users&action=Logout']")
	private WebElement signOutLink;
	
	//initialization
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//utilization

	public WebElement getOrglink() 
	{
		return orglink;
	}

	public WebElement getConlink() 
	{
		return conlink;
	}

	public WebElement getProlink() {
		return prolink;
	}

	public WebElement getTrotctkslink() 
	{
		return trotctkslink;
	}

	public WebElement getMorelink()
	{
		return morelink;
	}

	public WebElement getProjlink() 
	{
		return projlink;
	}

	public WebElement getPricelink() 
	{
		return pricelink;
	}

	public WebElement getAdminlink() 
	{
		return adminlink;
	}

	public WebElement getSignlink() 
	{
		return signOutLink;
	}
	 
	//business logic
	public void clickOnOrganizationsLink()
	{
		orglink.click();
	}
	public void clickOnContactsLink()
	{
		conlink.click();
	}
	public void clickOnProductsLink()
	{
		prolink.click();
	}
	public void clickOnTroubleTicketsLink()
	{
		trotctkslink.click();
	}
	public void clickOnMoreLink()
	{
		morelink.click();
	}
	public void clickOnProjectsLink()
	{
		projlink.click();
	}
	public void clickOnPriceBooksLink()
	{
		pricelink.click();
	}
	public void clickOnAdministratorLink()
	{
		adminlink.click();
	}
	public void clickOnSignOutLink()
	{
		signOutLink.click();
	}
	public void signOutOfApplication(WebDriver driver)
	{
		mouseHover(driver, adminlink);
		signOutLink.click();
		
	}
}
	
	
	


package GenericUtility;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverutils 
{
	/**
	 * This method is used to maximize the window
	 * @author vanishree
	 * @param driver
	 */
public void maximizeWindow(WebDriver driver)
{
	driver.manage().window().maximize();
}
/**
 * This method is used to wait for page load
 * @author vanishree
 * @param driver
 * @param seconds
 */
public void waitForPageLoad(WebDriver driver, int seconds)
{
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}
/**
 * This method is used to wait until element to be visible
 * @author vanishree
 * @param driver
 * @param seconds
 * @param element
 */
public void waituntileletobevisible(WebDriver driver, int seconds,WebElement element)
{
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
	wait.until(ExpectedConditions.elementToBeClickable(element));
}
/**
 * This method is used to select the dropdown
 * @author vanishree
 * @param element
 * @return
 */
public Select DropDown(WebElement element)
{
	Select sel = new Select(element);
	return sel;
}
/**
 * This method is used to select dropdowns using value
 * @author vanishree
 * @param element
 * @param value
 */
public void dropdownsUsingValue(WebElement element, String value)
{
	DropDown(element).selectByValue(value);
}
/**
 * This method is used to select dropdowns using index
 * @author vanishree
 * @param element
 * @param index
 */
public void dropdownsUsingIndex(WebElement element, int index)
{
	DropDown(element).selectByIndex(index);
}
/**
 * This method is used to select dropdowns using visible text
 * @author vanishree
 * @param element
 * @param text
 */
public void dropdownsusingVisibleText(WebElement element, String text)
{
	DropDown(element).selectByVisibleText(text);
}
/**
 * This method is used to perform actions
 * @author vanishree
 * @param driver
 * @return
 */
public Actions actions(WebDriver driver)
{
	Actions act = new Actions(driver);
	return act;
}
/**
 * This method is used to perform mouseHover actions
 * @author vanishree
 * @param driver
 * @param element
 */
public void mouseHover(WebDriver driver,WebElement element)
{
	actions(driver).moveToElement(element).perform();
}
/**
 * This method is used to perform mouseHover and click on element action
 * @author vanishree
 * @param driver
 * @param element
 */
public void mouseHoverAndClickonElement(WebDriver driver,WebElement element)
{
	actions(driver).moveToElement(element).click(element).perform();
}
/**
 * This method is used to perform draganddrop actions
 * @author vanishree
 * @param driver
 * @param element
 */
public void draganddrop(WebDriver driver,WebElement src,WebElement dst)
{
	actions(driver).dragAndDrop(src,dst).perform();
}
/**
 * This method is used to perform scrolling the webpage
 * @author vanishree
 * @param driver
 * @param x
 * @param y
 */
public void scrollWebPage(WebDriver driver,int x,int y)
{
	actions(driver).scrollByAmount(x, y).perform();
}
/**
 * This method is used to perform scroll to element action
 * @author vanishree
 * @param driver
 * @param element
 */
public void scrollToElement(WebDriver driver, WebElement element)
{
	actions(driver).scrollToElement(element).perform();
}
/**
 * This method is used to perform doubleclick 
 * @author vanishree
 * @param driver
 */
public void doubleClick(WebDriver driver)
{
	actions(driver).doubleClick().perform();
}
/**
 * This method is used to perform double click on element
 * @author vanishree
 * @param driver
 * @param element
 */
public void doubleClickOnElement(WebDriver driver,WebElement element)
{
	actions(driver).doubleClick(element).perform();
}
/**
 * This method is used to perform right click on webpage 
 * @author vanishree
 * @param driver
 * @param element
 */
public void rightClickonWebPage(WebDriver driver,WebElement element)
{
	actions(driver).contextClick(element).perform();
}
/**
 * This method is used to perform click and hold
 * @author vanishree
 * @param driver
 * @param element
 */
public void clickAndHold(WebDriver driver,WebElement element)
{
	actions(driver).clickAndHold(element).perform();
}
/**
 * This method is used to perform click and hold an element
 * @author vanishree
 * @param driver
 * @param element
 */
public void clickAndHoldanElement(WebDriver driver,WebElement element)
{
	actions(driver).clickAndHold(element).perform();
}
/**
 * This method is used to perform switching to the child window
 * @author vanishree
 * @param driver
 * @param expTitle
 */
public void switchToWindow(WebDriver driver,String expTitle)
{
	Set<String> windows = driver.getWindowHandles();
	Iterator<String> it = windows.iterator();
	while(it.hasNext())
	{
		String currentwin = it.next();
		String actualTitle = driver.switchTo().window(currentwin).getTitle();
		if(actualTitle.contains(expTitle))
		{
			break;
		}
	}
}

//frames
/**
 * This method is used to perform switching to the child frame using index
 * @author vanishree
 * @param driver
 * @param index
 */
public void switchToChildFrame(WebDriver driver,int index)
{
	driver.switchTo().frame(index);
}
/**
 * This method is used to perform switching to the child frame using name
 * @author vanishree 
 * @param driver
 * @param name
 */
public void switchToChildFrame(WebDriver driver,String name)
{
	driver.switchTo().frame(name);
}
/**
 * This method is used to perform switching to the child frame using webelement
 * @author vanishree
 * @param driver
 * @param element
 */
public void switchToChildFrame(WebDriver driver,WebElement element)
{
	driver.switchTo().frame(element);
}
/**
 * This method is used to perform switching to the parent frame 
 * @author vanishree
 * @param driver
 */
public void switchToParentFrame(WebDriver driver)
{
	driver.switchTo().parentFrame();
}
/**
 * This method is used to perform switching to the main frame
 * @author vanishree
 * @param driver
 * @param index
 */
public void switchToMainFrame(WebDriver driver)
{
	driver.switchTo().defaultContent();
}
//alert popups
/**
 * This method is used to perform switching to the alert popup and accept it
 * @author vanishree
 * @param driver
 */
public void acceptAlertPopup(WebDriver driver)
{
	driver.switchTo().alert().accept();
}
/**
 * This method is used to perform switching to the alert popup and cancel it
 * @author vanishree
 * @param driver
 */
public void cancelAlertPopup(WebDriver driver)
{
	driver.switchTo().alert().dismiss();
}
/**
 * This method is used to perform to get the text from alert popup
 * @author vanishree
 * @param driver
 */
public void getTextFromAlertPopup(WebDriver driver)
{
	driver.switchTo().alert().getText();
}
/**
 * This method is used to perform enter the value in the alert text field 
 * @author vanishree
 * @param driver
 * @param value
 */
public void enterValueInTheAlertTextField(WebDriver driver,String value)
{
	driver.switchTo().alert().sendKeys(value);
}
//JavascriptExecuter Methods
/**
 * here we are going to do type casting
 * @author vanishree
 * @param driver
 * @return
 */
public JavascriptExecutor javaScriptExecutor(WebDriver driver)
{
	JavascriptExecutor js = (JavascriptExecutor) driver;
	return js;
}
/**
 * This method is used to perform scroll vertical
 * @author vanishree
 * @param driver
 */
public void scrollHeight(WebDriver driver)
{
	javaScriptExecutor(driver).executeScript("window.scrollBy(0,document.body.scrollHeight)");
}

//scrollTillElement
/**
 * This method is used to perform scroll until element is visible 
 * @author vanishree
 * @param driver
 * @param element
 */
public void scrollUntilEleIsVisibleUsingJSE(WebDriver driver,WebElement element)
{
	javaScriptExecutor(driver).executeScript("argument[0].scrollIntoView()",element);
}
//click on element
/**
 * This method is used to perform clicking on the elements
 * @author vanishree
 * @param driver
 * @param element
 */
public void clickonElementUsingJSE(WebDriver driver,WebElement element)
{
	javaScriptExecutor(driver).executeScript("argument[0].click()",element);
}
//sendkeys
/**
 * This method is used to perform enter value into the text field
 * @author vanishree
 * @param driver
 * @param element
 * @param value
 */
public void enterValueIntoTextFieldUsingJSE(WebDriver driver,WebElement element,String value)
{
	javaScriptExecutor(driver).executeScript("argument[0].value=arguments[1]",element,value);
}
/**
 * This method is used to perform scroll to element using xy co ordinates
 * @author vanishree
 * @param driver
 * @param element
 */
public void scrollToEleUsingXYCoOrdinate(WebDriver driver,WebElement element)
{
    Point loc = element.getLocation();
    int x = loc.getX();
    int y = loc.getY();
    javaScriptExecutor(driver).executeScript("window.scrollBy("+x+","+y+")");
}
}
























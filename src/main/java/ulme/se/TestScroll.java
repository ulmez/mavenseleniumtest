package ulme.se;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TestScroll extends IPage {
	@FindBy(xpath="//*[@id=\"footer-navigation\"]/div/ul/li[1]/a")
	WebElement fieldAtTheBottom;
	
	@FindBy(xpath="//*[@id=\"mt-menu-wrap\"]/div/div[2]")
	WebElement searchButton;
	
	@FindBy(xpath="//*[@id=\"mt-menu-wrap\"]/div/div[2]/div/form/label/input")
	WebElement searchTextField;
	
	@FindBy(xpath="//*[@id=\"mt-menu-wrap\"]/div/div[2]/div/form/input")
	WebElement searchTextFieldButton;
	
	public void finishedLoadingPage() {
		this.finishedLoadingPage(By.xpath("//*[@id=\"masthead\"]/div[2]/div/div[1]/div/p[1]/a"));
	}
	
	public void testOfScroll() throws InterruptedException {
    	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", fieldAtTheBottom);
    	Thread.sleep(500);
	}
	
	public void hideElement() {
		((JavascriptExecutor) driver).executeScript("document.querySelector('.site-title a').style.visibility = 'hidden';");
	}
	
	public void getElementValue() {
		searchButton.click();
		
		/*String temp = (String)((JavascriptExecutor) driver).executeScript("return document.querySelector('#menu-item-1798 a').innerHTML;");
		System.out.println(temp);*/
		
		//((JavascriptExecutor) driver).executeScript("(document.querySelector('.header-search-wrapper')).click();");
		
		/*String myvar = (String) ((JavascriptExecutor) driver).executeScript("return window.myvar;");
		System.out.println(myvar);
		
		String jsToExecute = String.format("return document.querySelector('.footer-menu ul li a')", fieldAtTheBottom);
		return jsToExecute;*/
		
		/*WebDriver driver = new FirefoxDriver();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("document.getElementById('elementid').focus();");*/
		
		// Focus on window to be sure
		//((JavascriptExecutor)webDriver).executeScript("window.focus();");
		
		// Shortcut to focus on a textfield
		//element.sendKeys("");
	}
	
	public void insertValueInTextSearchField() {
		//searchTextField.sendKeys("write something");
		String testing = "En liten sträng";
		((JavascriptExecutor) driver).executeScript("document.querySelector('.search-field').value = '" + testing + "';");
		//((JavascriptExecutor) driver).executeScript("alert('" + testing + "');");
	}
	
	public String clickSearchTextFieldButton() {
		//searchTextFieldButton.click();
		//this.finishedLoadingPage();
		//searchButton.click();
		String temp = (String)((JavascriptExecutor) driver).executeScript("return document.querySelector('.search-field').value;");
		//System.out.println(temp);
		return temp;
	}
}

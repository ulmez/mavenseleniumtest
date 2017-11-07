package ulme.se;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StartPage extends IPage {
	@FindBy(xpath="//*[@id=\"lst-ib\"]")
	WebElement searchTextFieldGoogle;
	
	@FindBy(xpath="//*[@id=\"tsf\"]/div[2]/div[3]/center/input[1]")
	WebElement searchButtonGoogle;
	
	@FindBy(xpath="//*[@id=\"hplogo\"]")
	WebElement startLogoGoogle;
	
	public void finishedLoadingPage() {
		this.finishedLoadingPage(By.xpath("//*[@id=\"hplogo\"]"));
		//System.out.println(startLogoGoogle);
	}
	
	public String getTitle() {
		return driver.getTitle();
	}
	
	public WebElement getSearchTextFieldGoogle() {
		return searchTextFieldGoogle;
	}
	
	public void textInSearchField(String searchText) {
		searchTextFieldGoogle.sendKeys(searchText);
		searchTextFieldGoogle.sendKeys(Keys.ENTER);
	}
	
	public void clickSearchButton() {
		searchButtonGoogle.click();
	}
	
	public void searchButtonPressEnterKey() {
		searchButtonGoogle.sendKeys(Keys.ENTER);
	}
	
	public String getSearchButtonGoogleText() {
		return searchButtonGoogle.getAttribute("value");
		//driver.findElement(By.XPath("//input[@name='submit']")).getAttribute("value");
	}
}

package ulme.se;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
//import io.github.bonigarcia.wdm.FirefoxDriverManager;*/

public class IPage {
	protected static WebDriver driver;
	
	public void takeScreenshot() {
    	try {
    		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        	// Now you can do whatever you need to do with it, for example copy somewhere
			FileUtils.copyFile(scrFile, new File("c:\\images\\screenshot.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void initWebElements() {
		PageFactory.initElements(driver, this);
	}
	
	public void openBrowser(String url) {
		ChromeDriverManager.getInstance().setup();
    	driver = new ChromeDriver();
		//System.setProperty("webdriver.gecko.driver", "C:\\drivers\\geckodriver.exe");
    	//FirefoxDriverManager.getInstance().setup();
    	//final FirefoxProfile firefoxProfile = new FirefoxProfile();
        //firefoxProfile.setPreference("xpinstall.signatures.required", false);
        //driver = new FirefoxDriver(firefoxProfile);
		//driver = new FirefoxDriver();
		
		// Internet Explorer 11 on Windows 10
		//System.setProperty("webdriver.ie.driver", "C:\\drivers\\IEDriverServer.exe");
    	//driver = new InternetExplorerDriver();
    	
    	// Edge
    	//System.setProperty("webdriver.edge.driver", "C:\\drivers\\MicrosoftWebDriver.exe");
    	//driver = new EdgeDriver();
		
		// Safari
    	//driver = new SafariDriver();
    	
		driver.get(url);
	}
	
	public void finishedLoadingPage(By by) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
		wait.pollingEvery(100, TimeUnit.MILLISECONDS);
	}
	
	public void closeBrowser() {
		//Thread.sleep(4000);
		driver.quit();
	}
}

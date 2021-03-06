package ulme.se;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.ChromeDriverManager;

/*import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;*/

/**
 * Hello world!
 *
 */
public class App 
{
	private static WebDriver driver;
    public static void main( String[] args ) throws InterruptedException, IOException
    {
    	//System.setProperty("webdriver.gecko.driver", "C:\\drivers\\geckodriver.exe");
    	ChromeDriverManager.getInstance().setup();
    	driver = new ChromeDriver();
    	//driver = new FirefoxDriver();
    	//driver.manage().window().maximize();
    	//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    	
    	//System.setProperty("webdriver.ie.driver", "C:\\drivers\\IEDriverServer.exe");
    	//DesiredCapabilities capability = DesiredCapabilities.internetExplorer();
    	//capability.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
    	//capability.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
    	//driver = new InternetExplorerDriver();
    	
    	//driver.get("https://www.google.se/");
    	driver.get("http://www.softwaretestingstudio.com/scroll-selenium-webdriver-java/");
    	
    	WebElement element = driver.findElement(By.id("id_of_element"));
    	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    	Thread.sleep(500);
    	
    	//WebDriver driver = new FirefoxDriver();
    	//driver.get("http://www.google.com/");
    	
    	/*File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	// Now you can do whatever you need to do with it, for example copy somewhere
    	FileUtils.copyFile(scrFile, new File("c:\\images\\screenshot.png"));*/
    	
    	//driver.findElement(By.name("q")).sendKeys("MT Software Youtube");
    	//driver.findElement(By.id("q")).sendKeys("MT Software Youtube");
    	//driver.findElement(By.xpath("//*[@id=\"lst-ib\"]")).sendKeys("MT Software Youtube");
    	
    	//driver.findElement(By.name("btnK")).click();
    	Thread.sleep(4000);
    	driver.close();
    	
        //System.out.println( "Hello World!" );
    	///usr/bin/google-chrome
    	////WebDriver driver;// = new ChromeDriver();
		//System.out.println("Hello Google...");
		////browser.get("http://google.se");
    	
    	////System.setProperty("webdriver.chrome.driver", "..//..//..//..//opt//google//chrome//google-chrome");
        /*ChromeOptions options = new ChromeOptions();
        options.addArguments("test-type");
        options.addArguments("start-maximized");
        options.addArguments("--js-flags=--expose-gc");  
        options.addArguments("--enable-precise-memory-info"); 
        options.addArguments("--disable-popup-blocking");
        options.addArguments("--disable-default-apps");
        options.addArguments("test-type=browser");
        options.addArguments("disable-infobars");*/
        ////driver = new ChromeDriver();
        //driver.manage().deleteAllCookies();
        
        ////driver.get("http://www.google.se");
    }
}

package ulme.se;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class StartPageTest {
	StartPage startPage = new StartPage();
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}
	
	@AfterClass
	public static void setUpAfterClass() throws Exception {
		
	}
	
	@Before
	public void setUp() throws Exception {
		startPage.openBrowser("https://www.google.se/");
		startPage.initWebElements();
		startPage.finishedLoadingPage();
	}
	
	@After
	public void tearDown() throws Exception {
		startPage.closeBrowser();
	}
	
	@Test
	public void test1() {
		startPage.textInSearchField("Hello World");
		startPage.takeScreenshot();
		//startPage.textInSearchField("Hello World");
		//startPage.searchButtonPressEnterKey();
		//startPage.clickSearchButton();
		//System.out.println(startPage.getSearchButtonGoogleText());
		//Assert.assertTrue(startPage.getSearchButtonGoogleText().contains("Sök på Google"));
		Assert.assertTrue(startPage.getSearchButtonGoogleText().contains("Sök på Google"));
		//Assert.assertTrue(true);
		//System.out.println(startPage.getSearchButtonGoogleText().contains("Sök på Google"));
	}
	
	/*@Test
	public void test2() {
		//startPage.textInSearchField("Hello World");
		//startPage.searchButtonPressEnterKey();
		//startPage.clickSearchButton();
		//System.out.println(startPage.getSearchButtonGoogleText());
		//Assert.assertTrue(startPage.getSearchButtonGoogleText().contains("Sök på Google"));
		Assert.assertTrue(startPage.getSearchButtonGoogleText().contains("Sök på Google"));
		//Assert.assertTrue(true);
		//System.out.println(startPage.getSearchButtonGoogleText().contains("Sök på Google"));
	}*/

}

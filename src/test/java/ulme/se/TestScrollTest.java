package ulme.se;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestScrollTest {
	TestScroll testScroll = new TestScroll();
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}
	
	@AfterClass
	public static void setUpAfterClass() throws Exception {
		
	}
	
	@Before
	public void setUp() throws Exception {
		testScroll.openBrowser("http://www.softwaretestingstudio.com/scroll-selenium-webdriver-java/");
		testScroll.initWebElements();
		testScroll.finishedLoadingPage();
	}
	
	@After
	public void tearDown() throws Exception {
		//testScroll.closeBrowser();
	}
	
	@Test
	public void test1() throws InterruptedException {
		//testScroll.testOfScroll();
		//testScroll.hideElement();
		//testScroll.getElementValue();
		testScroll.insertValueInTextSearchField();
		//testScroll.clickSearchTextFieldButton();
		Assert.assertEquals(testScroll.clickSearchTextFieldButton(), "En liten sträng");
	}
}

package com.qa.exerciseShopSite.ShopSite;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before; 
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class SearchTest {

	WebDriver driver = null; 
	private String home = "http://automationpractice.com/index.php";
	private String dress = "http://automationpractice.com/index.php?id_category=8&controller=category"; 
	//private String howMuch = "http://automationpractice.com/index.php?id_product=3&controller=product"; 
	private String chiffonDress = "http://automationpractice.com/index.php?id_product=7&controller=product";
	@Before
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/Admin/Documents/Selenium/chromedriver.exe");
		driver = new ChromeDriver(); 
		driver.manage().window().maximize();
	}
	
	@Test
	public void findDresses()
	{
		driver.get(home);
		HomePage pageH = PageFactory.initElements(driver, HomePage.class); 
		pageH.clickDress();
		
		driver.get(dress);
		DressesPage pageD = PageFactory.initElements(driver, DressesPage.class);
		//pageD.searchDress("Summer");
		pageD.searchDress("Summer");
		pageD.clickSearchDress("Chiffon");
		driver.get(chiffonDress);
		DressPrice pageP = PageFactory.initElements(driver, DressPrice.class);
		assertEquals("Price is Incorrect", "$16.40", pageP.getPrice().getText());
		
		
		//assertEquals("Price is incorrect", "$26.00", pageP.getPrice().getText());
		 
		
	}
	
	@After
	public void tearDown()
	{
		driver.quit(); 
	}
}

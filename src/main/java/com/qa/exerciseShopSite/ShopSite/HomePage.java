package com.qa.exerciseShopSite.ShopSite;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

	@FindBy(xpath = "//*[@id='block_top_menu']/ul/li[2]/a")
	private WebElement dressButton; 
	
	public void clickDress()
	{
		dressButton.click();
	}
	
}

	
	
	

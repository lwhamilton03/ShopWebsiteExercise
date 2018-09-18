package com.qa.exerciseShopSite.ShopSite;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DressPrice {

	@FindBy(id = "our_price_display")
	private WebElement price;

	public WebElement getPrice() {
		return price;
	}

	public void setPrice(WebElement price) {
		this.price = price;
	} 

	
}

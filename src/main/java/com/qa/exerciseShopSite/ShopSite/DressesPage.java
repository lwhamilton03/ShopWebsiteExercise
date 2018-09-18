package com.qa.exerciseShopSite.ShopSite;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DressesPage {

	@FindBy(xpath = "//*[@id=\"center_column\"]/ul")
	private WebElement showingDress; 
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/ul")
	private WebElement listDresses; 
	
	public void searchDress(String type)
	{
		List<WebElement> eachDressBox = listDresses.findElements(By.xpath("//*[@id=\"center_column\"]/ul/li")); 
		
			for(WebElement eachDress : eachDressBox)
			{
				if(eachDress.getText().contains(type))
				{
					eachDress.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div/div/a/img")).click();
					try {
						Thread.sleep(6000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
	}
}

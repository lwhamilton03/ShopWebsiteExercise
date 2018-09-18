package com.qa.exerciseShopSite.ShopSite;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DressesPage {

	@FindBy(xpath = "//*[@id=\"center_column\"]/ul")
	private WebElement listDresses;

	public void searchDress(String type)
	{
		String listDress = "//*[@id=\"center_column\"]/ul/li"; 
		List<WebElement> eachDressBox = listDresses.findElements(By.xpath(listDress)); 
		
		for(int i = 1; i < eachDressBox.size(); i++)
			{
				
				if(listDresses.findElement(By.xpath(listDress+"["+i+"]")).getText().contains(type))
				{
					
					System.out.println("found" + listDresses.findElement(By.xpath(listDress+"["+i+"]")).getText());
					
					listDresses.findElement(By.xpath(listDress+"["+i+"]"+"/div/div/div/a/img"));
					
					try {
						Thread.sleep(6000);
					} catch (InterruptedException e) {
 					// TODO Auto-generated catch block
						e.printStackTrace();
						}
				}
			}
					}
		
				

	public void clickSearchDress(String type) {
		String listDress = "//*[@id=\"center_column\"]/ul/li";
		List<WebElement> eachDressBox = listDresses.findElements(By.xpath(listDress));

		for (int i = 1; i < eachDressBox.size(); i++) {

			if (listDresses.findElement(By.xpath(listDress + "[" + i + "]")).getText().contains(type)) {

				System.out.println("found" + listDresses.findElement(By.xpath(listDress + "[" + i + "]")).getText());

				listDresses.findElement(By.xpath(listDress + "[" + i + "]" + "/div/div/div/a/img")).click();;

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

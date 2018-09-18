package com.qa.exerciseShopSite.ShopSite;

import java.io.File;
import java.io.IOException;


import org.apache.commons.io.FileUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

//import org.apache.*;
//import org.apache.commons.io.jar;
//import org.apache.commons.io.FileUtils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.google.common.io.Files;

public class HomePage {

	@FindBy(xpath = "//*[@id='block_top_menu']/ul/li[2]/a")
	private WebElement dressButton; 
	
	public void clickDress()
	{
		dressButton.click();
	}
	
	 
	public void takeScreenShot(WebDriver drive)
	{
		File scrFile = ((TakesScreenshot)drive).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scrFile, new File("C:\\Users\\Admin\\Pictures\\Screenshots\\screenshot.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(scrFile.getAbsolutePath());
		
		//System.out.println(scrFile.getAbsolutePath());

	}
}

	
	
	

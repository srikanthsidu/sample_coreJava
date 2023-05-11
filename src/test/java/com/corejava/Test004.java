package com.corejava;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test004 {

	WebDriver driver;
	
	@BeforeTest
	public void openURL() {	
				
		 driver=new ChromeDriver();  
			
		  //driver.navigate().to("http://www.javatpoint.com/");  
		  driver.get("http://www.Google.com/");
		  driver.manage().window().maximize(); 
		  driver.manage().window().minimize(); 
	}
	
	@Test
	public void getURL() {
		
		String Title1 = driver.getTitle();
		String Title2="dnsfsgmf";
		
		Assert.assertEquals(Title1, Title2);
		
		System.out.println("Page Tile is "+ Title1);
		
	}
	
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
		
	}
}

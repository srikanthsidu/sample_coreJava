package com.corejava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Test003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 WebDriver driver=new ChromeDriver();  
		
		  //driver.navigate().to("http://www.javatpoint.com/");  
		  driver.get("http://www.javatpoint.com/");
		  driver.manage().window().maximize(); 
		  driver.manage().window().minimize(); 
		  System.out.println("this is simple pro1");
		  System.out.println("this is simple pro2");
		  driver.close();
		  
		  
	}

}

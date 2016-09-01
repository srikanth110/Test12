package com.selenium.test1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Logintest {
	
  @Test
  public void Login() {
	  
			 // TODO Auto-generated method stub
			WebDriver driver = new FirefoxDriver();
	        String baseUrl = "https://test.shoomepub.com";
	      

	        // launch Firefox and direct it to the Base URL
	        driver.get(baseUrl);
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        driver.manage().window().maximize();
	        driver.findElement(By.id("alogin")).click();
	        driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_txtEmailAddress']")).sendKeys("srikanthreddy546@gmail.com");
	        driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_txtPassword']")).sendKeys("cricket546");
	        driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnSubmit']")).click();

	        
	       
	        //close Firefox
	        driver.close();
  }
}

package com.selenium.test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void Login() {
	  WebDriver driver = new FirefoxDriver();
      String baseUrl = "https://test.shoomepub.com";
    

      // launch Firefox and direct it to the Base URL
      driver.get(baseUrl);

      
     
      //close Firefox
      driver.close();
  }
}

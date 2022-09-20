package mobileworld;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Contacttest {
	  @Test
	  void contactus()throws InterruptedException{
	    	System.setProperty("webdriver.chrome.driver","C:\\Users\\pavithra.s\\OneDrive - Qualitest Group\\chromedriver_win32//chromedriver.exe");
		    WebDriver driver=new ChromeDriver();
		    driver.get("https://mobileworld.banyanpro.com/");
		   
		    driver.findElement(By.linkText("Support")).click();
		    driver.findElement(By.linkText("Contact Us")).click();
		    String parenthandle = driver.getWindowHandle();
	        Set<String> handles = driver.getWindowHandles();
	        for(String handle : handles) {
	            if(!handle.equals(parenthandle)) {
	                driver.switchTo().window(handle);
	                driver.manage().window().maximize();
	                driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("Pavi");
	                driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("fhh@gmail.com");
	                driver.findElement(By.cssSelector("input[placeholder='Phone']")).sendKeys("0123456788");
	                driver.findElement(By.cssSelector("textarea[placeholder='Message']")).sendKeys("hi everyone");
	                driver.findElement(By.cssSelector("input[type='submit']")).click();
}
}
	  }
}
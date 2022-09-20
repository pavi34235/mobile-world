package mobileworld;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Signtest {

    @Test
    void signin()throws InterruptedException{
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\pavithra.s\\OneDrive - Qualitest Group\\chromedriver_win32//chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://mobileworld.banyanpro.com/");
	    driver.findElement(By.className("my-sm-0")).click();
	driver.findElement(By.id("username")).sendKeys("pavithra");
    driver.findElement(By.id("password")).sendKeys("Pav#12");
	Thread.sleep(1000);
    driver.findElement(By.linkText("Log In")).click();
}
}

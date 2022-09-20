package mobileworld;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SignUptest {
    @Test
    void signUp()throws InterruptedException{
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\pavithra.s\\OneDrive - Qualitest Group\\chromedriver_win32//chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://mobileworld.banyanpro.com/");
	    driver.findElement(By.cssSelector("button.btn.btn-warning.my-2.my-sm-0")).click();
	    driver.findElement(By.linkText("Sign up")).click();
	    driver.findElement(By.className("form-control")).sendKeys("pavithra");
	    driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("shan");
	    driver.findElement(By.cssSelector("input[type='Email']")).sendKeys("abc@gmail.com");
	    driver.findElement(By.cssSelector("input[type='Password']")).sendKeys("Bhava123");
	    driver.findElement(By.xpath("//input[@type='date']")).sendKeys("03/17/2001");
	    driver.findElement(By.xpath("//*[@id=\"myForm\"]/div[3]/div[4]/input")).click();
	   // driver.findElement(By.xpath("//Form/div[3]/div[4]")).click();
	    driver.findElement(By.cssSelector("input[type='number']")).sendKeys("1234567890");
	    //driver.findElement(By.xpath("//input[@placeholder='Short Bio']")).sendKeys("Hi Everyone!!!");
	    driver.findElement(By.cssSelector("textarea.form-control")).sendKeys("hi !!!!");
	    driver.findElement(By.cssSelector("button.btn.btn-info.form-control")).click(); 
	    System.out.println(driver.switchTo().alert().getText());
	    driver.switchTo().alert().accept();
    	
    }
    
    
}

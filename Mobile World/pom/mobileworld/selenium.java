package mobileworld;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pavithra.s\\OneDrive - Qualitest Group\\chromedriver_win32//chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    driver.manage().window().maximize();
	    driver.get("https://mobileworld.banyanpro.com/");
	    driver.findElement(By.cssSelector("button.btn.btn-warning.my-2.my-sm-0")).click();
	    driver.findElement(By.linkText("Sign up")).click();
	    driver.findElement(By.className("form-control")).sendKeys("pavithra");
	    driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("shan");
	    driver.findElement(By.cssSelector("input[type='Email']")).sendKeys("abc@gmail.com");
	    driver.findElement(By.cssSelector("input[type='Password']")).sendKeys("Bhava123");
	    driver.findElement(By.xpath("//input[@type='date']")).sendKeys("03/17/2001");
	    //driver.findElement(By.xpath("//*[@id=\"myForm\"]/div[3]/div[4]/input")).click();
	    driver.findElement(By.xpath("//Form/div[3]/div[4]")).click();
	    driver.findElement(By.cssSelector("input[type='number']")).sendKeys("1234567890");
	    //driver.findElement(By.xpath("//input[@placeholder='Short Bio']")).sendKeys("Hi Everyone!!!");
	    driver.findElement(By.cssSelector("textarea.form-control")).sendKeys("hi !!!!");
	    driver.findElement(By.cssSelector("button.btn.btn-info.form-control")).click(); 
	    System.out.println(driver.switchTo().alert().getText());
	    driver.switchTo().alert().accept();
	   //driver.findElement(By.linkText("Sign In")).click();
	    driver.findElement(By.xpath("//form/div[6]/div[3]")).click();
	    //driver.findElement(By.xpath("/html/body/div/div[2]/form/div[6]/div[3]/button\\")).click();
	    System.out.println(driver.switchTo().alert().getText());
	    driver.switchTo().alert().accept();
	    
	    
	    
	    //driver.get("https://mobileworld.azurewebsites.net/sign.html");
	    driver.findElement(By.id("username")).sendKeys("pavithra");
	    driver.findElement(By.id("password")).sendKeys("Pav#12");
	    driver.findElement(By.linkText("Log In")).click();
	    
	    driver.findElement(By.linkText("Support")).click();
	    driver.findElement(By.linkText("Contact Us")).click();
	    /*driver.findElement(By.xpath("/html/body/div/div/div[2]/form/div[1]/input")).sendKeys("Pavi");
	    driver.findElement(By.name("email")).sendKeys("fhh@gmail.com");
	    driver.findElement(By.name("phone")).sendKeys("0123456789");
	    driver.findElement(By.name("message")).sendKeys("hi everyone");
	    driver.findElement(By.xpath("//input[@type='submit']")).click();*/
	   
	    
	    String parenthandle = driver.getWindowHandle();
        Set<String> handles = driver.getWindowHandles();
        for(String handle : handles) {
            if(!handle.equals(parenthandle)) {
                driver.switchTo().window(handle);
                driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("Pavi");
                driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("fhh@gmail.com");
                driver.findElement(By.cssSelector("input[placeholder='Phone']")).sendKeys("0123456788");
                driver.findElement(By.cssSelector("textarea[placeholder='Message']")).sendKeys("hi everyone");
                driver.findElement(By.cssSelector("input[type='submit']")).click();
            }
        
        }
	    
	    /*contact us
	    WebElement staticDropdown=driver.findElement(By.xpath("//a[@onclick='openPopup()']"));
	    Select dropdown=new Select(staticDropdown);
	    dropdown.selectByVisibleText("Contact Us");
	    System.out.println(dropdown.getFirstSelectedOption().getText()) ;*/
	
	}
	

}

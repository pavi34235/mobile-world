package mobileworld;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom  {
     WebDriver driver;
     public Pom(WebDriver driver)
     {
         this.driver=driver;
    	 PageFactory.initElements(driver, this);
     }



		@FindBy(css="button.btn.btn-warning.my-2.my-sm-0")
        WebElement button; 
        
        @FindBy(linkText="Sign up")
        WebElement Signup;

        @FindBy(className="form-control")
        WebElement formcontrol;
      
       
        @FindBy(xpath="//input[@placeholder='Last Name']")
        WebElement LastName;
        
        @FindBy(css="input[type='Email']")
        WebElement Emailid;
        
        @FindBy(css="input[type='Password']")
        WebElement PasswordEle;
        
        @FindBy(xpath="//input[@type='date']")
        WebElement calendar;
        
        @FindBy(xpath="//Form/div[3]/div[4]")
        WebElement form;
        
        @FindBy(css="input[type='number']")
        WebElement numberEle;
        
       
        @FindBy(css=" textarea.form-control")
        WebElement textarea;
        
        @FindBy(css=" button.btn.btn-info.form-control")
        WebElement buttonbtn;
        
        //driver.findElement(By.xpath("//form/div[6]/div[3]")).click();(sign in )
        
        @FindBy(id="username")
        WebElement user;
        

        @FindBy(id="password")
        WebElement passwordEle;
        
        @FindBy(linkText="Log In")
        WebElement login;
        
        
        @FindBy(linkText="Support")
        WebElement support; 
        
        @FindBy(linkText="Contact Us")
        WebElement contactus; 
        
        
        @FindBy(css="input[placeholder='Username']")
        WebElement username;
        
        @FindBy(css="input[placeholder='Email']")
        WebElement Email;
        
        @FindBy(css="input[placeholder='Phone']")
        WebElement Phone;
        
        @FindBy(css="textarea[placeholder='Message']")
        WebElement message;
        
        @FindBy(css="input[type='submit']")
        WebElement submit;
        
        
        public void goTo()
        {
        	driver.get("https://mobileworld.banyanpro.com/");
        }
        
public void registrationPage(String name,String lname,String email,String password,String date,String number,String text) throws InterruptedException
{
	   button.click();
	   Signup.click();
	   formcontrol.sendKeys(name);
	   LastName.sendKeys(lname);
	   Emailid.sendKeys(email);
	   PasswordEle.sendKeys(password);
	   calendar.sendKeys(date);
	   form.click();
	   numberEle.sendKeys(number);
	   textarea.sendKeys(text);
	   buttonbtn.click();
	   Thread.sleep(2000);
	   driver.quit();
}


public void loginPage(String username,String password) throws InterruptedException   
{
	button.click();
	user.sendKeys(username);
    passwordEle.sendKeys(password);
    Thread.sleep(2000);
    login.click();
    driver.quit();
}


public void contactusPage(String name,String mail,String number,String text ) throws InterruptedException
{
	support.click();
	contactus.click();
	  String parenthandle = driver.getWindowHandle();
      Set<String> handles = driver.getWindowHandles();
      for(String handle : handles) 
      {
          if(!handle.equals(parenthandle)) 
          {
              driver.switchTo().window(handle);
              driver.manage().window().maximize();
              driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys(name);
              driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys(mail);
              driver.findElement(By.cssSelector("input[placeholder='Phone']")).sendKeys(number);
              driver.findElement(By.cssSelector("textarea[placeholder='Message']")).sendKeys(text);
              Thread.sleep(2000);
              driver.findElement(By.cssSelector("input[type='submit']")).click();
              driver.quit();
      
      }
      }
}
}
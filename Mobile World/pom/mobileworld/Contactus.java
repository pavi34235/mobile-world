package mobileworld;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Contactus {
@Test
	public  void setup() throws InterruptedException {
	
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pavithra.s\\OneDrive - Qualitest Group\\chromedriver_win32//chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    driver.manage().window().maximize();
	    
	    Pom contact=new Pom(driver);
		   contact.goTo();
		   contact.contactusPage("pavithra","abc@gmail.com","0123456789","hi everyone");
		   
		   System.setProperty("webdriver.chrome.driver","C:\\Users\\pavithra.s\\OneDrive - Qualitest Group\\chromedriver_win32//chromedriver.exe");
		    WebDriver driver1=new ChromeDriver();
		    driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		    driver1.manage().window().maximize();
		    
		    Pom contact1=new Pom(driver1);
			   contact1.goTo();
			   contact1.contactusPage("pa","abc@gmailcom","012389","hi everyone");
	    
	}
}
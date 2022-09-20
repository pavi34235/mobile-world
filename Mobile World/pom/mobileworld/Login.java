package mobileworld;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login {
@Test
	public  void setup() throws InterruptedException {
	
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pavithra.s\\OneDrive - Qualitest Group\\chromedriver_win32//chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    driver.manage().window().maximize();

	    Pom login=new Pom(driver);
		   login.goTo();
		   Thread.sleep(1000);
		   login.loginPage("pavithra","pa1211");
	
       System.setProperty("webdriver.chrome.driver","C:\\Users\\pavithra.s\\OneDrive - Qualitest Group\\chromedriver_win32//chromedriver.exe");
        WebDriver driver1=new ChromeDriver();
        driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver1.manage().window().maximize();

        Pom login1=new Pom(driver1);
            login1.goTo();
            Thread.sleep(1000);
            login1.loginPage("pa","pa@11");

}
/*@DataProvider
public Object[][] getData(){
	Object[][]data=new Object[2][2];
	data[0][0]="Pa";
	data[0][1]="pa@124uio87654";
	data[1][0]="abcdefghijklmnopqrstuvwxyz";
	data[1][1]="p!";
	return data;
}*/

}
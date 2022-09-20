package mobileworld;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class signup {
@Test(dataProvider="getData")
	public  void setup(String name,String lname,String email,String password,String date,String number,String text) throws InterruptedException 
{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pavithra.s\\OneDrive - Qualitest Group\\chromedriver_win32//chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    driver.manage().window().maximize();
	    Pom home=new Pom(driver);
	    home.goTo();
	    home.registrationPage(name,lname,email, password,date,number,text);
	    
}
	    
@DataProvider	    
public Object[][] getData(){
	Object[][]data=new Object[3][7];
	data[0][0]="pavithra";
    data[0][1]="shan"; 
	data[0][2]="abc@gmail.com"; 
	data[0][3]="abc123"; 
	data[0][4]="3/12/2000"; 
	data[0][5]="0123456789"; 
	data[0][6]="Hi everyone";
	data[1][0]="pa";
    data[1][1]="sh"; 
	data[1][2]="abc@gma.com"; 
	data[1][3]="abc123234567"; 
	data[1][4]="3/12/20000"; 
	data[1][5]="01289"; 
	data[1][6]="hi "; 
	data[2][0]="abcdefghijklmnopqrstuvwx";
    data[2][1]="sh"; 
	data[2][2]="abc@gmail.com"; 
	data[2][3]="abc123234567"; 
	data[2][4]="3/12/20000"; 
	data[2][5]="  "; 
	data[2][6]="hi"; 
	
	   
	return data;
	
	}
/* System.setProperty("webdriver.chrome.driver","C:\\Users\\pavithra.s\\OneDrive - Qualitest Group\\chromedriver_win32//chromedriver.exe");
WebDriver driver1=new ChromeDriver();
driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
driver1.manage().window().maximize();
Pom home1=new Pom(driver1);
home1.goTo();
home1.registrationPage("pa","sh","abc@gml.com","abc!123","3/12/2000","0126789","Hi everyone");*/
}



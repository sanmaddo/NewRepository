package Web;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {


	@Test(invocationCount=6,threadPoolSize=4)
	public void login() {
		System.setProperty("webdriver.gecko.driver", ".//drivers//geckodriver.exe");
		WebDriver wd = new FirefoxDriver ();
		wd.get("http://newtours.demoaut.com/");
		wd.manage().window().maximize(); 
		
		WebElement uName = wd.findElement(By.xpath("//input[@name='userName']"));
		WebElement pwd   = wd.findElement(By.xpath("//input[@name='password']"));
		WebElement submitbtn = wd.findElement(By.xpath("//*[@name='login']"));
		uName.sendKeys("shanvasanth@gmail.com");
		pwd.sendKeys("kavithai");
	
		submitbtn.click();
		wd.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	
	}
	
	@Test(dependsOnMethods="login")
	public void signOff(){
		System.setProperty("webdriver.gecko.driver", ".//drivers//geckodriver.exe");
		WebDriver wd = new FirefoxDriver ();
		wd.findElement(By.linkText("SIGN-OFF")).click();
		
	}

	


}

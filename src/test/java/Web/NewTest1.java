package Web;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NewTest1 {
	@Test()
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
	


  }


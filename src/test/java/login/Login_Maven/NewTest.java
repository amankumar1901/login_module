package login.Login_Maven;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	static WebDriver driver;
	
  @Test
  public void f() throws InterruptedException {
	  By username=By.id("userName");
	  By password=By.id("password");
	  By login =By.id("login");
	  By logout=By.id("submit");
	  
	  driver.findElement(username).sendKeys("user");
	  driver.findElement(password).sendKeys("User@123");
	  Thread.sleep(2000);
	  driver.findElement(login).click();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.findElement(By.id("searchBox")).sendKeys("You Don't Know JS");
	  Thread.sleep(2000);
	  driver.findElement(By.id("basic-addon2")).click();
	  driver.findElement(logout).click();
	  
	  
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  String path="C:\\Users\\Dell\\Aman Pundhir\\Jar Files\\Jar Files\\chromedriver.exe";
	  String url="https://demoqa.com/login";
	  System.setProperty("webdriver.chrome.driver", path);
	  driver=new ChromeDriver();
	  driver.get(url);
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  
  }

  @AfterTest
  public void afterTest() {
//	  driver.quit();
  }

}

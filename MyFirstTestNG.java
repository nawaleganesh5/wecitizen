package Scripts;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class MyFirstTestNG 
{
 WebDriver driver;
 
 @BeforeSuite
 public void beforesuitemethod()
 {
	  System.out.println("I an in Before Suite");
 }
 @AfterSuite
 public void aftersuitemethod()
 {
	  System.out.println("I an in After Suite");
 }
 @BeforeTest
 public void beforetestemethod()
 {
	  System.out.println("I an in Before Test");
 }
 @AfterTest
 public void aftertestemethod()
 {
	  System.out.println("I an in After Test");
 }
  
  @BeforeSuite
  public void beforesuitemethod1()
  {
	  System.out.println("I an in Before Suite");
  }
  @AfterSuite
  public void aftersuitemethod1()
  {
	  System.out.println("I an in After Suite Test2");
  }
  @BeforeTest
  public void beforetestemethod1()
  {
	  System.out.println("I an in Before Test Test2");
  }
  @AfterTest
  public void aftertestemethod1()
  {
	  System.out.println("I an in After Test Test2");
  }
  
  @Test
  public void f() 
  {
	  System.out.println("I am in test");
	  driver.get("http://nichethyself.com/tourism/home.html");
      WebElement user  = driver.findElement(By.name("username"));
      user.sendKeys("stc123");
      driver.findElement(By.name("password")).sendKeys("12345");
      driver.findElement(By.name("username")).submit();
      String expectedTitle = "My account";
      String actualTitle = driver.getTitle();
      assertEquals(expectedTitle,actualTitle);
  }
  @BeforeMethod
  public void beforeMethod() 
  {
	  System.out.println("I am in before method");
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Ganesh\\workspace\\WebDriverTraining\\Test\\Resources\\chromedriver-93.exe");
      driver = new ChromeDriver(); 
	  
	  
  }

  @AfterMethod
  public void afterMethod()
  {
	  System.out.println("I am after methhod");
    
System.out.println("I am after methhod");
System.out.println("I am after methhod");
System.out.println("I am after methhod");  
 
System.out.println("I am after methhod");      
  }

}

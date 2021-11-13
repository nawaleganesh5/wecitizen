package Scripts;


import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class TestNGProgbyClass 
{
  WebDriver driver;
  @Test
  public void f() 
  {
	  System.out.println("I  am in Test");
		driver.get("http://nichethyself.com/tourism/home.html");
		WebElement user = driver.findElement(By.name("username"));
		System.out.println("Tag of username is " + user.getTagName());
		System.out.println("type attrubute of username is " + user.getAttribute("type"));
		System.out.println("Name attrubute of username is " + user.getAttribute("name"));
		System.out.println("Placeholder attrubute of username is " + user.getAttribute("placeholder"));
		user.sendKeys("stc123");
		driver.findElement(By.name("password")).sendKeys("12345");// Method
																	// chaining
																	// in Java
		driver.findElement(By.name("username")).submit();// submitting the form.

		String expectedTitle = "My account";
		String actualTitle = driver.getTitle();

		/*
		 * if (expectedTitle.equals(actualTitle))
		 * System.out.println("Test Case Passed"); else
		 * System.out.println("Test Case Failed");
		 */		
		assertEquals(actualTitle, expectedTitle);
  }
  @Test
	public void googleTest() 
  {
		driver.get("http://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Today is Saturday");
  }		
  @BeforeMethod
  public void beforeMethod() 
  {
	  System.out.println("I  am in Before Method");
  }

  @AfterMethod
  public void afterMethod() 
  {
	  System.out.println("I  am in After Method");	
  }

  @BeforeClass
  public void beforeClass() 
  {
	  System.out.println("I am in Before Class");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ganesh\\workspace\\WebDriverTraining\\Test\\Resources\\chromedriver-93.exe");
		driver = new ChromeDriver();
  }

  @AfterClass
  public void afterClass() 
  {
	  System.out.println("I am in After Class");
		driver.quit();
  }

}

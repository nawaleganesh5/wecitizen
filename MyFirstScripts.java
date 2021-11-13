package Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstScripts 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		WebDriver driver=null; //It is an interface in java 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ganesh\\workspace\\WebDriverTraining\\Test\\Resources\\chromedriver-93.exe");
		driver = new ChromeDriver();
		driver.get("http://nichethyself.com/tourism/home.html");
		WebElement user = driver.findElement(By.name("username"));
		user.sendKeys("stc123");
		driver.findElement(By.name("password")).sendKeys("12345");//Method chaining in Java 
		driver.findElement(By.name("username")).submit();//submitting the form. 
		
	    driver.quit();
		//WebDriver driver = new WebDriver();
	}
	

}

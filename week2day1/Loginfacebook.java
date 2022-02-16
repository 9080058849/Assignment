package week2Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Loginfacebook 
{
	public static void main(String[] args) 
	{
	  WebDriverManager.chromedriver().setup();
	  ChromeDriver driver=new ChromeDriver();
	  driver.get("https://www.facebook.com/");
	  driver.manage().window().maximize();
	  driver.findElement(By.id("email")).sendKeys("17cs043@ksrce.ac.in");
	  driver.findElement(By.id("pass")).sendKeys("mahesh123");
	  driver.findElement(By.name("login")).click();
	  driver.close();
	}
}

package week2Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegisterSalesForce
{
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.findElement(By.name("username")).sendKeys("harikrishnan");
		driver.findElement(By.name("firstname")).sendKeys("Hari");
		driver.findElement(By.name("lastname")).sendKeys("radhakrishnan");
		driver.findElement(By.name("email")).sendKeys("hari.radhakrishnan@qeagle.com");
		
		WebElement element = driver.findElement(By.name("country_id"));
		Select option=new Select(element);
		option.selectByValue("99");
		
		driver.findElement(By.name("password")).sendKeys("Password@123");
		driver.findElement(By.xpath("(//ul[@class='list-inline'])/li[4]")).click();
		
		
		
		
		
 
   }
}

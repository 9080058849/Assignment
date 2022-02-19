package week2Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.name("UserFirstName")).sendKeys("Mahesh");
		driver.findElement(By.name("UserLastName")).sendKeys("M");
		driver.findElement(By.name("UserEmail")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.name("CompanyName")).sendKeys("Tcs Technology");
		WebElement element = driver.findElement(By.name("UserTitle"));
		Select option=new Select(element);
		option.selectByIndex(5);
		
		driver.findElement(By.xpath("(//select[@name='CompanyEmployees']/option)[4]")).click();
		
		driver.findElement(By.name("UserPhone")).sendKeys("9008002001");
		
		WebElement element2 = driver.findElement(By.name("CompanyCountry"));
		Select option1=new Select(element2);
		option1.selectByValue("IN");
		
		driver.findElement(By.xpath("//div[@class='field']/div")).click();
		Thread.sleep(2000);
		driver.close();
		

	}

}

package Week2day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact 
{
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Mahesh");
		driver.findElement(By.id("lastNameField")).sendKeys("M");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Madhan");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("D");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("ComputerScience");
		driver.findElement(By.name("description")).sendKeys("I am Software Enginner Completed in 2021");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("mahesh123@gmail.com");
		driver.findElement(By.id("createContactForm_primaryPhoneCountryCode")).clear();
		driver.findElement(By.id("createContactForm_primaryPhoneCountryCode")).sendKeys("91");
		driver.findElement(By.id("createContactForm_primaryPhoneAreaCode")).sendKeys("20");
		driver.findElement(By.id("createContactForm_primaryPhoneNumber")).sendKeys("9080058840");
		
		WebElement element2 = driver.findElement(By.name("generalCountryGeoId"));
		Select text1=new Select(element2);
		text1.selectByValue("IND");
		WebElement element = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select text= new Select(element);
		text.selectByValue("IN-TN");
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.className("subMenuButton")).click();
		driver.findElement(By.name("description")).clear();
		driver.findElement(By.name("importantNote")).sendKeys("keep a important note");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		String title = driver.getTitle();
		System.out.println("The title of the page is:"+title);
		
	}
}

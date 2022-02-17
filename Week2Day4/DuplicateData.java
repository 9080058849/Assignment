package Week2day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateData {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.id("username")).sendKeys("DemosalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Name and ID']")).click();
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Mahesh");
	    driver.findElement(By.xpath("(//input[@name='lastName'])[3]")).sendKeys("M");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
	String text=driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		System.out.println("The first search lead:"+text);
		String name=driver.findElement(By.xpath("//a[text()='Mahesh']")).getText();
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Duplicate Lead")).click();
	String title="Duplicate Lead | opentaps CRM";
	    String title2 = driver.getTitle();
	    if(title.equals(title2))
	    {
	    	System.out.println("The page title is:"+title);
	    }else
	    {
	    	System.out.println("Wrong Title");
	    }
	    driver.findElement(By.name("submitButton")).click();
	String name1=driver.findElement(By.xpath("//span[text()='Mahesh']")).getText();
	    if(name.equals(name1))
	    {
	    	System.out.println("Duplicate lead Contain the same name:"+name);
	    }else
	    	System.out.println("Duplicate lead Contain the Wrong Name");
	    driver.close();
	}

}

package Week2day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Mahesh");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
        String title=driver.getTitle();
        String title1="View Lead | opentaps CRM";
        if(title.equals(title1))
        {
        	System.out.println("The Title is Verified:"+title);
        }else
        	System.out.println("The title is Not Verified");
        driver.findElement(By.linkText("Edit")).click();
        driver.findElement(By.id("updateLeadForm_companyName")).clear();
        driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("WiproManagement");
        driver.findElement(By.name("submitButton")).click();
    String text=driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).getText();
    	if(text.contains("WiproManagement"))
    	{
    		System.out.println("The Name has changed:"+text);
    	}else
    		System.out.println("The Name Not Changed");
        driver.close();
	}

}

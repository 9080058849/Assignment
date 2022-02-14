package week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Launchbrowser 
{
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.name("USERNAME")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		String title=driver.getTitle();//crtl 2+l
		System.out.println(title);
		
		//to Create a leads
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.className("inputBox")).sendKeys("Testleaf Management");
		driver.findElement(By.name("parentPartyId")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Mahesh");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("M");
		driver.findElement(By.id("createLeadForm_dataSourceId")).click();
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Gowtham");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("G");
		driver.findElement(By.className("inputBox")).sendKeys("09/05/1998");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Computer Science");
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("20");
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("+91");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("20");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9488358123");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys(".xml");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("maheshraja123@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("http://leaftaps.com");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("goerdje");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("manav");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("20/k.s.r/Thokkavadi");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Tiruchengode;Namakkal");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Tiruchengode");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("637218");
		driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")).sendKeys("Tamilnadu");
		driver.findElement(By.id("createLeadForm_generalCountryGeoId")).sendKeys("India");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("");
		//driver.findElement(By.id("ext-gen633")).click();
	
	}
}

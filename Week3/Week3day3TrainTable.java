package week3;

import java.time.Duration;
import java.util.List;

import javax.security.auth.kerberos.KeyTab;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Week3day3TrainTable {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("txtStationFrom")).clear();
		driver.findElement(By.id("txtStationFrom")).sendKeys("Erode Jn",Keys.TAB);
		driver.findElement(By.id("txtStationTo")).clear();
		driver.findElement(By.id("txtStationTo")).sendKeys("Mgr Chennai Ctr",Keys.TAB);
		driver.findElement(By.id("chkSelectDateOnly")).click();
		
		// List of Train
		List<WebElement> findElements = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tbody//tr"));
		int size = findElements.size();
		System.out.println(size);
		
		for(int i=1;i<=size;i++)
		{
		String text = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tbody//tr["+i+"]//td")).getText();
		System.out.println(text);
		}
		
		List<WebElement> findElements2 = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tbody//tr//following-sibling::tr//td//following-sibling::td"));
		int size2 = findElements2.size();
		System.out.println(size2);
		
		
		
		
		
		
		//List of Train Name
		
		for(int i=1;i<=size2;i++)
		{
		String text = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tbody//tr["+i+"]//td//following-sibling::td")).getText();
		System.out.println(text);
		}
		
		
		
		
		}

}
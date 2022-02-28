package week3Assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Snapdeal {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(option);
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement element = driver.findElement(By.xpath("(//span[@class='labelIcon']/following-sibling::span)[1]"));
		Actions click=new Actions(driver);
		click.clickAndHold(element).perform();
		click.click().perform();
		
		WebElement element2 = driver.findElement(By.xpath("(//span[text()='Sports Shoes'])[1]"));
		Actions click1 =new Actions(driver);
		click1.moveToElement(element2).perform();
		click.click().perform();
		
		//count of shoes
		
		String text = driver.findElement(By.xpath("//h1[@class='category-name']/following-sibling::span")).getText();
		System.out.println("The count of shoes:"+text);
		//sort by
		driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
		driver.findElement(By.xpath("//span[text()='Sort by:']")).click();
		driver.findElement(By.xpath("(//ul[@class='sort-value']/li)[2]")).click();
		WebElement element3 = driver.findElement(By.xpath("//span[@class='category-name category-count']"));
		String text2 = element3.getText();
		System.out.println("the count of training shoes:"+text2);
		String text3 = driver.findElement(By.xpath("//span[text()='Rs.  575']")).getText();
		String string = text3.replaceAll("Rs. ","");
		//System.out.println(string);
		int name= Integer.parseInt(string);
		//System.out.println(name);
		String text4 = driver.findElement(By.xpath("(//span[text()='Rs.  1,749'])[1]")).getText();
		String string2 = text4.replaceAll("\\D","");
		//System.out.println(string2);
		
		int name1 = Integer.parseInt(string2);

		if(name<=name1)
		{
			System.out.println("The selected filter is correct");
		}else
		System.out.println("the selected filter is wrong");
				
	    WebElement element4 = driver.findElement(By.xpath("(//div[@class='price-text-box']/input)[1]"));
		element4.clear();
		element4.sendKeys("900");
		
		WebElement element5 = driver.findElement(By.xpath("//div[@class='price-text-box']/input[@name='toVal']"));
		element5.clear();
		element5.sendKeys("1800");
		driver.findElement(By.xpath("//div[@class='price-go-arrow btn btn-line btn-theme-secondary']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='sdCheckbox filters-list '] [5])[1]")).click();
		//verfication of filters
		//quick	view
		WebElement element6 = driver.findElement(By.xpath("(//div[@class='product-tuple-image '])[1]"));
		Actions click2= new Actions(driver);
		click2.moveToElement(element6).perform();
		Thread.sleep(2000);
		WebElement element7 = driver.findElement(By.partialLinkText("Red Tape Walking  Navy Training"));
		Actions click3=new Actions(driver);
		click3.moveToElement(element7).perform();
		driver.findElement(By.xpath("(//div[@class='center quick-view-bar  btn btn-theme-secondary  '])[1]")).click();
		String text5 = driver.findElement(By.xpath("//span[@class='percent-desc ']")).getText();
		System.out.println("The discount percemtage is :"+text5);
		//snapchat 
		Thread.sleep(2000);
		File snap=driver.getScreenshotAs(OutputType.FILE);
		File des=new File("./snapchat/shoeimage.png");
		FileUtils.copyFile(snap,des);
		Thread.sleep(2000);
		driver.close();
		
		
		
		
		
		
		
	}
}

package week3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Week3day4SnapdealAss {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(option);
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//a[@class='menuLinks leftCategoriesProduct ']/span[2]")).click();
		driver.findElement(By.xpath("//span[text()='Sports Shoes'][1]")).click();
		String text = driver.findElement(By.xpath("//span[@class='category-name category-count']")).getText();
		System.out.println("The Sport Shoes Count:"+text);
		String name="Sports Shoes For Men - Upto 70% OFF on Top Shoe Brands";
		String title = driver.getTitle();
		System.out.println("The page Title is:"+title);
		if(title.contains(name))
		{
			System.out.println("The Title verified Succesfully");
		}else
			System.out.println("The Title verified is Failed");
		Thread.sleep(3000);
		driver.close();
	}

}

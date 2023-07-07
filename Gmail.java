package week4.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import dev.failsafe.internal.util.Assert;

public class Gmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeOptions ch = new ChromeOptions();
		ch.addArguments("--disable-notifications");
		// TODO Auto-generated method stub
		ChromeDriver dr = new ChromeDriver(ch);
		dr.get("https://www.gmail.com");
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Thread.sleep(30);
		dr.findElement(By.xpath("//span[text()='Create account']")).click();
		dr.findElement(By.xpath("//li[@role='menuitem']")).click();
		//WebEle
		//Assert.isTrue(false, "", args)
		dr.findElement(By.name("firstName")).sendKeys("Sowmi123op");
		dr.findElement(By.id("lastName")).sendKeys("Kannan300");
		dr.findElement(By.xpath("//span[@class='VfPpkd-vQzf8d']")).click();
		dr.findElement(By.id("day")).sendKeys("03");
		dr.findElement(By.id("year")).sendKeys("1994");
		WebElement cd = dr.findElement(By.id("month"));
		Select op= new Select(cd);
		op.selectByIndex(1);
		WebElement cd1 = dr.findElement(By.id("gender"));
		Select op1= new Select(cd1);
		op1.selectByVisibleText("Female");
		dr.findElement(By.xpath("//span[@class='VfPpkd-vQzf8d']")).click();
		dr.findElement(By.xpath("(//div[@class='SCWude']/div)[1]")).click();	
		dr.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']")).click();
		dr.findElement(By.xpath("//input[@name='Passwd']")).sendKeys("allisWELL28***");
		dr.findElement(By.xpath("//input[@name='PasswdAgain']")).sendKeys("allisWELL28***");
		dr.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']")).click();
		dr.findElement(By.id("phoneNumberId")).sendKeys("9003222389");
		dr.findElement(By.xpath("//span[@class='VfPpkd-vQzf8d']")).click();
		dr.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']")).click();
		dr.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']")).click();
		dr.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']")).click();
		dr.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']")).click();
		
		
		
		
		
		
		
		
		
	}

}

package SeleniumSample;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.className("crmsfa")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Likewize");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Lakshmi");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Bala");
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.className("smallSubmit")).click();
	}
	
	

}

package Automation;

import org.testng.annotations.Test;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Form_Automation {
	
	WebDriver driver;
	
	@Test
	public void LaunchBrowser()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	}
	
	@Parameters("url")
	@Test
	public void VisitSite(String url)
	{
		driver.get(url);
	}
	
	@Test
	public void FillForm() throws InterruptedException
	{
		driver.findElement(By.id("name")).sendKeys("Rakshit");
		driver.findElement(By.id("company_name")).sendKeys("Trustmore");
		driver.findElement(By.id("nature_of_business")).sendKeys("Fintech");
		driver.findElement(By.id("city")).sendKeys("Patna");
		driver.findElement(By.id("mobile_no")).sendKeys("1234567890");
		driver.findElement(By.id("email_id")).sendKeys("abc@gmail.com");
//		new WebDriverWait(driver,Duration.ofSeconds(10)).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[starts-with(@name, 'a-') and starts-with(@src, 'https://www.google.com/recaptcha')]")));
//
//		new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#recaptcha-anchor > div.recaptcha-checkbox-border"))).click();
		
		Thread.sleep(20000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}
	
	@Test
	public void GodrejFormFill() throws InterruptedException
	{
		driver.findElement(By.id("name")).sendKeys("Rakshit");
		driver.findElement(By.id("company_name")).sendKeys("Trustmore");
		driver.findElement(By.id("nature_of_the_business")).sendKeys("Fintech");
		driver.findElement(By.id("city")).sendKeys("Patna");
		driver.findElement(By.id("mobile_number")).sendKeys("1234567890");
		driver.findElement(By.id("email_id")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("accept_terms")).click();
		Thread.sleep(20000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	@Test
	public void GcpitFormFill() throws InterruptedException
	{
		driver.findElement(By.id("name")).sendKeys("Rakshit");
		driver.findElement(By.id("company_name")).sendKeys("Trustmore");
		driver.findElement(By.id("nature_of_the_business")).sendKeys("Fintech");
		driver.findElement(By.id("city")).sendKeys("Patna");
		driver.findElement(By.id("mobile_number")).sendKeys("1234567890");
		driver.findElement(By.id("email_id")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("pan_number")).sendKeys("XBCTY1234D");
		driver.findElement(By.id("gst_number")).sendKeys("52AAAAA0000A1Z5");
		driver.findElement(By.id("accept_terms")).click();
		Thread.sleep(50000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	@Test
	public void MarketingFormFill() throws InterruptedException
	{
		driver.findElement(By.id("name")).sendKeys("Rakshit");
		driver.findElement(By.id("email_id")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("city")).sendKeys("Patna");
		driver.findElement(By.id("mobile_no")).sendKeys("1234567890");
		Thread.sleep(20000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	@Test
	public void Invoice2Cash() throws InterruptedException
	{
		driver.findElement(By.id("name")).sendKeys("Rakshit");
		driver.findElement(By.id("email_id")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("city")).sendKeys("Patna");
		driver.findElement(By.id("mobile_no")).sendKeys("1234567890");
		driver.findElement(By.id("company_name")).sendKeys("Trustmore");
		driver.findElement(By.id("nature_of_business")).sendKeys("Fintech");
		Thread.sleep(60000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}
	
	@Test	
	public void FillIpriveForm() throws InterruptedException
	{
		driver.findElement(By.id("name")).sendKeys("Rakshit");
		Thread.sleep(2000);
		driver.findElement(By.id("email_id")).sendKeys("abc@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("city")).sendKeys("Patna");
		Thread.sleep(2000);
		driver.findElement(By.id("mobile_no")).sendKeys("1234567890");
		Thread.sleep(50000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}
	

}

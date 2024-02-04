package com.tect.vaccinefinder.Test;
import org.testng.annotations.*;

import com.tect.vaccinefinder.Pages.VaccineFinderPage;

import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class VaccineFinderTest {
	WebDriver driver;
	
	
	@BeforeTest
	public void beforetest()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		driver.get("https://indian-vaccine.web.app/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
	}
	
	@Test(priority=1, enabled = true)
	public void SearchOperation() throws InterruptedException
	{
		VaccineFinderPage page = new VaccineFinderPage(driver);
		page.SearchState("Kerala");
		Thread.sleep(5000);
		page.SearchDistrict("Ernamkulam");
		Thread.sleep(5000);
		
	}
	
	@Test(priority=2, enabled = true)
	public void Validatebuttons() throws InterruptedException
	{
		VaccineFinderPage page = new VaccineFinderPage(driver);
		page.Resetcurrentsearchbuttonvalidation();
		Thread.sleep(5000);
		page.Refreshbuttonvalidation();
		Thread.sleep(5000);
		page.Notificationbuttonvalidation();
		Thread.sleep(5000);
		page.refreshbarvalidation();
		Thread.sleep(5000);
		
	}
	
	@Test(priority=3, enabled = true)
	public void ValidateLinks() throws InterruptedException
	{
		VaccineFinderPage page = new VaccineFinderPage(driver);
		page.Covidcaseslinkvalidation();
		Thread.sleep(5000);
		page.Refreshportal();
		Thread.sleep(5000);
		page.Downloadlinkvalidation();
		Thread.sleep(5000);
		page.Refreshportal();
		Thread.sleep(5000);
		page.Aboutlinkvalidation();
		Thread.sleep(5000);
		
	}
	
	
	
	@AfterTest
	public void aftertest()
	{
		driver.quit();
	}
	

}

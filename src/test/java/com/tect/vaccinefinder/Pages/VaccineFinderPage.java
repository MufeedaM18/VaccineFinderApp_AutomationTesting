package com.tect.vaccinefinder.Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;


public class VaccineFinderPage {
	WebDriver driver;
	public VaccineFinderPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By Resetsearchresultbutton = By.xpath("//button[@title='Reset Current Search']");
	By Refreshbutton = By.xpath("//button[@title='Refresh']");
	By Notificationbutton = By.xpath("//button[@title='Notification']");
	By Refreshbar = By.xpath("//button[text()='Refresh']");
	By covidcaseslink = By.xpath("//a[text()='Covid Cases']");
	By downloadcertificatelink = By.xpath("//a[text()='Download Certificate']");
	By Aboutlink = By.xpath("//span[text()='About']");
	By covidcasespageheading = By.xpath("//*/div/h5[text()='Covid Cases']");
	By vaccinefinderpageheading = By.xpath("//a[text()=' Vaccine Finder']");
	By Downloadpageheading = By.xpath("//*[text()='Download Certificate in Whatsapp']");
	By Aboutpageheading = By.xpath("//div/h5[text()='About']");
	By Cancelbutton = By.xpath("//button[text()='Cancel']");
	
	
	
	
	public void SearchState(String SearchInput) 
	{
		try {
			Select dropdown = new Select(driver.findElement(By.xpath("//*[@name='selectState']")));
			dropdown.selectByVisibleText(SearchInput);
		}catch (Exception e) {
			System.out.println("Exception Caught" + e.getMessage());
		}
		
	}
	
	public void SearchDistrict(String SearchInput) 
	{
		try {
			Select dropdown = new Select(driver.findElement(By.xpath("//*[@name='selectedDistrict']")));
			dropdown.selectByVisibleText(SearchInput);
		}catch (Exception e) {
			System.out.println("Exception Caught" + e.getMessage());
		}
		
		
	}
	
	public void Resetcurrentsearchbuttonvalidation()
	{
		try {
			driver.findElement(Resetsearchresultbutton).click();
		}catch (Exception e) {
			System.out.println("Exception Caught" + e.getMessage());
		}
	}
	
	public void Refreshbuttonvalidation()
	{
		try {
			driver.findElement(Refreshbutton).click();
		}catch (Exception e) {
			System.out.println("Exception Caught" + e.getMessage());
		}
	}
	
	
	
	public void refreshbarvalidation()
	{
		try {
			driver.findElement(Notificationbutton).click();
		}catch (Exception e) {
			System.out.println("Exception Caught" + e.getMessage());
		}
	}
	public void Notificationbuttonvalidation()
	{
		try {
			driver.findElement(Notificationbutton).click();
		}catch (Exception e) {
			System.out.println("Exception Caught" + e.getMessage());
		}
	}
	
	public void Covidcaseslinkvalidation()
	{
		try {
			driver.findElement(covidcaseslink).click();
			if(driver.findElement(covidcasespageheading).isDisplayed())
				System.out.println("Covidcaselink is validated");
			else
				System.out.println("Covidcase link is not working");
				
		}catch (Exception e) {
			
				
			System.out.println("Exception Caught" + e.getMessage());
		}
	}
	
	public void Refreshportal()
	{
		try {
			driver.findElement(vaccinefinderpageheading).click();
		}catch (Exception e) {
			System.out.println("Exception Caught" + e.getMessage());
		}
	}
	
	public void Downloadlinkvalidation()
	{
		try {
			driver.findElement(downloadcertificatelink).click();
			Thread.sleep(5000);
			if(driver.findElement(Downloadpageheading).isDisplayed())
			{
				System.out.println("Downloadlink is validated");
				driver.findElement(Cancelbutton).click();
			}
			else
				System.out.println("Download link is not working");
				
		}catch (Exception e) {
			
				
			System.out.println("Exception Caught" + e.getMessage());
		}
	}
	
	
	public void Aboutlinkvalidation()
	{
		try {
			driver.findElement(Aboutlink).click();
			Thread.sleep(5000);
			if(driver.findElement(Aboutpageheading).isDisplayed())
				System.out.println("About link is validated");
			else
				System.out.println("About link is not working");
				
		}catch (Exception e) {
			
				
			System.out.println("Exception Caught" + e.getMessage());
		}
	}


}

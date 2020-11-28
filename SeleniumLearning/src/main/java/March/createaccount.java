package March;
//package week2.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class createaccount {

	public static void main(String[] args) throws InterruptedException {
	
			 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			 
			ChromeDriver drivers = new ChromeDriver();
			 
			drivers.get("http://leaftaps.com/opentaps/control/login");
			
			drivers.manage().window().maximize();
			
			drivers.findElementById("username").sendKeys("demosalesmanager");
			drivers.findElementById("password").sendKeys("crmsfa");
			drivers.findElementByClassName("decorativeSubmit").click();
			drivers.findElementByLinkText("CRM/SFA").click();
			drivers.findElementByLinkText("Accounts").click();
			drivers.findElementByLinkText("Create Account").click();
			drivers.findElementByXPath("// *[@id='accountName'] ").sendKeys("Debit Limited Account");
			drivers.findElementByXPath("// *[@name='description'] ").sendKeys("Selenium Automation Tester");
			drivers.findElementByXPath("// *[@id='groupNameLocal'] ").sendKeys("Group Test");
			drivers.findElementByXPath("// *[@id='officeSiteName'] ").sendKeys("Site Test");
			drivers.findElementByXPath("//input[@id='annualRevenue']").sendKeys("100");
			WebElement eledropdown = drivers.findElementByClassName("titleCell");
			Select dropdown=new Select(eledropdown);
		    dropdown.selectByValue("3");
			
			
					

	}

}



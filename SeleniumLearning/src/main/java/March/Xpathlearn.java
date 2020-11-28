package March;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathlearn {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver1/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//To Load the URL
		System.out.println("hai");
		driver.get("http://leaftaps.com/opentaps/");
		WebElement vari=driver.findElementById("username");
		vari.sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativesubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//input[@class=\" x-form-text x-form-field \"]").sendKeys("gopi");
		driver.findElementByXPath("(//button[text()='Search'])").click();
		driver.findElementByXPath("//*[text()=\"10973\"]").click();
		
		
				

	}

}

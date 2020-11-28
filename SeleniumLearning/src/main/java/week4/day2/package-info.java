package week4.day2;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Acme {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 ChromeDriver drivers = new ChromeDriver();
	    	drivers.get("https://acme-test.uipath.com/account/login");
			drivers.manage().window().maximize();
			drivers.findElementById("email").sendKeys("kumar.testleaf@gmail.com",Keys.TAB);
			drivers.findElementById("password").sendKeys("leaf@12");
			drivers.findElementById("buttonLogin").click();
		    WebElement mousehvr = drivers.findElementByXPath("(//button[@type='button'])[6]");
			Actions builder=new Actions(drivers);
			builder.moveToElement(mousehvr).perform();
            drivers.findElementByLinkText("Search for Vendor").click();
            drivers.findElementById("vendorName").sendKeys("Blue Lagoon");
            drivers.findElementByXPath("//button[@id='buttonSearch']").click();
            String text = drivers.findElementByXPath("//table[@class='table']/tbody/tr[2]/td[5]").getText();
            System.out.println("Country Name:" + text);
            drivers.findElementByLinkText("Log Out").click();
            drivers.close();
}
}

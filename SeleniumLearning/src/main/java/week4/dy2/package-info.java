package week4.dy2;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Amazon {

	public static void main(String[] args) {
	        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			 ChromeDriver drivers = new ChromeDriver();
		    	drivers.get("https://www.amazon.in/");
				drivers.manage().window().maximize();
				drivers.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
				drivers.findElementById("twotabsearchtextbox").sendKeys("one plus 7 pro mobiles",Keys.ENTER);
				WebElement mobile = drivers.findElementByXPath("//span[@class='a-price-whole']");
				System.out.println(mobile.getText());
				drivers.findElementByXPath("//img[@class='s-image']").click();
				Set<String> winset = drivers.getWindowHandles();
				List<String> winset1 = new ArrayList<String>(winset);
				drivers.switchTo().window(winset1.get(1));
				WebElement mobile1 = drivers.findElementByXPath("//span[@id='acrCustomerReviewText']");
				System.out.println(mobile1.getText());
				drivers.findElementById("add-to-cart-button").click();
				WebElement mobile2 = drivers.findElementByXPath("//h4[@class='a-alert-heading']");
				System.out.println(mobile2.getText());
				drivers.findElementByLinkText("Proceed to Buy (1 item)").click();
				String Title=drivers.getTitle();
				System.out.println(Title);
				
}
}
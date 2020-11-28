package March;


import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownExample {

	public static void main(String[] args) {
	//To open the browser
		System.setProperty("webdriver.chrome.driver", "./driver1/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//To Load the URL
		System.out.println("hai");
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		System.out.println("hai");

		//Select  the dropdown
		//locate the element
		WebElement drop=driver.findElementById("dropdown");
//deal with dropdown - select class only
		//convert the web element to dropdown(select)
		Select dd=new Select(drop);
		//Perform the action
		//Select the one of the option from 3 ways
		  //using text(black)
		  //using value(blue)
		  //using index(number stars with 0)
		dd.selectByVisibleText("Appium");
		//dd.selectByValue("4");
		//dd.selectByIndex(1);
      //select multiple
		WebElement multiple = driver.findElementByXPath("(//Select[6])");
		Select mxp = new Select(multiple);
		mxp.selectByVisibleText("Selenium");
		mxp.selectByVisibleText("Loaddrunner");
		mxp.deselectAll(); 
		//ctrl+shift+forwardslash
		List<WebElement> options = mxp.getOptions();
		for(int i=0;i<options.size(); i++)
		{
			String text = options.get(i).getText();
		System.out.println(text);
		
		}
		
		
		

		
		
		
		

	}

}

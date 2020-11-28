package week4.day1;

public class Train {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		package week4.day1;

		import java.util.LinkedHashMap;
		import java.util.List;
		import java.util.Map;
		import java.util.concurrent.TimeUnit;
		import org.openqa.selenium.By;
		import org.openqa.selenium.Keys;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;

		public class Train {

			public static void main(String[] args) {
				System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
				ChromeDriver driver = new ChromeDriver(); // to launch chrome browser
				driver.get("https://erail.in/"); // to load the URL
				driver.manage().window().maximize(); // to maximize window
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.findElementById("txtStationFrom").clear();
				driver.findElementById("txtStationFrom").sendKeys("MAS", Keys.TAB);
				driver.findElementById("txtStationTo").clear();
				driver.findElementById("txtStationTo").sendKeys("BCT", Keys.TAB);
				driver.findElementById("buttonFromTo").click();
				WebElement checkdate = driver.findElementById("chkSelectDateOnly");
				if (checkdate.isSelected()) {
					checkdate.click();
				}
				WebElement table = driver.findElementByXPath("(//div[@id='divTrainsList']/table)[1]");
				List<WebElement> rowlist = table.findElements(By.tagName("tr"));
				Map<String, String> map = new LinkedHashMap<String,String>();
				
				
			}
		}
				}

	}

}

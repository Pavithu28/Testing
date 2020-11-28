package March;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//pavi_week1.day2
public class Login {
	public static void main(String[] args) {
				//To open the browser
				System.setProperty("webdriver.chrome.driver", "./driver1/chromedriver.exe");
				ChromeDriver driver = new ChromeDriver();
				//To Load the URL
				System.out.println("hai");
				driver.get("http://leaftaps.com/opentaps/");
				//To Maximize the window
				driver.manage().window().maximize();
				System.out.println("hai");
				//To fetch title
				String title = driver.getTitle();
				System.out.println(title);
				WebElement vari=driver.findElementById("username");
				vari.sendKeys("DemoSalesManager");
				driver.findElementById("password").sendKeys("crmsfa");
				driver.findElementByClassName("decorativesubmit").click();
				driver.findElementByLinkText("CRM/SFA").click();
				driver.findElementByLinkText("Leads").click();
				driver.findElementById("createLeadForm_companyName").sendKeys("XXX");
				driver.findElementById("createLeadForm_firstName").sendKeys("Pavithra");
				driver.findElementById("createLeadForm_lastName").sendKeys("K");
				//Click the create lead button
				driver.findElementByName("submitButton").click();
				
				driver.close();
			}

			}


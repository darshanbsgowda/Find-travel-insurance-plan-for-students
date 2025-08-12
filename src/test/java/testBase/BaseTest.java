package testBase;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
	
	public static WebDriver driver;
	public Properties p;
	
	@BeforeClass
	public void setup() throws IOException {
	FileReader file=new FileReader(".//src//test//resources//config.properties");
	 p=new Properties();
	 p.load(file); 
	 
	ChromeOptions options = new ChromeOptions();
	
	//EdgeOptions opt = new EdgeOptions();
	
	options.addArguments("--disable-blink-features=AutomationControlled");
	
	options.addArguments("--disable-notifications");
	
		switch(p.getProperty("browser").toLowerCase()) {
		
		case "chrome":
			driver=new ChromeDriver(options);
			break;
		
		case "edge": 
			System.setProperty("SE_DRIVER_MIRROR_URL", "https://msedgedriver.microsoft.com"); 
			driver=new EdgeDriver();
			break;
			
		case "firefox":
			driver=new FirefoxDriver();
			break;
		
		default:
			System.out.println("Invalid browser name..");
			return;
		}
		driver.get(p.getProperty("appURL"));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
		
	}
}

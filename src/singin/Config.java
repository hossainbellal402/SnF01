package singin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;


public class Config extends Webdriverfuntion {
	@BeforeSuite
	public void StartTime() {
		startCurrentTime();

		System.out.println(" This is start Currat Time +++++++++++ This call Before Suite mathod");

	}
	@BeforeMethod
	public void beforeEachTest() {
		System.setProperty( "webdriver.chrome.driver",  System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		driver= new ChromeDriver();                     


		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait( 45, TimeUnit.SECONDS);
		System.out.println (" chrome driver open ++++++++++++++++ ");
		// open browser	
		driver.get("http://www.booking.com");

	}
	@AfterMethod
	public void closeBrowersTest() {
		driver.close();
		System.out.println(" This id afterTest method<<<<<<<<<<<<<");
	}
	@AfterSuite
	public void QuiteBrowersTest() {
		driver.quit();  
		System.out.println("This is QuitBrowers Methord--------------");		  
	}

}

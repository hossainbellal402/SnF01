package singin;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Webdriverfuntion {


	WebDriver driver;


	public void startCurrentTime() {

		Date dt = new Date();
		SimpleDateFormat dateFormat;
		dateFormat = new SimpleDateFormat("kk:mm:ss");
		System.out.println("Time in 24 hr format = "+dateFormat.format(dt));

	}

	//	public String clickByXpath (String loc) {
	//		driver.findElement(By.xpath(loc)).click();
	//	}
	//	
	//	public String typeByXpath (String loc, String val) {
	//		driver.findElement(By.xpath(loc)).sendKeys(val);
}




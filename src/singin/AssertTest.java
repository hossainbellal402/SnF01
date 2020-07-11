package singin;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTest extends Config {
   
	
	@Test
	public void assertionPrec() {
//		String exp = "Sign in";
//		String act = driver.findElement(By.xpath("//*[@id=\"current_account\"]")).getText();
//		System.out.println ("my actual text is: " + act);
//		Assert.assertEquals(act, exp);

		
     String act = 	driver.findElement(By.xpath("//*[@id=\"current_account\"]")).getText();	
		
		String exp = "TalentTek Cunsoltin";
		Assert.assertEquals(act, exp);
		
		
		
		
		
	}
	
	
	
}

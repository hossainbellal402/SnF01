package singin;


import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Pratice extends Config {


	SignInUp signin = new SignInUp();

	@Test	
	public void signInTest() {
		//     	Tc- 1 : loging with valid credential 
		//		Tc -2 : Navigate to booking.com
		//		Tc -3 : click on signin link
		//		Tc - 4: enter Valid email address 
		//		Tc -4 : click  on next button
		//		Tc -5 : enter valid password
		//		Tc -6: click sign in button
		//		Tc -7 : varify if  user full name display or not


		System.out.println("loging with valid credential");
		driver.findElement(By.xpath( "//*[@id=\"current_account\"]")).click();
		driver.findElement(By.xpath( "//*[@id=\"username\"]")).sendKeys( "bil335310@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/div[2]/div/div/div/form/div[3]")).click();
		driver.findElement(By.xpath( "//*[@id=\"password\"]")).sendKeys( "9294994679b");
		driver.findElement(By.xpath( "//*[@id=\"root\"]/div/div[2]/div/div[1]/div[2]/div/div/div/form/button")).click();


	}

	@Test
	public void rigsterTest () {
		//		   Test Case For Register
		//		   Tc- 1 : Create an account to use Bookig.com
		//		   Tc -2 : Navigate to booking.com
		//		   Tc -3 : click on Register link
		//		   Tc - 4: enter Valid email address 
		//		   Tc -4 : click  on Get Started button
		//		   Tc -5 : enter Create password
		//		   Tc-6 : enter Confirm password
		//		   Tc -7: click in create account button
		//		   Tc -8 : varify if  user full name display or not

		System.out.println("Created account in bookig.com");
		driver.findElement(By.xpath( "//*[@id=\"current_account_create\"]")).click();
		driver.findElement(By.xpath( "//*[@id=\"login_name_register\"]")).sendKeys( "p.prassasing@gmail.com");
		driver.findElement(By.xpath( "//*[@id=\"root\"]/div/div[2]/div/div[1]/div[2]/div/div/div/form/button/span")).click();
		driver.findElement(By.xpath( "//*[@id=\"password\"]")).sendKeys( "9294994679b");
		driver.findElement(By.xpath( "//*[@id=\"confirmed_password\"]")).sendKeys( "9294994679b");
		driver.findElement(By.xpath( "//*[@id=\"root\"]/div/div[2]/div/div[1]/div[2]/div/div/div/form/button")).click();


	}

}



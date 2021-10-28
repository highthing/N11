package N11.N11Project;

import java.util.Random;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	
	@Test
	public void LoginTest() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ahmet\\eclipse-workspaceNew\\N11Project\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.n11.com/");
		driver.manage().window().maximize();
		
		
		LoginPage LP = new LoginPage(driver);
		Assert.assertEquals(LP.GirişYap.isDisplayed(), true);
		
		LP.GirişYap.click();
		LP.username.sendKeys("ahmet.solmaz.n11@gmail.com");
		LP.password.sendKeys("123Deneme-Sifre");
		LP.GirişYap().click();
		
		Assert.assertEquals(LP.LoginValidation.isDisplayed(), true);
		
		
	}
}

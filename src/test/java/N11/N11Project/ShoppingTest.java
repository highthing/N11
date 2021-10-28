package N11.N11Project;

import java.util.Random;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShoppingTest {
	
	WebDriver driver;

	@Test
	public void ShoppingTesting() {
		
		Login Log = new Login();
		Log.LoginTest();
		
		ShoppingPage SP = new ShoppingPage(driver);
		
		SP.SearchBox.sendKeys("bilgisayar");
		SP.SearchBox.sendKeys(Keys.ENTER);
		
		SP.PageTwo.click();
		Assert.assertEquals(SP.PageTwoValidation.isDisplayed(), true);
		
		Random rand = new Random();
		int i = rand.nextInt(9);		
		WebElement random_product = driver.findElement(By.xpath("(//div[@class=\"columnContent adBg\"])["+ i +"]"));
		String Price_1 = random_product.getAttribute("innerHTML");
		random_product.click();
		
		SP.SepeteEkle.click();
		
		SP.Sepetim.click();
		
		Assert.assertEquals(Price_1, SP.Price_2);
		
		SP.ÜrünArtır.click();
		
		Assert.assertEquals(SP.ÜrünSayisi.isDisplayed(), true);
		
		SP.Sil.click();
		
		Assert.assertEquals(SP.SepetinizBos.isDisplayed(), true);
		
		driver.quit();
		
	}
	
	
	
}

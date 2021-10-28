package N11.N11Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingPage {

	WebDriver driver;

	public ShoppingPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "(//input[@type=\"text\"])[1]")
	WebElement SearchBox;

	@FindBy(xpath = "(//a[@href=\"https://www.n11.com/arama?q=bilgisayar&pg=2\"])[1]")
	WebElement PageTwo;

	@FindBy(xpath = "//a[@class=\"active \"]")
	WebElement PageTwoValidation;

	@FindBy(xpath = "(//a[@title=\"Sepete Ekle\"])[1]")
	WebElement SepeteEkle;

	@FindBy(xpath = "//a[@title=\"Sepetim\"]")
	WebElement Sepetim;

	@FindBy(xpath = "(//span[contains(.,'6.999,99 TL')])[1]")
	WebElement Price_2;

	@FindBy(xpath = "//span[contains(.,'+')]")
	WebElement ÜrünArtır;

	@FindBy(xpath = "(//input[@value=\"2\"])[3]")
	WebElement ÜrünSayisi;

	@FindBy(xpath = "//span[contains(.,'Sil')]")
	WebElement Sil;

	@FindBy(xpath = "//*[contains(text(),'Sepetiniz Boş')]")
	WebElement SepetinizBos;
	
	

	
public WebElement SepetinizBos() {
		
		return SepetinizBos;
	 
		
	}
	
public WebElement Sil() {
		
		return Sil;
	 
		
	}
	
public WebElement ÜrünSayisi() {
		
		return ÜrünSayisi;
	 
		
	}
	
public WebElement ÜrünArtır() {
		
		return ÜrünArtır;
	 
		
	}
	
	
public WebElement Price_2() {
		
		return Price_2;
	 
		
	}
	
	
public WebElement Sepetim() {
		
		return Sepetim;
	 
		
	}
	
public WebElement SepeteEkle() {
		
		return SepeteEkle;
	 
		
	}
	
public WebElement PageTwoValidation() {
		
		return PageTwoValidation;
	 
		
	}
	
public WebElement PageTwo() {
		
		return PageTwo;
	 
		
	}
	
public WebElement SearchBox() {
		
		return SearchBox;
	 
		
	}

}

package N11.N11Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	@FindBy(xpath="//input[@type=\"text\"]")
	WebElement username;
	
	@FindBy(xpath="//input[@type=\"password\"]")
	WebElement password;
	
	@FindBy(id="loginButton")
	WebElement loginButton;
	
	@FindBy(xpath="//a[contains(.,'Giriş Yap')]")
	WebElement GirişYap;
	
	@FindBy(xpath="//*[contains(text(),'Ahmet Solmaz')]")
	WebElement LoginValidation;
	
	
	
	
	
public WebElement LoginValidation() {
		
		return LoginValidation;
	 
		
	}
	
	public WebElement Emailid() {
		
		return username;
	 
		
	}
	
	public WebElement Password() {
		
		return password;
		
	}
	
	public WebElement loginButton() {
		
		
		return loginButton;
		
	}
	
	public WebElement GirişYap() {
		
		return GirişYap;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}

package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ConfigReader;
import utilities.Driver;

public class Login extends BasePage {
	
	    
    public Login()  {
		super();
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//input[@aria-label='Phone number, username, or email']")
    public WebElement username;
    
    @FindBy(xpath = "//input[@aria-label='Password']")
    public WebElement password;
    
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginBtn;
    
    
    public void navigateToInstagram()  {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        Driver.getDriver().navigate().refresh();
    }
    
    public void enterLoginCredentials() {
    	username.sendKeys(ConfigReader.getProperty("DelegatedUserEmail"));
    	password.sendKeys(ConfigReader.getProperty("DelegatedUserPassword"));
    }
    
    public void clickLoginButton() {
    	loginBtn.click();
  }
    
    public void loginInstagram()  {
    	
    	navigateToInstagram();
    	waitFor(1);
    	enterLoginCredentials();
    	waitFor(1);
    	clickLoginButton();
    	waitFor(1);
    	if(notNowButton.isDisplayed()) {
    	clickNotNow();
    	}

    	
    }
    






}

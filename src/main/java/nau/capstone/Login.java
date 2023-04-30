package nau.capstone;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ConfigReader;
import utilities.Driver;

public class Login {
	
	public Login() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
	Actions action = new Actions(Driver.getDriver());
    JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
    Driver driver= new Driver();
    
    @FindBy(xpath = "//input[@aria-label='Phone number, username, or email']")
    public WebElement username;
    
    @FindBy(xpath = "//input[@aria-label='Password']")
    public WebElement password;
    
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginBtn;
    
    
    public void navigateToInstagram() {

        Driver.getDriver().get(ConfigReader.getProperty("url"));
        Driver.getDriver().navigate().refresh();
    }
    
    public void loginInstagram() {
    	
    	navigateToInstagram();
    	
    	
    	
    	
}
    






}

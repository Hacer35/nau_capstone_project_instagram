package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import utilities.ConfigReader;
import utilities.Driver;

public class NewPost {
	
	public NewPost() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
	Actions action = new Actions(Driver.getDriver());
    JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
    Driver driver= new Driver();
       
    @FindBy(xpath = "//button[text()='Select from computer']")
    public WebElement selectFromComputerButton; //h1//div[text()='Crop']
    
    
    @FindBy(xpath = "//h1//div[text()='Crop']")
    public WebElement cropTitle; 
    
    @FindBy(xpath = "//*[@aria-label='Open media gallery']/../..button")
    public WebElement openMediaGallery;    
    @FindBy(xpath = "//div[text()='Next']")
    public WebElement nextButton;    
    @FindBy(xpath = "//button[text()='Back']")
    public WebElement backButton;    
    @FindBy(xpath = "//button[text()='Discard']")
    public WebElement discardButton; 
    @FindBy(xpath = "//button[text()='Select zoom']")
    public WebElement selectZoomButton;    
    @FindBy(xpath = "//button[text()='Select crop']")
    public WebElement selectCropButton;
    
    @FindBy(xpath = "//h1//div[text()='Edit']")
    public WebElement editTitle; 
    
    @FindBy(xpath = "//span[text()='Filters']")
    public WebElement filtersButton;
    @FindBy(xpath = "//div[text()='Original']/parent::button")
    public WebElement original;
    @FindBy(xpath = "//div[text()='Clarendon']/parent::button")
    public WebElement clarendon;
    @FindBy(xpath = "//div[text()='Gingham']/parent::button")
    public WebElement gingham;
    @FindBy(xpath = "//div[text()='Moon']/parent::button")
    public WebElement moon;
    @FindBy(xpath = "//div[text()='Lark']/parent::button")
    public WebElement lark;
    @FindBy(xpath = "//div[text()='Reyes']/parent::button")
    public WebElement reyes;
    @FindBy(xpath = "//div[text()='Juno']/parent::button")
    public WebElement juno;
    @FindBy(xpath = "//div[text()='Slumber']/parent::button")
    public WebElement slumber;
    @FindBy(xpath = "//div[text()='Crema']/parent::button")
    public WebElement crema;
    @FindBy(xpath = "//div[text()='Ludwig']/parent::button")
    public WebElement ludwig;
    @FindBy(xpath = "//div[text()='Aden']/parent::button")
    public WebElement aden;
    @FindBy(xpath = "//div[text()='Perpetua']/parent::button")
    public WebElement perpetua;
    
    @FindBy(xpath = "//span[text()='Adjustments']")
    public WebElement adjustmentsButton; 
    @FindBy(xpath = "//span[text()='Brightness']")
    public WebElement brightness;
    @FindBy(xpath = "//span[text()='Contrast']")
    public WebElement contrast;
    @FindBy(xpath = "//span[text()='Saturation']")
    public WebElement saturation;
    @FindBy(xpath = "//span[text()='Temperature']")
    public WebElement temperature;
    @FindBy(xpath = "//span[text()='Fade']")
    public WebElement fade;
    @FindBy(xpath = "//span[text()='Vignette']")
    public WebElement vignette;
    
    @FindBy(xpath = "//h1//div[text()='Create new post']")
    public WebElement createNewPostTitle;
    @FindBy(xpath = "//h1//div[text()='Create new reel']")
    public WebElement createNewReelTitle;
    
    @FindBy(xpath = "//div[text()='Share']")
    public WebElement shareButton; 
    @FindBy(xpath = "//*[@aria-label='Write a caption...']")
    public WebElement writeACaption; 
    @FindBy(xpath = "//*[@aria-label='Emoji']")
    public WebElement emoji; 
    @FindBy(xpath = "//input[@placeholder='Add location']")
    public WebElement addLocation; 
    @FindBy(xpath = "//span[text()='Accessibility']")
    public WebElement accessibility; 
    @FindBy(xpath = "//span[text()='Advanced settings']")
    public WebElement advancedSettings; 
    @FindBy(xpath = "//span[text()='Your post has been shared.']")
    public WebElement successMsg; 
    @FindBy(xpath = "//*[@aria-label='Close']")
    public WebElement closeButton;  
    @FindBy(xpath = "//*[@aria-label='Plus icon']")
    public WebElement plusIconButton; 
    @FindBy(xpath = "(//button[@aria-label='Next'])[1]")
    public WebElement nextButtonOnPost; 
    
    @FindBy(xpath = "//article[1]//a[text()='naucapstone2023']")
    public WebElement firstArticlePost;  
    @FindBy(xpath = "(//article[1]//a)[2]")
    public WebElement firstArticlePostText;  
    
    
    public void uploadPicture() {
    	selectFromComputerButton.sendKeys("nau_capstone_project_instagram/src/test/java/resources/newPostTestPic1");
    }
    public void completeUploadingPicture() {
    	uploadPicture();
    	Assert.assertTrue(cropTitle.isDisplayed());
    	clickNext();
    	Assert.assertTrue(editTitle.isDisplayed());
    	clickNext();
    	Assert.assertTrue(createNewPostTitle.isDisplayed());
    	clickShare();
    }
    public void verifyUploadedNewPost() {
    	Assert.assertTrue(successMsg.isDisplayed());
    	clickClose();
    	Assert.assertTrue(firstArticlePost.isDisplayed());
    	Assert.assertEquals(firstArticlePostText.getText(), ConfigReader.getProperty("profileName"));
    }
    public void verifyUploadedNewMultiplePost() {
    	Assert.assertTrue(successMsg.isDisplayed());
    	clickClose();
    	Assert.assertTrue(firstArticlePost.isDisplayed());
    	Assert.assertEquals(firstArticlePostText.getText(), ConfigReader.getProperty("profileName"));
    	Assert.assertTrue(nextButtonOnPost.isDisplayed());
    }
    public void uploadRecording() {
    	selectFromComputerButton.sendKeys("nau_capstone_project_instagram/src/test/java/resources/newPostTestVideo");
    }
    public void completeUploadingRecording() {
    	uploadRecording();
    	Assert.assertTrue(cropTitle.isDisplayed());
    	clickNext();
    	Assert.assertTrue(editTitle.isDisplayed());
    	clickNext();
    	Assert.assertTrue(createNewReelTitle.isDisplayed());
    	clickShare();
    }
    public void uploadMultiplePosts() {
    	selectFromComputerButton.sendKeys("nau_capstone_project_instagram/src/test/java/resources/newPostTestPic1");
    	plusIconButton.sendKeys("nau_capstone_project_instagram/src/test/java/resources/newPostTestPic2");
    	plusIconButton.sendKeys("nau_capstone_project_instagram/src/test/java/resources/newPostTestPic3");
    }
    public void completeUploadingMultiplePosts() {
    	uploadMultiplePosts();
    	Assert.assertTrue(cropTitle.isDisplayed());
    	clickNext();
    	Assert.assertTrue(editTitle.isDisplayed());
    	clickNext();
    	Assert.assertTrue(createNewPostTitle.isDisplayed());
    	clickShare();
    }
  
    public void verifyNewPostActionButtons() {
    	verifyCropSection();
    	clickNext();
    	verifyEditSection(); 
    	clickNext();
    	verifyCreateNewPostSection();
    }
 public void verifyCropSection() {    	
    	Assert.assertTrue(cropTitle.isDisplayed());
    	 Assert.assertTrue(openMediaGallery.isEnabled());
    	 Assert.assertTrue(nextButton.isEnabled());
    	 Assert.assertTrue(backButton.isEnabled());
    	 Assert.assertTrue(selectZoomButton.isEnabled());
    	 Assert.assertTrue(selectCropButton.isEnabled());
    	 
    }
    public void clickNext() {
    	nextButton.click();
    }
    public void clickBack() {
    	backButton.click();
    }
    public void clickShare() {
    	shareButton.click();
    }
    public void clickClose() {
    	closeButton.click();
    }
    public void clickDiscard() {
    	discardButton.click();
    }
    public void verifyEditSection() {  
    	Assert.assertTrue(editTitle.isDisplayed());
		Assert.assertTrue(backButton.isEnabled());
		Assert.assertTrue(nextButton.isEnabled());
		verifyFiltersOptions();
		verifyAdjustmentsOptions();
    }
    	public void verifyFiltersOptions() {
    		filtersButton.click();
    		Assert.assertTrue(original.isEnabled());
    		Assert.assertTrue(clarendon.isEnabled());
    		Assert.assertTrue(gingham.isEnabled());
    		Assert.assertTrue(moon.isEnabled());
    		Assert.assertTrue(lark.isEnabled());
    		Assert.assertTrue(reyes.isEnabled());
    		Assert.assertTrue(juno.isEnabled());
    		Assert.assertTrue(slumber.isEnabled());
    		Assert.assertTrue(crema.isEnabled());
    		Assert.assertTrue(ludwig.isEnabled());
    		Assert.assertTrue(aden.isEnabled());
    		Assert.assertTrue(perpetua.isEnabled());
   	 
    	}
    	public void verifyAdjustmentsOptions() {
    		adjustmentsButton.click();
    		Assert.assertTrue(brightness.isDisplayed());
    		Assert.assertTrue(contrast.isDisplayed());
    		Assert.assertTrue(saturation.isDisplayed());
    		Assert.assertTrue(temperature.isDisplayed());
    		Assert.assertTrue(fade.isDisplayed());
    		Assert.assertTrue(vignette.isDisplayed());
   	 
    	}
    	public void verifyCreateNewPostSection() {  
        	Assert.assertTrue(createNewPostTitle.isDisplayed());
    		Assert.assertTrue(backButton.isEnabled());
    		Assert.assertTrue(shareButton.isEnabled());
    		Assert.assertTrue(writeACaption.isDisplayed());
    		Assert.assertTrue(emoji.isDisplayed());
    		Assert.assertTrue(addLocation.isDisplayed());
    		Assert.assertTrue(accessibility.isDisplayed());
    		Assert.assertTrue(advancedSettings.isDisplayed());
    		
        }
    	
    	public void verifyNotCreatingNewPost() {  
    		uploadPicture();
    		Assert.assertTrue(cropTitle.isDisplayed());
	         clickNext();
	         Assert.assertTrue(editTitle.isDisplayed());
	         clickNext();
	         Assert.assertTrue(createNewReelTitle.isDisplayed());
	         clickBack();
	         Assert.assertTrue(editTitle.isDisplayed());
	         clickBack();
	         Assert.assertTrue(cropTitle.isDisplayed());
	         clickBack();
	         clickDiscard();
	         clickClose();	         
	         
    	}

}

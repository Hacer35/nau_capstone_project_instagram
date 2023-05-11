package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;

import java.util.concurrent.TimeUnit;

public class Driver {

    public Driver() {
    }
    static private WebDriver driver;

    static public WebDriver getDriver()  {
        if (driver == null) {
            switch (ConfigReader.getProperty("browser")) {
                case "chrome":
                	ChromeOptions opt = new ChromeOptions();
                	opt.addArguments("--remote-allow-origins=*");
                	driver = new ChromeDriver(opt);
                	System.out.println(driver.getTitle());
                	
//                    WebDriverManager.chromedriver().setup();
//                    driver = new ChromeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                case "edge":
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                    break;
            }
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }

    static public void closeDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }

    }

    @AfterTest
    public void tearDown() throws InterruptedException {
        if (driver != null) {
            driver.quit();
            driver = null;
//             Thread.sleep(3000);
        }

    }

}
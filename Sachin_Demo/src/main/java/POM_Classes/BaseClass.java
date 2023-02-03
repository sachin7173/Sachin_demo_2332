package POM_Classes;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseClass {
public static WebDriver driver;
public static void openBrowser() throws IOException {
	System.setProperty("webdriver.chrome.driver","C:\\automation\\Sachin_Demo\\src\\test\\resources\\Browsers\\chromedriver.exe");
    ChromeOptions option=new ChromeOptions();
    option.addArguments("--disable-notifications");
    driver=new ChromeDriver(option);
    
    
    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
    driver.manage().window().maximize();
    driver.get(UtilityClass.getPropertyFileData("url"));
}
}

package POM_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(xpath="(//summary[@class='Header-link'])[2]")private WebElement accountbtn;
	
	@FindBy(xpath="//strong[text()='sachin7173']")private WebElement verifyusername;
@FindBy(xpath="(//a[@class='btn btn-sm btn-primary'])[1]") private WebElement createnewBtn;
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void accountbtn() {
		accountbtn.click();
	}
	public String verifyUsername() {
		String actResult = verifyusername.getText();
		return actResult;
	}
	public boolean verifycreatenewBtn22() {
		boolean result = createnewBtn.isEnabled();
		return result;
		
	}

}

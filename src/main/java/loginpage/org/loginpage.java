package loginpage.org;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import baseclass.java.baseclass;

public class loginpage extends baseclass{
	public loginpage() {
		PageFactory.initElements(driver, this);
	}
	
@FindBy(id="email")
private WebElement txtUsername;
@FindBy(id="pass")
private WebElement txtpassword;
@FindBy(name="login")
private WebElement btnlogin;
public WebElement getTxtUsername() {
	return txtUsername;
}
public WebElement getTxtpassword() {
	return txtpassword;
}
public WebElement getBtnlogin() {
	return btnlogin;
}
//	@CacheLookup
	
//	@FindBys({@FindBy(id="email"),
//	@FindBy(xpath="//input[@name='email']")})
//	private List<WebElement> txtUsername;
//	@FindAll({@FindBy(id="pass"),
//		@FindBy(xpath="//input[@name='pass']")})
//	private WebElement txtpassword;
//	@FindBy(name="login")
//	private WebElement btnlogin;
//	public List<WebElement> getTxtUsername() {
//		return txtUsername;
//	}
//	public WebElement getTxtpassword() {
//		return txtpassword;
//	}
//	public WebElement getBtnlogin() {
//		return btnlogin;
//	}


	
}

	
	
	
	

	
	
	
	

	
	
	



	


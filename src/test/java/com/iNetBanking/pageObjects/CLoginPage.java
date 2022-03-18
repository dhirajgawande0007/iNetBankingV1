package com.iNetBanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CLoginPage {

	WebDriver driver;
	
	public CLoginPage(WebDriver driver){
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="uid")
	private WebElement usernameTextField;
	
	@FindBy(name="password")
	private WebElement passwordTextField;
	
	@FindBy(name="btnLogin")
	private WebElement loginButton;
	
	@FindBy(xpath="//a[contains(text(),'Log out')]")
	private WebElement logOutButton;
	
	public void setUsername(String uname) {
		usernameTextField.sendKeys(uname);
	}
	
	public void setPassword(String pwd) {
		passwordTextField.sendKeys(pwd);
	}
	
	public void clickOnLoginButton() {
		loginButton.click();
	}

	public void clickOnLogoutButton() {
		logOutButton.click();
	}
}

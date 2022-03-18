package com.iNetBanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage{

	WebDriver driver;
	
	public AddCustomerPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}

	@FindBy(how = How.XPATH, using ="//ul//a[contains(text(),'New Customer')]")
	private WebElement lnkNewCustomer;
	
	@FindBy(how= How.NAME, using="name")
	private WebElement customerNameTextbox;
	
	@FindBy(how= How.NAME, using="rad1")
	private WebElement genderRadioButton;
	

	@FindBy(how= How.ID_OR_NAME, using="dob")
	private WebElement dateOfBirthDatePicker;

	@FindBy(how= How.NAME, using="addr")
	private WebElement addressTextbox;

	@FindBy(how= How.NAME, using="city")
	private WebElement cityTextbox;
	
	@FindBy(how= How.NAME, using="state")
	private WebElement stateTextbox;
	
	@FindBy(how= How.NAME, using="pinno")
	private WebElement pinTextbox;
	
	@FindBy(how= How.NAME, using="telephoneno")
	private WebElement telephoneNoTextbox;
	
	@FindBy(how= How.NAME, using="emailid")
	private WebElement emailIDTextbox;
	
	@FindBy(how = How.CSS, using="input[name='sub']")
	private WebElement submitButton;
	
	public void clickAddNewCustomer() {
		lnkNewCustomer.click();
			
	}

	public void custName(String cname) {
		customerNameTextbox.sendKeys(cname);
		
	}

	public void custgender(String cgender) {
		genderRadioButton.click();
	}

	public void custdob(String mm,String dd,String yy) {
		dateOfBirthDatePicker.sendKeys(mm);
		dateOfBirthDatePicker.sendKeys(dd);
		dateOfBirthDatePicker.sendKeys(yy);
		
	}

	public void custaddress(String caddress) {
		addressTextbox.sendKeys(caddress);
	}

	public void custcity(String ccity) {
		cityTextbox.sendKeys(ccity);
	}

	public void custstate(String cstate) {
		stateTextbox.sendKeys(cstate);
	}

	public void custpinno(String cpinno) {
		pinTextbox.sendKeys(String.valueOf(cpinno));
	}

	public void custtelephoneno(String ctelephoneno) {
		telephoneNoTextbox.sendKeys(ctelephoneno);
	}

	public void custemailid(String cemailid) {
		emailIDTextbox.sendKeys(cemailid);
	}

	public void custpassword(String cpassword) {
		//txtpassword.sendKeys(cpassword);
	}

	public void custsubmit() {
		submitButton.click();
	}
}

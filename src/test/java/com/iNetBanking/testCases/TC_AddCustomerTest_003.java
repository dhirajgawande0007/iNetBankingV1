package com.iNetBanking.testCases;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.iNetBanking.pageObjects.AddCustomerPage;
import com.iNetBanking.pageObjects.CLoginPage;

public class TC_AddCustomerTest_003 extends BaseClass{

	@Test
	public void addNewCustomer() throws InterruptedException, IOException {
		CLoginPage lp = new CLoginPage(driver);
		lp.setUsername(username);
		lp.setPassword(password);
		lp.clickOnLoginButton();
		
		
		Thread.sleep(3000);
		AddCustomerPage addCust = new AddCustomerPage(driver);
		addCust.clickAddNewCustomer();
		addCust.custName("Dhiraj Gawande");
		addCust.custgender("male");
		addCust.custdob("10","15", "1985");
		Thread.sleep(3000);
		addCust.custaddress("India");
		addCust.custcity("Pune");
		addCust.custstate("MH");
		addCust.custpinno("411018");
		addCust.custtelephoneno("0123456789");
		addCust.custemailid(randomString()+"@testmail.lcl");
		addCust.custsubmit();
		
		Thread.sleep(3000);
		if(driver.getPageSource().contains("Customer Registered Successfully!!!")) {
			Assert.assertTrue(true);
		}else {
			captureScreen(driver,"AddCustomerTest");
			Assert.assertTrue(false);
		}
	}

}

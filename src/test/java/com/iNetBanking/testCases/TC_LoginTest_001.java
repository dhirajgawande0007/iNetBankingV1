package com.iNetBanking.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.iNetBanking.pageObjects.CLoginPage;

public class TC_LoginTest_001 extends BaseClass{

	@Test
	public void loginTest() throws IOException {
		
		CLoginPage lp = new CLoginPage(driver);
		lp.setUsername(username);
		lp.setPassword(password);
		lp.clickOnLoginButton();
		if(driver.getTitle().equals("GTPL Bank Manager HomePage")) {
			Assert.assertTrue(true);
		}else {
			captureScreen(driver,new Object() {}.getClass().getEnclosingMethod().getName());
			Assert.assertTrue(false);
		}
	}
	
}

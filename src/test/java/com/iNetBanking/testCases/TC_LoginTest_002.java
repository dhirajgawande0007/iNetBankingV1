package com.iNetBanking.testCases;

import java.io.IOException;

import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.iNetBanking.pageObjects.CLoginPage;
import com.iNetBanking.utilities.XLUtils;


public class TC_LoginTest_002 extends BaseClass{

	@Test(dataProvider="LoginData")
	public void loginDDT(String user, String pwd) {
		CLoginPage lp = new CLoginPage(driver);
		lp.setUsername(user);
		lp.setPassword(pwd);
		lp.clickOnLoginButton();
		
		if(isAlertPresent() == true) {
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
			Assert.assertTrue(false);
		}else {
			Assert.assertTrue(true);
			lp.clickOnLogoutButton();
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
		}
	}
	
	public boolean isAlertPresent() {
		try {
			driver.switchTo().alert();
			return true;
		}catch(NoAlertPresentException e){
			return false;
		}
	}
	
	@DataProvider(name="LoginData")
	String[][] getData() throws IOException{
		String path = System.getProperty("user.dir")+"/src/test/java/com/iNetBanking/testData/loginData.xlsx";
		int rowNum = XLUtils.getRowCount(path, "Sheet1");
		int colNum = XLUtils.getCellCount(path, "Sheet1",1);
		String loginData[][] = new String[rowNum][colNum];
		
		for(int i =1 ; i<=rowNum ; i++) {
			for(int j = 0; j<colNum ; j++) {
				loginData[i-1][j] = XLUtils.getCellData(path, "Sheet1",i,j);
			}
		}
		return loginData;
	}
}

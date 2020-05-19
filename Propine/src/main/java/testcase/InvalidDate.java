package testcase;

import org.testng.annotations.Test;

import page.HomePageValidation;

import seleniumBase.SelBase;

public class InvalidDate extends SelBase{
	
	@Test()
	public void dateFieldValidation() {
		new HomePageValidation().enterDate().clickSubmit().verifyResults();
	}

}

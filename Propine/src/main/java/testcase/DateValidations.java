package testcase;

import org.testng.annotations.Test;

import page.HomePage;
import seleniumBase.ProjectSpecificMethod;

public class DateValidations extends ProjectSpecificMethod{
	
	@Test(dataProvider="sendData")
	public void dateFieldValidation(String date) {
		new HomePage().enterDate(date).clickSubmit().verifyResults();
	}

}

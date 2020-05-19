package page;

import seleniumBase.ProjectSpecificMethod;

public class HomePage extends ProjectSpecificMethod{
	
	public HomePage enterDate(String date) {
		driver.findElementByXPath("//input[@name='date']").sendKeys(date);
		return this;
	}

	public HomePage clickSubmit() {
		driver.findElementByXPath("//input[@type='submit']").click();
		return this;
	}
public HomePage verifyResults() {
	String results= driver.findElementByXPath("(//div[@class='row']/div)[2]/div").getText();
	System.out.println(results);
	return this;
}





}

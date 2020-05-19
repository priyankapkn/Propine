package page;


import seleniumBase.SelBase;

public class HomePageValidation extends SelBase{
	
	public HomePageValidation enterDate() {
		driver.findElementByXPath("//input[@name='date']").sendKeys("12@1@19");
		return this;
	}

	public HomePageValidation clickSubmit() {
		driver.findElementByXPath("//input[@type='submit']").click();
		return this;
	}
public HomePageValidation verifyResults() {
	String results= driver.findElementByXPath("(//div[@class='row']/div)[2]/div").getText();
	if(results=="Invalid date")
	{
		System.out.println("Test passed");
	}
	else {
		System.out.println("Test failed");
	}
	return this;
}





}

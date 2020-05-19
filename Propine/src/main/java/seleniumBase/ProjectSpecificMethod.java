package seleniumBase;


import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class ProjectSpecificMethod {
	public static ChromeDriver driver;
	
	
	@BeforeMethod
	public void login() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	   driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vast-dawn-73245.herokuapp.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@DataProvider
	public String[] sendData() throws IOException{
		String[] read=new String[10];
		read[0]="12/5/1990";
		read[1]="1990/12/5";
		read[2]="19/12/2019";
		read[3]="121/5/2120";
		read[4]="2/555/2020";
		read[5]="4/31/2020";
		read[6]="12@1@19";
		read[7]="0012/0000005/000000002019";
		read[8]="                                                                             12/5/1990";
		read[9]="twelvemay2020";
		
		return read;
		
	}

	@AfterMethod
	public void close() {
		driver.close();
	}
}

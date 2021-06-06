package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBasicClass {

	public static void main(String[] args) {
		
		//WebDriver driver = new WebDriver(); // we can't write this because we can't create object of Interface.
		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://testsite.com");
		driver.manage().window().maximize();
		
		
		

	}

}

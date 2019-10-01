package Browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Drivers {
		public static WebDriver getdriver(String browser) {
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\DriverFolders\\chromedriver.exe" );
			return new ChromeDriver();
		}
		else if(browser.equals("ie")) {
			System.setProperty("webdriver.ie.driver","C:\\DriverFolders\\IEDriverServer.exe" );
			return new InternetExplorerDriver();
		}
		else  if(browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver","C:\\DriverFolders\\geckodriver.exe" );
			return new FirefoxDriver();
		}
		return null;
	}

}

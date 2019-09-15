package demo;

import java.net.URL;
import java.net.MalformedURLException;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BasicTestOnCloud {

	public static final String USERNAME = "spuranik12";
	public static final String ACCESS_KEY = "1504c700-1ed3-44e7-9a97-e2b42c638869";
	public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		
		//DesiredCapabilities caps = DesiredCapabilities.chrome();
		
		
		/*MutableCapabilities sauceOptions = new MutableCapabilities();
		sauceOptions.setCapability("screenResolution", "1024x768"); */
		
		DesiredCapabilities caps = new DesiredCapabilities();
		
		ChromeOptions browserOptions = new ChromeOptions();
		browserOptions.merge(caps);

		//browserOptions.setExperimentalOption("w3c", true);
		browserOptions.setCapability("browserName", "chrome");
		browserOptions.setCapability("platformName", "Windows 7");
		browserOptions.setCapability("browserVersion", "50.0");
		browserOptions.setCapability("screenResolution", "1024x768");

		WebDriver driver = new RemoteWebDriver(new URL(URL), browserOptions);
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
	}

}

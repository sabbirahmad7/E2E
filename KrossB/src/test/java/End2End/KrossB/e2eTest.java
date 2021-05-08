package End2End.KrossB;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
//import org.openqa.selenium.remote.DesiredCapabilities;

public class e2eTest {
	
	public String URL = "saucelabs url";
	public WebDriver driver;
	
	@BeforeClass
	@Parameters({"browser","version","platform"})
	public void setup(String br, String vr, String pf) {
		
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability("browserName", br);
		cap.setCapability("version",vr);
		cap.setCapability("platform",pf);
		
		driver = new RemoteWebDriver (new URL(URL),cap);
	}
	
	@Test
	public void loginfb() {
		driver.get("https://www.facebook.com");
		driver.getTitle();
	}

}
